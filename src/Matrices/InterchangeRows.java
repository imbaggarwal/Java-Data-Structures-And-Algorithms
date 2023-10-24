package Matrices;

// Given a matrix of dimensions n1 x m1.
// Interchange its rows in-place such that the
// first row will become the last row and so on.

import java.util.Arrays;

public class InterchangeRows {
    static int[][] interchangeRows(int[][] arr){
        // code here
        int top = 0;
        int bottom = arr.length - 1;

        while(top < bottom){
            for(int i=0; i<arr[0].length; i++){
                int temp = arr[top][i];
                arr[top][i] = arr[bottom][i];
                arr[bottom][i] = temp;
            }
            top++;
            bottom--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}
        };
        System.out.println(Arrays.deepToString(interchangeRows(arr)));
    }
}
