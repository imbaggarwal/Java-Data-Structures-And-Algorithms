package Strings;

// Given two strings str1 and str2, find if str2 is a subsequence of str1.
// A subsequence is a sequence that can be derived from another sequence by
// deleting some elements without changing the order of the remaining elements.

public class SubSequenceOfString {
    static boolean isSubSequence(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int j = 0;

        for(int i=0; i < m && j < n; i++){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
        }
        return j == n;
    }

    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "ADE";

        System.out.println(isSubSequence(str1, str2));
    }
}
