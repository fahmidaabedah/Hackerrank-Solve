package org.problemsolving;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        if (0 <= q && q <= 500) {
            for (int i = 0; i < q; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if (0 <= a && a <= 50) {
                    if (0 <= b && b <= 50) {
                        if (1 <= n && n <= 15) {
                            int result = a;

                            for (int j = 0; j < n; j++) {
                                result += (int) (Math.pow(2, j) * b);
                                System.out.print(result + " ");
                            }
                        } else {
                            System.out.println("n >= 1 && n <= 15");
                        }
                    } else {
                        System.out.println("b >= 0 && b <= 50");
                    }
                } else {
                    System.out.println("0 <= a && a <= 50");
                }
                System.out.println();
            }
        } else {
            System.out.println("0 <= q && q <= 500");
        }

        in.close();
    }
}
