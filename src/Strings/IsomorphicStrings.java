package Strings;
import java.util.HashMap;

// Given two strings 'str1' and 'str2', check if these
// two strings are isomorphic to each other.
// Two strings str1 and str2 are called isomorphic if there is
// a one to one mapping possible for every character of str1 to
// every character of str2 while preserving the order.

// Note: All occurrences of every character in str1 should map to the same character in str2

public class IsomorphicStrings {
    static boolean areIsomorphic(String str1,String str2){
        HashMap<Character, Character> map = new HashMap<>();

        if(str1.length() != str2.length()) return false;

        for(int i=0; i<str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1) != c2){
                    return false;
                }
            }
            else if(map.containsValue(c2)){
                return false;
            }
            else{
                map.put(c1, c2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aab";
        String b = "xxy";

        System.out.println(areIsomorphic(a, b));
    }
}
