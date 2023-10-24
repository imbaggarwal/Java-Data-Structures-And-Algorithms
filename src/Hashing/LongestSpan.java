package Hashing;
import java.util.HashMap;

// Given two binary arrays arr1[] and arr2[] of same size N.
// Find length of the longest common span [i, j] where j>=i
// such that arr1[i] + arr1[i+1] + …. + arr1[j] = arr2[i] + arr2[i+1] + …. + arr2[j].

public class LongestSpan {
    static int longestCommonSum(boolean[] arr1, boolean[] arr2, int n){
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            if(arr1[i] && !arr2[i]){
                arr[i] = 1;
            }
            else if(!arr1[i] && arr2[i]){
                arr[i] = -1;
            }
            else{
                arr[i] = 0;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, length = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == 0){
                length = i + 1;
            }

            if(map.containsKey(sum)){
                length = Math.max(length, i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        boolean[] arr1 = {false, true, false, false, false, false};
        boolean[] arr2 = {true, false, true, false, false, true};
        int n = arr1.length;

        System.out.println(longestCommonSum(arr1, arr2, n));
    }
}
