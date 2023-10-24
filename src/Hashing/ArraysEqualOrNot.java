package Hashing;
import java.util.HashMap;

// Given two arrays A and B of equal size N,
// the task is to find if given arrays are equal or not.
// Two arrays are said to be equal if both of them contain same set of elements,
// arrangements (or permutation) of elements may be different though.

// Note : If there are repetitions, then counts of repeated elements
// must also be same for two array to be equal.


public class ArraysEqualOrNot {
    static boolean areEqual(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr2){
            if(!map.containsKey(num) || map.get(num) == 0){
                return false;
            }
            map.put(num, map.get(num) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,5,1,1,3};
        int[] arr2 = {5,4,3,2,1,1};

        if(areEqual(arr1, arr2)){
            System.out.println("Arrays Are Equal :)");
        }
        else{
            System.out.println("Arrays Are Not Equal :(");
        }
    }
}
