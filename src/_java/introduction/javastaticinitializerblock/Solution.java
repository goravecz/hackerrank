package _java.introduction.javastaticinitializerblock;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */

public class Solution {

    public static Scanner scanner = new Scanner(System.in);
    public static int B = scanner.nextInt();
    public static int H = scanner.nextInt();
    public static boolean flag = setFlag(B, H);

    private static boolean setFlag(int B, int H) {
        boolean flag;
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
