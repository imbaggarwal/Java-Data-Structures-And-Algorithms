package Arrays;

//We are given an array of positive and negative integers.
// We have to find the contiguous subarray
// having maximum sum.
public class LargestSumSubarray {
    static int largestSum(int[] arr, int n){
        int sum = 0, max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum += arr[i];

            max = Math.max(sum, max);

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-3,4,-1,-2,1,5};
        int n = arr.length;

        System.out.println(largestSum(arr, n));
    }
}
