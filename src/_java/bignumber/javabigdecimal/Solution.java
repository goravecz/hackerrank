package _java.bignumber.javabigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, Collections.reverseOrder(Comparator.nullsFirst(Comparator.comparing(BigDecimal::new))));

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
