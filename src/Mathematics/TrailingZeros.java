package Mathematics;

import java.util.*;

//We are given a number.
// The task is to find the Number of Trailing Zeros
// in the factorial of the number.

public class TrailingZeros {
    static int countZeros(int n){
        int res = 0;
        for(int i=5; i<=n; i=i*5){
            res += n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countZeros(n));
    }
}
