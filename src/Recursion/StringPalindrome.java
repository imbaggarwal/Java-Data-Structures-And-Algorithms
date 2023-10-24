package Recursion;

import java.util.Scanner;

//Given a string,
// write a recursive function that
// checks if the given string is
// a palindrome or not.

public class StringPalindrome {
    static boolean isPalindrome(String str, int start, int end){
        if(start >= end) return true;
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
