package Patterns;

import java.util.Scanner;

/*
        A B C D E
        A B C D
        A B C
        A B
        A
 */
public class Pattern15 {
    static void printPattern(int n) {
        for(int i=n-1; i>=0; i--){
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
