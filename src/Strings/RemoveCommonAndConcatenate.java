package Strings;

// Given two strings s1 and s2. Modify both the strings such that all the
// common characters of s1 and s2 are to be removed and the uncommon characters
// of s1 and s2 are to be concatenated.

// Note: If all characters are removed, print -1.

public class RemoveCommonAndConcatenate {
    public static String concatenatedString(String s1,String s2){
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s1.length(); i++){
            if(!s2.contains(Character.toString(s1.charAt(i)))){
                ans.append(s1.charAt(i));
            }
        }

        for(int i=0; i<s2.length(); i++){
            if(!s1.contains(Character.toString(s2.charAt(i)))){
                ans.append(s2.charAt(i));
            }
        }

        if(ans.toString().equals("")){
            return "-1";
        }
        else{
            return ans.toString();
        }
    }

    public static void main(String[] args) {
        String str1 = "aacdb";
        String str2 = "gafd";

        System.out.println(concatenatedString(str1, str2));
    }
}
