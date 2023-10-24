package Matrices;

// Given a matrix of size N x N.
// Print the elements of the matrix in the snake like pattern
// depicted below.
// https://contribute.geeksforgeeks.org/wp-content/uploads/snake-pattern.jpg

public class SnakePattern {
    static void snake(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i % 2 == 0){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print(arr[i][arr[i].length - j - 1] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        snake(arr);
    }
}
