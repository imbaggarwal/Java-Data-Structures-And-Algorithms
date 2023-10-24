package Hashing;
import java.util.ArrayList;
import java.util.HashSet;

public class PositiveNegativePair {
    public static ArrayList<Integer> findPairs(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(-num)){
                list.add(-Math.abs(num));
                list.add(Math.abs(num));
            }
            set.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,2,3,4,-2,-3,-4};
        System.out.println(findPairs(arr));
    }
}
