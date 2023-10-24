package Matrices;

import java.util.Arrays;

public class RotateMatrixAntiClockwiseBy90 {
    static int[][] rotate(int[][] arr){
        int n = arr.length;

        //Transpose:
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                swap(arr, i, j);
            }
        }

        //Reversing Columns:
        for(int i=0; i<n; i++){
            int low = 0;
            int high = n - 1;

            while(low < high){
                swap(arr, low, high, i);
                low++;
                high--;
            }
        }
        return arr;
    }

    static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void swap(int[][] arr, int low, int high, int i){
        int temp = arr[high][i];
        arr[high][i] = arr[low][i];
        arr[low][i] = temp;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(rotate(arr)));
    }
}
