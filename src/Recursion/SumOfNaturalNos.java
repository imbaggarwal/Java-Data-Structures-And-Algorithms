package Recursion;

import java.util.Scanner;

public class SumOfNaturalNos {
    static int naturalNumberSum(int n){
        if(n == 1) return 1;

        return n + naturalNumberSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(naturalNumberSum(n));
    }
}
