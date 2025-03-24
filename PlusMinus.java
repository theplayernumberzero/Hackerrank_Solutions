import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double negative = 0;
        double positive = 0;
        double zero = 0;
        double size = arr.size();
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i)>0){
                positive++;
            }else if(arr.get(i)<0){
                negative++;
            }else{
                zero++;
            }
        }
        System.out.printf("%.6f%n", positive/size);
        System.out.printf("%.6f%n", negative/size);
        System.out.printf("%.6f%n", zero/size);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
