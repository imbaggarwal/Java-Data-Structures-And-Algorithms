package Strings;

// Given a String S, reverse the string without reversing its
// individual words. Words are separated by dots.

public class ReverseWordsInString {
    static char[] reverseWords(char[] str){
        int n = str.length;
        int start = 0;

        for(int end=0; end<n; end++){
            if(str[end] == ' '){
                reverse(str, start, end - 1);   //Reverse individual words
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);     //Reverse last word
        reverse(str, 0, n - 1);     //Reverse whole character array

        return str;
    }

    static void reverse(char[] str, int low, int high){
        while(low < high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'w','e','l','c','o','m','e',' ','t','o',' ','m','y',' ','w','o','r','l','d'};

        System.out.println(reverseWords(str));
    }
}
