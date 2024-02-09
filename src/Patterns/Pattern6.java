package Patterns;

import java.util.Scanner;

/*
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
 */
public class Pattern6 {
    static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

}
