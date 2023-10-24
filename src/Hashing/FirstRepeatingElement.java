package Hashing;
import java.util.HashMap;

// Given an array arr[] of size n, find the first repeating element.
// The element should occur more than once and
// the index of its first occurrence should be the smallest.

// Note:- The position you return should be according to 1-based indexing.

public class FirstRepeatingElement {
    static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i=0; i<n; i++){
            if(map.get(arr[i]) > 1){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = arr.length;

        System.out.println(firstRepeated(arr, n));
    }
}
