package Recursion;

import java.util.Scanner;

//Given a set represented as a string,
// write a recursive code to print all the
// subsets of it.
// The subsets can be printed in any order.

public class StringSubsets {
    static void getSubset(String str, String curr, int index){
        if(index == str.length()){
            System.out.println(curr);
            return;
        }

        getSubset(str, curr, index + 1);
        getSubset(str, curr + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String curr = "";

        getSubset(str, curr, 0);
    }
}
