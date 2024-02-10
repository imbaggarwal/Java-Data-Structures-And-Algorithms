package Patterns;

import java.util.Scanner;

/*
        * * * * * *
        * *     * *
        *         *
        *         *
        * *     * *
        * * * * * *
 */
public class Pattern19 {
    static void printPattern(int n){
        upperPattern(n);
        lowerPattern(n);
    }

    static void upperPattern(int n) {
        int spaces = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces += 2;
        }
    }

    static void lowerPattern(int n){
        int spaces = 2 * (n - 1);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }
}
