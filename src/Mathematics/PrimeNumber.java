package Mathematics;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count == 2;
    }

    static boolean isPrimeTwo(int n){
        if(n == 1) return false;

        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrimeTwo(n));
    }
}
