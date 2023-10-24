package Mathematics;

import java.util.Scanner;

public class Factorial {
    static long factorialOne(long n){
        long res = 1;

        for(long i=2; i<=n; i++){
            res *= i;
        }
        return res;
    }

    static long factorialTwo(long n){
        if(n == 0) return 1;

        return n * factorialTwo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(factorialOne(n));
        System.out.println(factorialTwo(n));
    }
}
