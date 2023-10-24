package Strings;
import java.util.Collections;
import java.util.HashMap;

// Given a string S of lowercase alphabets, check if it is isogram or not.
// An Isogram is a string in which no letter occurs more than once.

public class IsogramString {
    static boolean isIsogram(String data){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<data.length(); i++){
            char ch = data.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return Collections.max(map.values()) == 1;
    }

    public static void main(String[] args) {
        String data = "HELLO";

        System.out.println(isIsogram(data));
    }
}
