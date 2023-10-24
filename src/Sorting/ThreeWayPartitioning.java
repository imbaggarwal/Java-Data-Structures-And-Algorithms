package Sorting;

// Given an array of size n and a range [a, b].
// The task is to partition the array around the range
// such that array is divided into three parts.

// 1) All elements smaller than a come first.
// 2) All elements in range a to b come next.
// 3) All elements greater than b appear in the end.

// The individual elements of three sets can appear in any order.
// You are required to return the modified array.

import java.util.Arrays;

public class ThreeWayPartitioning {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] partition(int[] arr, int a, int b){
        int low = 0, mid = 0, high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] < a){
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] >= a && arr[mid] <= b){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};

        System.out.println(Arrays.toString(partition(arr, 1, 3)));
    }
}
