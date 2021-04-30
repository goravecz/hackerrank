package java.introduction.javaendoffile;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (scanner.hasNext()) {
            String ns = scanner.nextLine();
            System.out.println(count + " " + ns);
            count++;
        }

        scanner.close();
    }
}
