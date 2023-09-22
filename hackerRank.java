import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

public static String hackerrankInString(String s, String h, int sIndex, int hIndex) {
    
    if (hIndex == h.length()) {
        return "YES";
    }

    // If we've reached the end of 's' but haven't matched all of 'k', return "NO."
    if (sIndex == s.length()) {
        return "NO";
    }

    // Check if the current characters match
    if (s.charAt(sIndex) == h.charAt(hIndex)) {
        // increment indices and continue.
        return hackerrankInString(s, h, sIndex + 1, hIndex + 1);
    } else {
        //  increment 's' index and goTo next char in 's'.
        return hackerrankInString(s, h, sIndex + 1, hIndex);
    }
}


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s,"hackerrank",0,0);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
