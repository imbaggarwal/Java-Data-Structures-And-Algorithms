package Searching;

//Given two sorted arrays of sizes N and M respectively.
//The task is to find the median of the two arrays when they get merged.
//If there are even number of elements in the resulting array,
// find the floor of the average of two medians.

public class MedianInSortedArrays {
    static double getMedian(int[] array1, int[] array2, int n1, int n2){
        int begin1 = 0, end1 = n1;

        while(begin1 <= end1){
            int i1 = (begin1 + end1) / 2;
            int i2 = ((n1 + n2 + 1) / 2 ) - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : array1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : array1[i1 - 1];

            int min2 = (i2 == n2) ? Integer.MAX_VALUE : array2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : array2[i2 - 1];

            if(max1 <= min2 && max2 <= min1){
                if((n1 + n2) % 2 == 0)
                    return ((double)Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                else
                    return (double)Math.max(max1, max2);
            }
            else if(max1 > min2)
                end1 = i1 - 1;
            else
                begin1 = i1 + 1;
        }

        return -1;
    }

    public static void main(String[] args){

        int[] array1 = {10, 20, 30, 40, 50};
        int n1 = 5;
        int[] array2 = {5, 15, 25, 35, 45};
        int n2 = 5;

        System.out.println(getMedian(array1, array2, n1, n2));
    }
}
