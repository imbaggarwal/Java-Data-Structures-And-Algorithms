package Patterns;

import java.util.Scanner;

/*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
 */
public class Pattern11 {
    static void printPattern(int n) {
        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                for(int j=0; j<=i; j++){
                    if(j % 2 == 0){
                        System.out.print(1 + " ");
                    }
                    else{
                        System.out.print(0 + " ");
                    }
                }
            }
            else{
                for(int j=0; j<=i; j++){
                    if(j % 2 == 0){
                        System.out.print(0 + " ");
                    }
                    else{
                        System.out.print(1 + " ");
                    }
                }
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
