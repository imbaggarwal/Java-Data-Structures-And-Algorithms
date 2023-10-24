package Arrays;

// Equilibrium index of an array is an index such that
// the sum of elements at lower indexes is equal to
// the sum of elements at higher indexes.
// We are given an Array of integers,
// We have to find out the first index i from left such that -
// A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]

public class EquilibriumIndex {
    static int equilibriumPoint(int[] arr, int n){
        int sum = 0;
        int equalSum = 0;
        for(int num : arr){
            sum += num;
        }

        for(int i=0; i<n; i++){
            sum -= arr[i];
            if(sum == equalSum){
                return i;
            }
            equalSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        int n = arr.length;

        System.out.println(equilibriumPoint(arr,n));
    }
}
