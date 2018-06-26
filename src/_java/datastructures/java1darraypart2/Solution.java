package _java.datastructures.java1darraypart2;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 */

public class Solution {

    private static Map<Integer, List<Integer>> graph = new HashMap<>();

    public static boolean canWin(int leap, int[] game, int index) {
        int arrayLength = game.length;
        if (index < 0 || game[index] == 1) {
            return false;
        } else if (index + leap >= arrayLength || index + 1 >= arrayLength) {
            return true;
        }
        game[index] = 1;

        return canWin(leap, game, index + leap) ||
                canWin(leap, game, index + 1) ||
                canWin(leap, game, index - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}