package Patterns;

import java.util.Scanner;

/*
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *
 */
public class Pattern9 {
    static void printPattern(int n) {
        pyramid(n);
        invertedPyramid(n);
    }

    static void pyramid(int n){
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void invertedPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<2*(n-i)-1; j++){
                System.out.print("* ");
            }
            for(int j=0; j<i; j++){
                System.out.print("  ");
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
