package Hashing;
import java.util.HashSet;

// You are given an array of distinct integers and a sum.
// Check if there's a pair with the given sum in the array.


public class SumPair {
    static int sumExists(int[] arr, int sum){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int req = sum - num;
            if(set.contains(req)){
                return 1;
            }
            set.add(num);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 14;

        System.out.println(sumExists(arr, sum));
    }
}
