package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    static int[] merge(int[] array1, int[] array2, int m, int n){
        int[] array = new int[m + n];

        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(array1[i] < array2[j]){
                array[k] = array1[i];
                k++;
                i++;
            }
            else{
                array[k] = array2[j];
                k++;
                j++;
            }
        }
        while(i < m){
            array[k] = array1[i];
            k++;
            i++;
        }
        while(j < n){
            array[k] = array2[j];
            k++;
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1,3,4,6};
        int[] array2 = {2,5,7,8};
        int m = array1.length;
        int n = array2.length;

        System.out.println(Arrays.toString(merge(array1, array2, m, n)));
    }
}
