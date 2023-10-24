package Searching;

// Given a number of pages in N different books and M students.
// The books are arranged in ascending order of the number of pages.
// Every student is assigned to read some consecutive books.
// The task is to assign books in such a way that the
// maximum number of pages assigned to a student is minimum.

public class AllocateMinimumPages {
    static int minPages(int[] arr, int n, int k){
        int sum = 0;
        int max = 0;

        for(int num : arr){
            sum += num;
            max = Math.max(max,num);
        }

        int low = max;
        int high = sum;
        int res = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(isFeasible(arr,k,mid)){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }

    private static boolean isFeasible(int[] arr, int k, int mid){
        int req = 1;
        int sum = 0;

        for(int num : arr){
            if(sum + num > mid){
                req++;
                sum = num;
            }
            else{
                sum += num;
            }
        }
        return req <= k;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,10,30};
        int n = arr.length;
        int k = 3;

        System.out.println(minPages(arr,n,k));
    }
}
