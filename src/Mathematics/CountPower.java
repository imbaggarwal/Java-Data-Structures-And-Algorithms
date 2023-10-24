package Mathematics;

//Given two integers x and n,
// write a function to compute xn.
// We may assume that x and n are small
// and overflow doesn’t happen.

public class CountPower {
    static int power(int num, int p){
        int temp;
        if(p == 0) return 1;

        temp = power(num, p / 2);

        if(p % 2 == 0){
            return temp * temp;
        }
        else{
            return num * temp * temp;
        }
    }

    public static void main(String[] args) {
        int num = 2;
        int p = 3;

        System.out.println(power(num,p));
    }
}
