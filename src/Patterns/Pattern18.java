package Patterns;

import java.util.Scanner;

/*
        E
        E D
        E D C
        E D C B
        E D C B A
 */
public class Pattern18 {
    static void printPattern(int n) {
        for(int i=0; i<n; i++){
            char ch = (char)('A' + n - 1);

            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
                ch--;
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
