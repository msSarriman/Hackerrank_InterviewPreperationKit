import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> aLetterSet = new HashSet<>();
        Set<Character> bLetterSet = new HashSet<>();

        // Populate the sets
        for (int i = 0; i < s1.length(); i++)
            aLetterSet.add(s1.charAt(i));

        for (int i = 0; i < s2.length(); i++)
            bLetterSet.add(s2.charAt(i));

        // Perform the intersection of the two sets
        aLetterSet.retainAll(bLetterSet);

        if (aLetterSet.size() > 0)
            //System.out.println("YES");
            return "YES";
        else
            //System.out.println("NO");
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
