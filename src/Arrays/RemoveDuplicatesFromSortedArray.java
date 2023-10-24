package Arrays;

//Given a sorted array,
// the task is to remove the duplicate elements from the array.

public class RemoveDuplicatesFromSortedArray {
    static int remove(int[] arr, int n){
        int ans = 1;

        for(int i=1; i<n; i++){
            if(arr[ans - 1] != arr[i]){
                arr[ans] = arr[i];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
        int n = arr.length;

        System.out.println(remove(arr, n));
    }
}
