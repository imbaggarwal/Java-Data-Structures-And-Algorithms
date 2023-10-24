package Recursion;

import java.util.Scanner;

//We are given a number.
// The task is to find the
// Number of Trailing Zeros in the factorial of
// the number.

public class FromNto1 {
    static void printSequence(int n){
        if(n == 0) return;

        System.out.print(n + " ");
        printSequence(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSequence(n);
    }
}
