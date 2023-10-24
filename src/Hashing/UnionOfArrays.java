package Hashing;
import java.util.HashSet;

// Given two arrays a[] and b[] of size n and m respectively.
// The task is to find the number of elements in the union between these two arrays.
//
// Union of the two arrays can be defined as the set containing distinct elements
// from both the arrays. If there are repetitions, then only
// one occurrence of element should be printed in the union.
//
// Note : Elements are not necessarily distinct.

public class UnionOfArrays {
    static int doUnion(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();

        for(int num : a){
            set.add(num);
        }
        for(int num : b){
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};

        System.out.println(doUnion(arr1, arr2));
    }
}
