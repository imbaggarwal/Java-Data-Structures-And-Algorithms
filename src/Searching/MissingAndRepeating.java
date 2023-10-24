package Searching;

import java.util.Arrays;

// Given an unsorted array of size n.
// Array elements are in the range from 1 to n.
// One number from set {1, 2, …n} is missing and one number occurs twice in the array.
// Our task is to find these two numbers.
public class MissingAndRepeating {
    static int[] solve(int[] nums){
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            int temp = Math.abs(nums[i]);
            if(nums[temp - 1] > 0){
                nums[temp - 1] = -nums[temp - 1];
            }
            else{
                ans[0] = temp;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                ans[1] = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
