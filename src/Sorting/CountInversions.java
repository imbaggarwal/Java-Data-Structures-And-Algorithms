package Sorting;

// Inversion Count for an array indicates – how far
// (or close) the array is from being sorted.
// If the array is already sorted, then the inversion count is 0,
// but if the array is sorted in reverse order, the inversion count is the maximum.

// Given an array a[]. The task is to find the inversion count of a[].
// Where two elements a[i] and a[j] form an inversion if
// a[i] > a[j] and i < j.

public class CountInversions {
    private static int countAndMerge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n1];

        for(int i=0; i<n1; i++){
            left[i] = arr[l + i];
        }
        for(int i=0; i<n2; i++){
            right[i] = arr[m + 1 + i];
        }

        int res = 0;
        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
                res += n1 - i;
            }
            k++;
        }

        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

    static int countInversions(int[] arr, int l, int r){
        int res = 0;
        if(l < r){
            int m = (l + r) / 2;

            res += countInversions(arr, l, m);
            res += countInversions(arr, m + 1, r);
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println(countInversions(arr, 0, arr.length - 1));
    }
}
