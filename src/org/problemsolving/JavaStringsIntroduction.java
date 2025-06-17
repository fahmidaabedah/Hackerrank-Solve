package org.problemsolving;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lengthOfA = A.length();
        int lengthOfB = B.length();
        System.out.println(lengthOfA + lengthOfB);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));

    }
}
