package Patterns;

import java.util.Scanner;

/*
         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5
 */
public class Pattern4 {
    static void printPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print(i + 1 + " ");
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
