import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String input = sc.next();
            String word = sc.next();
            String currentAns = "";
            int c = 0;
            for (int j = 0; j < input.length(); j++){
                String current = input.substring(j, j+1);
                String currentW = word.substring(c, c+1);
                if (current.equals(currentW)){
                    c++;
                } else {
                    currentAns += current;
                }
                if (c == word.length()){
                    currentAns += input.substring(j+1);
                    break;
                }
            }
            if (c < word.length()){
                currentAns = "NO MATCH";
            }
            System.out.println(currentAns);
        }
    }
}
