package Searching;

// Given a sorted array arr[ ] and a number x,
// We have to count the occurrences of x in arr[].

public class TotalOccurrences {
    static int count(int[] arr, int n, int x){
        int i = left(arr, n, x, 0, n-1);
        if(i == -1) return 0;

        int j = right(arr, n, x, 0, n-1);

        return j - i + 1;
    }

    static int left(int[] arr, int n, int x, int low, int high) {
        while(low <= high){
            int mid = low + (high - low) / 2;

            if((mid == 0 || x > arr[mid - 1]) && x == arr[mid]){
                return mid;
            }
            else if(x > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    static int right(int[] arr, int n, int x, int low, int high) {
        while(low <= high){
            int mid = low + (high - low) / 2;

            if((mid == n - 1 || x < arr[mid + 1]) && x == arr[mid]){
                return mid;
            }
            else if(x < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3};
        int n = 7;
        int x = 4;

        System.out.println(count(arr, n, x));
    }
}
