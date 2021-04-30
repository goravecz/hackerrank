package java.datastructures.javasubarrays;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */

public class Solution {

    public static void main(String[] args) {
        int[] array = readInput();
        System.out.println(countNegativeSubArrays(array));
    }

    private static int[] readInput() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int countNegativeSubArrays(int[] array) {
        int count = 0;
        int subArrayLength = 1;
        int arrayLength = array.length;

        while (subArrayLength <= arrayLength) {
            for (int i = 0; i <= arrayLength - subArrayLength; i++) {
                int sum = 0;
                for (int j = 0; j < subArrayLength; j++) {
                    sum = sum + array[i + j];
                }
                if (sum < 0) {
                    count++;
                }
            }
            subArrayLength++;
        }

        return count;
    }
}
