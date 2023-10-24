package Matrices;

// Given a 2D array, print it in spiral form.
// https://media.geeksforgeeks.org/wp-content/uploads/20200421034622/untitled1810.png

public class SpiralTraversalOfMatrix {
    static void spiral(int[][] arr, int rows, int columns){
        int top = 0, right = columns - 1, bottom = rows - 1, left = 0;

        while(top <= bottom && left <= right){
            //Top row:
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;

            //Right column:
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;

            //Bottom row:
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            //Left column:
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
        };
        spiral(arr, arr.length, arr[0].length);
    }
}
