package Hashing;
import java.util.HashSet;

// Given two arrays a[] and b[] respectively of size n and m,
// the task is to print the count of elements in the intersection
// (or common elements) of the two arrays.
//
// For this question, the intersection of two arrays can be defined as
// the set containing distinct common elements between the two arrays.

public class IntersectionOfArrays {
    static int NumberOfElementsInIntersection(int[] a, int[] b){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : a){
            set1.add(num);
        }

        for(int num : b){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        return set2.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {89, 24, 75, 11, 23};
        int[] arr2 = {89, 2, 4};

        System.out.println(NumberOfElementsInIntersection(arr1, arr2));
    }
}
