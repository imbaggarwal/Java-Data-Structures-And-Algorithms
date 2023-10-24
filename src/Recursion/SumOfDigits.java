package Recursion;

import java.util.Scanner;

//Given a number,
// we need to find sum of its
// digits using recursion.

public class SumOfDigits {
    static int digitSum(int n){
        if(n < 10) return n;

        return (n % 10) + digitSum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitSum(n));
    }
}
