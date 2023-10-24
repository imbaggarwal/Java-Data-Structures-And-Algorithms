package Recursion;

import java.util.Scanner;

//Given a number N,
// the task is to print the
// numbers from 1 to N.

public class From1toN {
    static void printSequence(int n){
        if(n == 0) return;
        printSequence(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSequence(n);
    }
}
