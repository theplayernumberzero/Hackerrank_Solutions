import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int starting_point_of_apple = a;
        int starting_point_of_orange = b;
        int sam_house_start = s;
        int sam_house_end = t;
        
        int apples_on_filed = 0;
        int oranges_on_filed = 0;
        
        for(int i = 0; i < apples.size();i++){
            if(starting_point_of_apple + apples.get(i) >= sam_house_start && starting_point_of_apple + apples.get(i) <= sam_house_end){
                apples_on_filed++;
            }
        }
        for(int i = 0; i < oranges.size();i++){
            if(starting_point_of_orange + oranges.get(i) >= sam_house_start && starting_point_of_orange + oranges.get(i) <= sam_house_end){
                oranges_on_filed++;
            }
        }
        
        System.out.println(apples_on_filed);
        System.out.println(oranges_on_filed);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}