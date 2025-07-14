package org.problemsolving;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(payment);
        NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUs.format(payment);
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfChina.format(payment);
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nfIndia.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
