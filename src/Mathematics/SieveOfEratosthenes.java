package Mathematics;

import java.util.Arrays;

//Given a number n, print all primes smaller than or equal to n.
// It is also given that n is a small number.

public class SieveOfEratosthenes {
    static void sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 30;
        sieveOfEratosthenes(n);
    }
}
