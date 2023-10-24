package Searching;

//Occurrence of first 1 in a binary array

public class FirstOne {
    static int findFirstOne(int[] arr, int n, int low, int high){
        while(low <= high){
            int mid = low + (high - low) / 2;

            if((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1){
                return mid;
            }
            else if(arr[mid] == 1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1};
        int n = arr.length;

        System.out.println(findFirstOne(arr, n, 0, n-1));
    }
}
