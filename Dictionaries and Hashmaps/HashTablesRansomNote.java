import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> noteMap = new HashMap<>();
        int wordsNeed = 0;
        for (String i : note){
            if (noteMap.containsKey(i)){
                noteMap.put(i, noteMap.get(i)+1);
                wordsNeed++;
            } else {
                noteMap.put(i, 1);
                wordsNeed++;
            }
        }
        for (String i : magazine){
            if (noteMap.containsKey(i) && noteMap.get(i) != 0) {
                noteMap.put(i, noteMap.get(i)-1);
                wordsNeed--;
            }
            if (wordsNeed == 0) {
                System.out.println("Yes");
                return;
            }
        }
        if (wordsNeed != 0) {
            System.out.println("No");
        }
        return;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
