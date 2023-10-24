package Matrices;

// Two matrices A[][] and B[][] can only be multiplied if
// number of columns in A is equal to number of rows in B.
// The dimensions of the resultant matrix will have A's row size
// and B's column size.
//
// Given two matrices A and B having (n1 x m1) and (n2 x m2) dimensions respectively.
// Multiply A and B.

import java.util.Arrays;

public class MultiplyingTwoMatrices {
    static int[][] multiply(int[][] arr1, int[][] arr2){
        int[][] ans = new int[arr1.length][arr1[0].length];

        if(arr1[0].length != arr2.length){
            ans = new int[0][0];
        }

        else{
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr2[0].length; j++){
                    ans[i][j] = 0;
                    for(int k=0; k<arr1[0].length; k++){
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{4,8},{0,2},{1,6}};
        int[][] arr2 = {{5,2},{9,4}};

        System.out.println(Arrays.deepToString(multiply(arr1, arr2)));
    }
}
