package java.strings.tagcontentextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/tag-content-extractor/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            String regex = "<(.+)>([^<]+)</\\1>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            boolean match = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                match = true;
            }
            if (!match) {
                System.out.println("None");
            }
            testCases--;
        }
        in.close();
    }
}