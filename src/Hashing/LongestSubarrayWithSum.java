package Hashing;
import java.util.HashMap;

// Given an array arr[] of size n containing integers.
// The problem is to find the length of the longest sub-array having
// sum equal to the given value k.

public class LongestSubarrayWithSum {
    static int longestSubArray(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == k){
                maxLength = i + 1;
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)){
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,1,5,-6,6,2,2};
        int n = arr.length;
        int k = 4;

        System.out.println(longestSubArray(arr, n, k));
    }
}
