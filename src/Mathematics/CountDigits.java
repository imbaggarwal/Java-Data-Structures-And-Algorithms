package Mathematics;

import java.util.Scanner;

//Given a number N,
// the task is to return the count of digits
// in this number.

public class CountDigits {
    static int countDigits(long n){
        int res = 0;

        while(n > 0){
            n /= 10;
            res++;
        }
        return res;
    }
    static int digitCount(long n){
        return (int)(Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(digitCount(n));
    }
}
