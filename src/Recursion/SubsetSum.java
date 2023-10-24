package Recursion;

import java.util.Scanner;

public class SubsetSum {
    static int countSubsets(int[] arr, int n, int target){
        if(n == 0){
            return (target == 0) ? 1 : 0;
        }

        return countSubsets(arr, n - 1, target) + countSubsets(arr, n - 1, target - arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1};
        int n = arr.length;
        int target = 2;

        System.out.println(countSubsets(arr, n, target));
    }
}
