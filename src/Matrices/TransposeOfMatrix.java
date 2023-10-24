package Matrices;

import java.util.Arrays;

public class TransposeOfMatrix {
    static int[][] transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                swap(arr, i, j);
            }
        }
        return arr;
    }

    static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
}
