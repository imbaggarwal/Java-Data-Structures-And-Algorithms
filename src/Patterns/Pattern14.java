package Patterns;

import java.util.Scanner;

/*
        A
        A B
        A B C
        A B C D
 */
public class Pattern14 {
    static void printPattern(int n) {
        for(int i=0; i<n; i++){
            char ch = 'A';
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
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
