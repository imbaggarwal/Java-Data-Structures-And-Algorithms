package Searching;

//Iterative binary search

public class BinaryIterative {
    static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int target = 80;

        System.out.println(binarySearch(arr, target));
    }
}
