package Matrices;
import java.util.Arrays;

// The Addition is one of the easiest operations to carry out.
// The same holds true for matrices. Two matrices can be added only
// if they have the same dimensions. The elements at similar positions
// get added.
//
// Given two matrices A and B having (n1 x m1) and (n2 x m2) dimensions respectively.
// Add A and B.

public class AddingTwoMatrices {
    static int[][] add(int[][] arr1, int[][] arr2){
        int m = arr1.length;
        int n = arr1[0].length;

        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{8,7,6},{5,4,3}};

        System.out.println(Arrays.deepToString(add(arr1, arr2)));
    }
}
