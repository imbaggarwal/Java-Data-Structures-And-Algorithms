package Patterns;

import java.util.Scanner;

/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
 */
public class Pattern13 {
    static void printPattern(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num = num + 1;
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
