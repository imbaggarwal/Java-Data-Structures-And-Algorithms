package Matrices;

// Given a square matrix of size N x N.
// The task is to find the determinant of this matrix.

public class Determinant {
    static int determinantOfMatrix(int[][] matrix, int n){
        int det = 0;

        if(n == 1){
            return matrix[0][0];
        }

        int[][] temp = new int[n][n];

        int sign = 1;

        for(int i=0; i<n; i++){
            getCofactor(matrix, temp, 0, i, n);
            det += sign * matrix[0][i] * determinantOfMatrix(temp, n - 1);

            sign = -1 * sign;
        }
        return det;
    }

    static void getCofactor(int[][] matrix, int[][] temp, int p, int q, int n){
        int i = 0, j = 0;

        for(int row=0; row<n; row++){
            for(int column=0; column<n; column++){
                if(row != p && column != q){
                    temp[i][j] = matrix[row][column];
                    j++;

                    if(j == n - 1){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(determinantOfMatrix(arr, arr.length));
    }
}
