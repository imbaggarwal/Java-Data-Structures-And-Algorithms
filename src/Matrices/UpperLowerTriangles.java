package Matrices;

// Given a square matrix of size N*N,
// print the sum of upper and lower triangular elements.
// Upper Triangle consists of elements on the diagonal and above it.
// The lower triangle consists of elements on the diagonal and below it.

import java.util.Arrays;

public class UpperLowerTriangles {
    static int[] sumTriangles(int[][] arr, int n){
        int sum1 = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum1 += arr[i][j];
            }
        }

        int sum2 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                sum2 += arr[i][j];
            }
        }
        return new int[]{sum1, sum2};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {6,5,4},
                {1,2,5},
                {7,9,7}
        };
        int n = arr.length;

        System.out.println(Arrays.toString(sumTriangles(arr, n)));
    }
}
