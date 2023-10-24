package Matrices;

// A beautiful matrix is a matrix in which
// the sum of elements in each row and column is equal.

// Given a square matrix of size NxN.
// Find the minimum number of operation(s) that are
// required to make the matrix beautiful.
// In one operation you can increment the value of any one cell by 1.

public class BeautifulMatrix {
    static int findMinOperation(int[][] arr, int n){
        // code here
        int max = 0;
        for(int i=0; i<n; i++){
            int rowSum = 0;
            for(int j=0; j<n; j++){
                rowSum += arr[i][j];
            }
            max = Math.max(max, rowSum);
        }

        for(int i=0; i<n; i++){
            int colSum = 0;
            for(int j=0; j<n; j++){
                colSum += arr[j][i];
            }
            max = Math.max(max, colSum);
        }

        int minOps = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }
            minOps += (max - sum);
        }
        return minOps;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4}
        };
        int n = arr.length;
        System.out.println(findMinOperation(arr, n));
    }
}
