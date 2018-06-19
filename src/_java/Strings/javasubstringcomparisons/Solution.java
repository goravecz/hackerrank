package _java.Strings.javasubstringcomparisons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static List<String> generateSubStringList(String s, int k) {
        List<String> subStringList = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            subStringList.add(s.substring(i, i + k));
        }

        return subStringList;
    }

    private static String getSmallestAndLargest(String s, int k) {
        List<String> subStringList = generateSubStringList(s, k);

        String smallest = subStringList.stream()
                .min(Comparator.comparing(String::valueOf))
                .get();

        String largest = subStringList.stream()
                .max(Comparator.comparing(String::valueOf))
                .get();

        return smallest + "\n" + largest;
    }
}