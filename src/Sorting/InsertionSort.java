package Sorting;

// Insertion Sort is an In-Place sorting algorithm.
// This algorithm works in a similar way of sorting a deck of playing cards.
//
// The idea is to start iterating from the second element of array
// till last element and for every element insert at its
// correct position in the sub-array before it.

public class InsertionSort {
    static void insertionSort(int[] arr, int n){
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int n = arr.length;

        insertionSort(arr, n);
        printArray(arr, n);
    }
}
