package Searching;

//Linear search

public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 70;

        System.out.println(linearSearch(arr, target));
    }
}
