package _java.introduction.javacurrencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        System.out.println("US: " + us);

        Locale indianLocale = new Locale("en", "in");
        String india = NumberFormat.getCurrencyInstance(indianLocale).format(payment);
        System.out.println("India: " + india);

        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        System.out.println("China: " + china);

        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("France: " + france);
    }
}
