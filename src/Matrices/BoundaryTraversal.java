package Matrices;

// You are given a matrix of dimensions n x m.
// The task is to perform boundary traversal on the matrix in a clockwise manner.

// For eg:
// Matrix A:  1 2 3 4
//            5 6 7 8
//            9 10 11 12
//            13 14 15 16
// Boundary Traversal: 1 2 3 4 8 12 16 15 14 13 9 5

public class BoundaryTraversal {
    static void boundary(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;

        if(rows == 1){
            for(int i=0; i<columns; i++){
                System.out.print(arr[0][i] + " ");
            }
        }
        else if(columns == 1){
            for(int i=0; i<rows; i++){
                System.out.print(arr[i][0] + " ");
            }
        }
        else{
            for(int i=0; i<columns; i++){
                System.out.print(arr[0][i] + " ");
            }
            for(int i=1; i<rows; i++){
                System.out.print(arr[i][columns - 1] + " ");
            }
            for(int i=columns-2; i>=0; i--){
                System.out.print(arr[rows - 1][i] + " ");
            }
            for(int i=rows-2; i>=1; i--){
                System.out.print(arr[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        boundary(arr);
    }
}
