package org.problemsolving;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        s = s.replaceAll("[^A-Za-z ]", " ");
        String[] words = s.split("\\s+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
        scan.close();
    }
}
