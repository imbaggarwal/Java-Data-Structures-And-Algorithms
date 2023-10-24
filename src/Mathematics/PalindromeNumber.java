package Mathematics;

import java.util.Scanner;

//Given an integer, write a function
// that returns true if
// the given number is palindrome, else false.
// For example, 12321 is palindrome,
// but 1451 is not palindrome.

public class PalindromeNumber {
    static boolean isPalindrome(long n){
        long temp = n;
        long rev = 0;

        while(temp > 0){
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(isPalindrome(n));
    }
}
