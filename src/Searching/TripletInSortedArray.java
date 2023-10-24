package Searching;

import java.util.Arrays;

// Same as two pointer.
// Uses two - pointer sum as a sub-problem.
public class TripletInSortedArray {
    static int[] findTriplet(int[] arr, int sum){
        int n = arr.length;
        int[] ans = {-1,-1,-1};

        for(int i=0; i<n-2; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int find = sum - arr[i];
                int res = arr[j] + arr[k];

                if(res == find){
                    ans[0] = i;
                    ans[1] = j;
                    ans[2] = k;
                    return ans;
                }
                if(res > find){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,10,15,18};
        int sum = 33;

        System.out.println(Arrays.toString(findTriplet(arr, sum)));
    }
}
