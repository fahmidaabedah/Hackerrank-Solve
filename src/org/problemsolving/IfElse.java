package org.problemsolving;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anInt = sc.nextInt();
        if (anInt % 2 != 0) {
            System.out.println("Weird");
        } else if (anInt >= 2 && anInt <= 5) {
            System.out.println("Not Weird");
        } else if (anInt >= 6 && anInt <= 20) {
            System.out.println("Weird");
        } else if (anInt > 20) {
            System.out.println("Not Weird");
        }
    }
}
