package Sorting;

// Intersection
//
// 1. Iterate in while loop till any of the one array is finished.
// 2. In each iteration we look for smaller of the two elements from
// both the array and increase its pointer because it will not be in other list,
// hence not part of intersection.
// 3. For intersection, if both the elements are equal we print it and
// increment both pointer only if it is not same as the last element printed in intersection.

public class IntersectionOfSortedArrays {
    static void intersection(int[] arr1, int[] arr2, int m, int n){
        int i = 0, j = 0;
        while(i < m &&  j < n){
            if(i > 0 && arr1[i] == arr1[i - 1]){
                i++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5,10,10,20,20,25,30};
        int[] arr2 = {5,10,35};

        int m = arr1.length;
        int n = arr2.length;

        intersection(arr1, arr2, m, n);
    }
}
