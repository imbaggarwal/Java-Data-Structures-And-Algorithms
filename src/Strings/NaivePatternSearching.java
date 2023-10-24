package Strings;
import java.util.ArrayList;

// Given a string text and a pattern both of lowercase characters.
// The task is to check if the given pattern exists in the given string or not.

public class NaivePatternSearching {
    static ArrayList<Integer> findPattern(String text, String pattern){
        ArrayList<Integer> list = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();

        for(int i=0; i<=n-m; i++){
            int j;
            for(j=0; j<m; j++){
                if(pattern.charAt(j) != text.charAt(i + j)){
                    break;
                }
            }
            if(j == m){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String text = "ABCABCDABCD";
        String pattern = "ABCD";

        System.out.println(findPattern(text, pattern));
    }
}
