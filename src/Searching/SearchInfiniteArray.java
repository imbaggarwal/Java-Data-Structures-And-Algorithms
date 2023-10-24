package Searching;

// Since array is sorted, the first thing clicks into mind is binary search,
// but the problem here is that we don’t know size of array.

// If the array is infinite, that means we don’t have proper bounds to apply binary search.
// So in order to find position of key,
// first we find bounds and then apply binary search algorithm.
// Let low be pointing to 1st element and high pointing to 2nd element of array,
// Now compare key with high index element,
//    ->if it is greater than high index element then copy high index in low index and double the high index.
//    ->if it is smaller, then apply binary search on high and low indices found.

public class SearchInfiniteArray {
    private static int binarySearch(int[] arr, int x, int low, int high){
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(x == arr[mid]) return mid;

            if(x > arr[mid]) low = mid + 1;
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int x){
        if(x == arr[0]) return 0;
        int i = 1;
        while(arr[i] < x){
            i *= 2;
        }

        if(x == arr[i]) return i;

        return binarySearch(arr, x, i / 2 + 1, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192};
        System.out.println(search(arr, 33));
    }
}
