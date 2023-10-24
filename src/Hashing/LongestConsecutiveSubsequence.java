package Hashing;
import java.util.HashSet;

// Given an array of positive integers.
// Find the length of the longest sub-sequence such that
// elements in the subsequence are consecutive integers,
// the consecutive numbers can be in any order.

public class LongestConsecutiveSubsequence {
    static int findLongestConseqSubseq(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int res = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = 1;

                while(set.contains(curr + num)){
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,1,5,6,3,4};

        System.out.println(findLongestConseqSubseq(arr));
    }
}
