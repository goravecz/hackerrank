package java.datastructures.javahashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/java-hashset/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        int length = pair_left.length;
        Set<String> set = new HashSet<>();
        int[] counts = new int[length];

        for (int i = 0; i < length; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            counts[i] = set.size();
        }
        for (int count : counts) {
            System.out.println(count);
        }
    }
}
