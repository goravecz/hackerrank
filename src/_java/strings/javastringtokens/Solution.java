package _java.strings.javastringtokens;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] tokens = s.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}