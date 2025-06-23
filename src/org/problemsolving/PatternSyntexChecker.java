package org.problemsolving;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntexChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern text = Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
