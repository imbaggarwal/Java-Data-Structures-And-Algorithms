package Searching;

public class SortedAndRotatedSearch {

    static int search(int[] arr, int x, int n){
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == x)
                return mid;
            if(arr[low] <= arr[mid])
            {
                if(x >= arr[low] && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else
            {
                if(x > arr[mid] && x <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 2, 3, 4};
        int n = arr.length;
        int x = 2;

        System.out.println(search(arr, x, n));
    }
}
