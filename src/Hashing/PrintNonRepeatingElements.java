package Hashing;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNonRepeatingElements {
    static ArrayList<Integer> printNonRepeated(int[] arr){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6,7};
        System.out.println(printNonRepeated(arr));
    }
}
