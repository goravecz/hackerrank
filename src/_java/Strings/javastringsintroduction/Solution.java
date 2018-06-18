package _java.Strings.javastringsintroduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        System.out.println(getSumOfLength(A, B));
        System.out.println(compareLexicographically(A, B));
        System.out.println(capitalizeFirstLetters(A, B));
    }

    private static int getSumOfLength(String A, String B) {
        return A.length() + B.length();
    }

    private static String compareLexicographically(String A, String B) {
        int comparisionResult = A.compareTo(B);

        return comparisionResult > 0 ? "Yes" : "No";
    }

    private static String capitalizeFirstLetters(String A, String B) {
        return A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
    }
}
