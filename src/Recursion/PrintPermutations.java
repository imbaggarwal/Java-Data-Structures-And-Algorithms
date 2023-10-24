package Recursion;

//Given a string, print all permutations of it.

public class PrintPermutations {
    static void permute(String str, int i){
        if(i == str.length() - 1){
            System.out.println(str);
            return;
        }
        for(int j=i; j<str.length(); j++){
            str = swap(str, i, j);
            permute(str, i + 1);
            str = swap(str, i, j);
        }
    }

    private static String swap(String str, int i, int j){
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0);
    }
}
