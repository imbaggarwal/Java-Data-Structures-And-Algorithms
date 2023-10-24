package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    static int[] bucketSort(int[] arr, int n, int k){
        int max = arr[0];
        for(int num : arr){
            max = Math.max(max, num);
        }
        max++;

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n; i++){
            buckets.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++){
            int index = (arr[i] * k) / max;
            buckets.get(index).add(arr[i]);
        }

        for(int i=0; i<k; i++){
            Collections.sort(buckets.get(i));
        }

        int index = 0;
        for(int i=0; i<k; i++){
            for(int j=0; j<buckets.get(i).size(); j++){
                arr[index] = buckets.get(i).get(j);
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20,80,10,85,75,99,18};
        int n = arr.length;
        int k = 5;

        System.out.println(Arrays.toString(bucketSort(arr, n, k)));
    }
}
