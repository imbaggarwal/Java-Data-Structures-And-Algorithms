package Strings;
import java.util.HashMap;

// You are given a string S (both uppercase and lowercase characters).
// You need to print the repeated character whose first appearance is leftmost.

public class LeftmostRepeatingCharacter {
    static int repeatingChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.get(str.charAt(i)) > 1){
                return str.indexOf(ch);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abccbd";

        System.out.println(repeatingChar(str));
    }
}
