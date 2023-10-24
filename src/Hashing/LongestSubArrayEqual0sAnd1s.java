package Hashing;
import java.util.HashMap;

//Given an array containing 0s and 1s.
// Find the number of sub-arrays having equal number of 0s and 1s.

public class LongestSubArrayEqual0sAnd1s {
    static int longestSubArray(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        int sum = 0;
        int maxLength = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == 0){
                maxLength = i + 1;
            }

            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength, i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1};
        int n = arr.length;

        System.out.println(longestSubArray(arr, n));
    }
}
