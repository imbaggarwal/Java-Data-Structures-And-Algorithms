package Patterns;

import java.util.Scanner;
/*
        A
        B B
        C C C
        D D D D
        E E E E E
 */
public class Pattern16 {
    static void printPattern(int n) {
        char ch = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(i + ch) + " ");
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
