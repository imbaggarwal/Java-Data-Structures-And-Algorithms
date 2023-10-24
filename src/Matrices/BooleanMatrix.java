package Matrices;

// Given a boolean matrix of size RxC where
// each cell contains either 0 or 1,
// modify it such that if a matrix cell matrix[i][j] is 1
// then all the cells in its ith row and jth column will become 1.

import java.util.Arrays;

public class BooleanMatrix {
    static int[][] booleanMatrix(int[][] arr)
    {
        // code here
        int m = arr.length;
        int n = arr[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0},
                {0,0,0},
                {0,0,0},
        };
        System.out.println(Arrays.deepToString(booleanMatrix(arr)));
    }
}
