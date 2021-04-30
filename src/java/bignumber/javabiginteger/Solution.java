package java.bignumber.javabiginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-biginteger/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        scanner.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
