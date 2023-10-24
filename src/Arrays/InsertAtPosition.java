package Arrays;

import java.util.Arrays;

// Inserting a new element in an array
// at a given position.
public class InsertAtPosition {
    static int[] insert(int[] arr, int n, int cap, int x, int pos){
        if(n == cap){
            return arr;   //No insertion possible as array is full.
        }

        int index = pos - 1;   //0-based index

        for(int i=n-1; i>=index; i--){
            arr[i + 1] = arr[i];
        }

        arr[index] = x;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,20,0,0};
        int n = 3;
        int cap = 5;
        int pos = 3;
        int x = 15;

        System.out.println(Arrays.toString(insert(arr, n, cap, x, pos)));
    }
}
