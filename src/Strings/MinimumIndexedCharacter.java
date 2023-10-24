package Strings;
import java.util.HashMap;

//Given a string str and another string patt.
// Find the minimum index of the character in str that is also present in patt.

public class MinimumIndexedCharacter {
    static int minIndexChar(String str, String patt){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!map.containsKey(ch)){
                map.put(ch, i);
            }
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<patt.length(); i++){
            char ch = patt.charAt(i);

            if(map.containsKey(ch) && map.get(ch) < ans){
                ans = Math.min(ans, map.get(ch));
            }
        }
        return ans != Integer.MAX_VALUE ? ans : -1;
    }

    public static void main(String[] args) {
        String str = "adcffaet";
        String patt = "onkl";

        System.out.println(minIndexChar(str, patt));
    }
}
