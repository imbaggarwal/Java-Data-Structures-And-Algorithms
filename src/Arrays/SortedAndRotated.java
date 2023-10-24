package Arrays;

public class SortedAndRotated {
    static boolean checkRotatedAndSorted(int arr[], int n){

        // Your code here
        int rightCount = 0;
        int leftCount = 0;

        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                rightCount++;
            }
        }
        for(int i=0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                leftCount++;
            }
        }
        return (rightCount == 1 && arr[0] > arr[arr.length - 1]) || (leftCount == 1 && arr[0] < arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        int n = arr.length;

        System.out.println(checkRotatedAndSorted(arr, n));
    }
}
