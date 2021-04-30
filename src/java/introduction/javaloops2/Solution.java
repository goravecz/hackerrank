package java.introduction.javaloops2;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-loops/problem
 */

public class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] result = calculateSequence(a, b, n);
            for (int k = 0; k < n; k++) {
                System.out.print(result[k] + " ");
            }
            System.out.println();
        }

        in.close();
    }

    private static int[] calculateSequence(int a, int b, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sequence = 0;
            for (int j = 0; j <= i; j++) {
                sequence = sequence + (int) Math.pow(2, j) * b;
            }
            result[i] = a + sequence;
        }

        return result;
    }
}
