package Strings;

public class LexicographicRankOfString {
    static final int CHAR = 256;
    static int findRank(String str){
        int n = str.length();
        int ans = 1;
        int fact = factorial(n);
        int[] count = new int[CHAR];

        for(int i=0; i<n; i++){
            count[str.charAt(i)]++;
        }

        for(int i=1; i<CHAR; i++){
            count[i] += count[i - 1];
        }

        for(int i=0; i<n-1; i++){
            fact /= (n - i);
            ans = ans + count[str.charAt(i) - 1] * fact;

            for(int j=str.charAt(i); j<CHAR; j++){
                count[j]--;
            }
        }
        return ans;
    }

    static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        String str = "BHAVYA";

        System.out.println(findRank(str));
    }
}
