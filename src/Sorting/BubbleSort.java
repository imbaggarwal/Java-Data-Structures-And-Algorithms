package Sorting;

// Bubble Sort is the simplest sorting algorithm that works
// by repeatedly swapping the adjacent elements if they are in the wrong order.
// This algorithm is not suitable for large data sets
// as its average and worst case time complexity is quite high.

public class BubbleSort {
    static void bubbleSort(int[] arr, int n){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        bubbleSort(arr, n);
        printArray(arr, n);
    }
}
