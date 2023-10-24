package Searching;

//Recursive binary search

public class BinaryRecursive {
    static int binarySearch(int[] arr, int target, int low, int high){
        if(low > high) return -1;

        int mid = low + (high - low) / 2;

        if(target == arr[mid]) return mid;

        if(target < arr[mid])
            return binarySearch(arr, target, low, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 25;

        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }
}
