package Hashing;
import java.util.HashMap;

// Given an array arr[] of size N and an element k.
// The task is to find all elements in array that appear
// more than n/k times.

public class MoreThanNbyKOccurrences {
    static int countOccurrence(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int occ = n / k;
        int count = 0;

        for(int num : map.values()){
            if(num > occ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,2,1,2,3,3};
        int n = arr.length;
        int k = 4;

        System.out.println(countOccurrence(arr, n, k));
    }
}
