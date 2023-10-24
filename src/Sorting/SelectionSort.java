package Sorting;

// The selection sort algorithm sorts an array by repeatedly
// finding the minimum element (considering ascending order) from unsorted part
// and putting it at the beginning. The algorithm maintains two sub-arrays in a given array.
//
// The sub-array which is already sorted.
// Remaining sub-array which is unsorted.
// In every iteration of selection sort, the minimum element (considering ascending order)
// from the unsorted sub-array is picked and moved to the sorted sub-array.

public class SelectionSort {
    static void selectionSort(int[] arr, int n){
        for(int i=0; i<n; i++){
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
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

        selectionSort(arr, n);
        printArray(arr, n);
    }
}
