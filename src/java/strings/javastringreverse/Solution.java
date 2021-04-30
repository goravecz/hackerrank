package java.strings.javastringreverse;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;
        boolean flag = true;

        while (start <= end && flag) {
            if (string.charAt(start) != string.charAt(end)) {
                flag = false;
            } else {
                start++;
                end--;
            }
        }

        return flag;
    }
}
