package Matrices;

// Given a matrix of dimensions n1 x m1.
// Reverse its columns in-place such that the
// last column will become the first column and so on.

import java.util.Arrays;

public class ExchangeColumns {
    static int[][] reverseCol(int[][] arr){
        // code here
        int low = 0;
        int high = arr[0].length - 1;

        while(low < high){
            for(int i=0; i<arr.length; i++){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
            }
            low++;
            high--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.deepToString(reverseCol(arr)));
    }
}
