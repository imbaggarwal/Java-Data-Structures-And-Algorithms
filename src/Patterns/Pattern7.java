package Patterns;

import java.util.Scanner;

/*
                  *
                * * *
              * * * * *
            * * * * * * *
          * * * * * * * * *
 */
public class Pattern7 {
    static void printPattern(int n) {
        for (int i=0; i<n; i++) {
            for(int j=n-i-1; j>=0; j--){
                System.out.print("  ");
            }
            for(int j=2*i+1; j>=1; j--){
                System.out.print("* ");
            }
            for(int j=n-i-1; j>=0; j--){
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
