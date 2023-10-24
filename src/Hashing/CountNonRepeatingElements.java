package Hashing;
import java.util.HashMap;

//You are given an array of integers.
// You need to print the count of non-repeated elements in the array.

public class CountNonRepeatingElements {
    static long countNonRepeated(int[] arr){
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.values()){
            if(num == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6,7};

        System.out.println(countNonRepeated(arr));
    }
}
