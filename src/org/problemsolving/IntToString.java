package org.problemsolving;

import java.util.*;
import java.security.*;

public class IntToString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //added only one line below and cut the other parts because 'java.lang.SecurityManager' is deprecated since version 17 and marked for removal
        String s = Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }

    }
}
