import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution{
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
        
    long sum = 0;
    
    for(int i = 0; i< arr.size();i++){
        if(arr.get(i)<min){
            min = arr.get(i);
        }
        if(arr.get(i)>max){
            max = arr.get(i);
        }
        sum += arr.get(i);
    }
    
    long sum_min = sum - max;
    long sum_max = sum - min;
    
    System.out.print(sum_min + " " + sum_max);
}

public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
