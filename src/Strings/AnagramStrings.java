package Strings;

// Given two strings a and b consisting of lowercase characters.
// The task is to check whether two given strings are an anagram of each other or not.

// An anagram of a string is another string that contains the same characters,
// only the order of characters can be different.
// For example, act and tac are an anagram of each other.

public class AnagramStrings {
    static boolean isAnagram(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        if(n != m) return false;

        int[] charCount = new int[256];

        for(int i=0; i<n; i++){
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for(int num : charCount){
            if(num != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "AABCCD";
        String str2 = "AACDCB";

        System.out.println(isAnagram(str1, str2));
    }
}
