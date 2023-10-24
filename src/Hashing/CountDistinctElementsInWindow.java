package Hashing;
import java.util.Arrays;
import java.util.HashMap;

// Given an array of size n and an integer k,
// return the count of distinct numbers in all windows of size k.

public class CountDistinctElementsInWindow {
    static int[] count(int[] arr, int n, int k){
        int[] ans = new int[n - k + 1];
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans[index++] = map.size();

        for(int i=k; i<n; i++){
            map.put(arr[i - k], map.get(arr[i - k]) - 1);

            if(map.get(arr[i - k]) == 0){
                map.remove(arr[i - k]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans[index++] = map.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,40,10};
        int n = arr.length;
        int k = 4;
        System.out.println(Arrays.toString(count(arr, n, k)));
    }
}
