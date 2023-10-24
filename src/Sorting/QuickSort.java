package Sorting;

public class QuickSort {
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int pivot(int[] arr, int start, int end){
        //If last element is the pivot:
        int swapIndex = end;
        for(int i=end-1; i>=start; i--){
            if(arr[i] > arr[end]){
                swapIndex--;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, end, swapIndex);

        //If first element is the pivot:
//        int swapIndex = start;
//        for(int i=start+1; i<=end; i++){
//            if(arr[i] < arr[start]){
//                swapIndex++;
//                swap(arr, i, swapIndex);
//            }
//        }
//        swap(arr, start, swapIndex);
        return swapIndex;
    }

    static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivotIndex = pivot(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,1,7,3,2,5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        printArray(arr);
    }
}
