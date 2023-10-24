package Hashing;

// Given two integer arrays A1[ ] and A2[ ] of size N and M respectively.
// Sort the first array A1[ ] such that all the relative positions of the elements
// in the first array are the same as the elements in the second array A2[ ].
//
// Note: If elements are repeated in the second array, consider their first occurrence only.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortArrayAccordingToOther {
    static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[N];

        for(int num : A1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for(int i=0; i<M; i++){
            while(map.get(A2[i]) != null){
                ans[index++] = A2[i];

                map.put(A2[i], map.get(A2[i]) - 1);
                if(map.get(A2[i]) == 0){
                    map.remove(A2[i]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            for(int j=0; j<map.get(num); j++){
                list.add(num);
            }
        }
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            ans[i + index] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2 = {2,1,8,3};
        int n = arr1.length;
        int m = arr2.length;

        System.out.println(Arrays.toString(sortA1ByA2(arr1, n, arr2, m)));
    }
}
