package Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Given a string str of lowercase alphabets.
// The task is to find the maximum occurring character in the string str.
// If more than one character occurs the maximum number of time then
// print the lexicographically smaller character.

public class MaximumOccurringCharacter {
    static Character find(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<>();

        int max = Collections.max(map.values());

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(max)){
                list.add(entry.getKey().toString().charAt(0));
            }
        }
        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(find(str));
    }
}
