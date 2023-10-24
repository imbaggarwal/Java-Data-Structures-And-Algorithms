package Strings;

public class StringPalindrome {
    static boolean isPalindrome(String str, int n){
        int start = 0;
        int end = n - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ABCCA";
        int n = str.length();

        System.out.println(isPalindrome(str, n));
    }
}
