package Searching;

// Given an array arr[] of integers.
// Find a peak element i.e. an element that is not smaller than its neighbors.

public class PeakElement {
    static int peakElement(int[] arr, int n){
        int low = 0;
        int high = n - 1;
        int mid = arr[0];

        while(low <= high){
            mid = low + (high - low) / 2;
            if((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])){
                break;
            }
            if(mid > 0 && arr[mid] < arr[mid - 1]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return arr[mid];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,20,4,1,0};
        int n = arr.length;

        System.out.println(peakElement(arr, n - 1));
    }
}
