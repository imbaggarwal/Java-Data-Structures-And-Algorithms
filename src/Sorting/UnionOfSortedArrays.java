package Sorting;

// Given two sorted arrays that represent two sets
// (elements in every array are distinct), find the union
// of two arrays.

public class UnionOfSortedArrays {
    static void union(int[] arr1, int[] arr2, int m, int n){
        int i = 0, j = 0;
        while(i < m && j < n){
            if(i > 0 && arr1[i] == arr1[i - 1]){
                i++;
                continue;
            }
            if(j > 0 && arr2[j] == arr2[j - 1]){
                j++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while(i < m){
            if(i == 0 || arr1[i] != arr1[i - 1]){
                System.out.print(arr1[i] + " ");
            }
            i++;
        }
        while(j < n){
            if(j == 0 || arr2[j] != arr2[j - 1]){
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4};
        int[] arr2 = {6, 6, 17, 17, 24, 30, 30, 33, 37, 38, 38, 39, 40, 44, 46, 47, 48, 50, 50};
        int m = arr1.length;
        int n = arr2.length;

        union(arr1, arr2, m, n);
    }
}
