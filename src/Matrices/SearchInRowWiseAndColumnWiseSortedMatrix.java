package Matrices;

public class SearchInRowWiseAndColumnWiseSortedMatrix {
    static  void search(int[][] arr, int rows, int columns, int x){
        int i = 0;
        int j = columns - 1;

        while(i < rows && j >= 0){
            if(arr[i][j] == x){
                System.out.println("Found At: (" + i + ", " + j + ")");
                return;
            }
            else if(x < arr[i][j]){         //Move towards left
                j--;
            }
            else{
                i++;                        //Move downwards
            }
        }
        System.out.println("Element Not Found!");
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int rows = arr.length;
        int columns = arr[0].length;
        int x = 29;

        search(arr, rows, columns, x);
    }
}
