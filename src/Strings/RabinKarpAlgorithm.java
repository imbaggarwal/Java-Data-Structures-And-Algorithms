package Strings;

public class RabinKarpAlgorithm {
    static final int key = 256;
    static final int prime = 101;

    static void rabinKarp(String text, String pattern){
        int m = pattern.length();
        int n = text.length();

        int hash = 1;
        for(int i=1; i<=m-1; i++){
            hash = (hash * key) % prime;
        }

        int p = 0;
        int t = 0;
        for(int i=0; i<m; i++){
            p = (p * key + pattern.charAt(i)) % prime;
            t = (t * key + text.charAt(i)) % prime;
        }

        for(int i=0; i<=n-m; i++){
            if(p == t){
                boolean flag = true;
                for(int j=0; j<m; j++){
                    if(text.charAt(i + j) != pattern.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(i + " ");
                }
            }

            if(i < n - m){
                t = ((key * (t - text.charAt(i) * hash)) + text.charAt(i + m)) % prime;
                if (t < 0){
                    t += prime;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "abdabcbabc";
        String pattern = "abc";

        rabinKarp(text, pattern);
    }
}
