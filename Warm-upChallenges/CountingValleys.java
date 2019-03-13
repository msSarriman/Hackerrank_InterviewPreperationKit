import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int numOfValleys = 0;
        boolean flag = false;
        int height = 0;
        for (int i = 0; i<n; i++){
            if (!flag && s.charAt(i) == 'D' && height == 0) {
                flag = true;
            }
            if (s.charAt(i) == 'D')
                height--;
            else
                height++;
            if (flag && s.charAt(i) == 'U' && height == 0){
                flag = false;
                numOfValleys += 1;
            }
        }
        return numOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
