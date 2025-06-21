package org.problemsolving;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        String A = a.toUpperCase();
        String B = b.toUpperCase();
        if (A.length() != B.length())
            return false;
        for (int i = 0; i < A.length(); i++) {
            int CountA = 0;
            int CountB = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(i) == A.charAt(j)) {
                    CountA++;
                }
                if (A.charAt(i) == B.charAt(j)) {
                    CountB++;
                }
            }
            if (CountA == CountB)
                continue;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
