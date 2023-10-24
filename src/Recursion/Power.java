package Recursion;

import java.util.Scanner;

public class Power {
    static long power(int a, int b){
        if(b == 0) return 1;

//        return (a * power(a, b - 1)) % 1000000007;      //First approach

        long pow = power(a, b / 2);
        long ans = (pow * pow) % 1000000007;

        if(b % 2 == 0){
            return ans;
        }
        return (ans * a) % 1000000007;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(power(a,b));
    }
}
