package Searching;

// Task is to find whether in a given array,
// the given sum be achieved by any two elements.

public class TwoPointerSum {
    static boolean solve(int[] arr, int n, int sum){
        int i = 0;
        int j = n - 1;

        while(i < j){
            if(arr[i] + arr[j] == sum) return true;
            if(arr[i] + arr[j] > sum) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,11,12,14,18,26};
        int n = arr.length;
        int sum = 50;

        System.out.println(solve(arr, n, sum));
    }
}
