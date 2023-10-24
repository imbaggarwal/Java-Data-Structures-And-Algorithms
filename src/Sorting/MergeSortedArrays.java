package Sorting;

import java.util.Arrays;

// Given two sorted arrays,
// the task is to merge them in a sorted manner.

public class MergeSortedArrays {
    static int[] merge(int[] arr1, int[] arr2, int m, int n){
        int[] array = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                array[k] = arr1[i];
                k++;
                i++;
            }
            else{
                array[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i < m){
            array[k] = arr1[i];
            k++;
            i++;
        }
        while(j < n){
            array[k] = arr2[j];
            k++;
            j++;
        }
        return array;
    }

    static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,11,12,13,14,15,16,17,18,19};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int m = arr1.length;
        int n = arr2.length;

        System.out.println(Arrays.toString(merge(arr1, arr2, m, n)));
    }
}
