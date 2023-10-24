package Searching;

// Floor of square root of a number
// using binary search.

public class SquareRoot {
    static long sqrt(long num){
        long low = 0;
        long high = num;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long sqrtAns = mid * mid;

            if(sqrtAns == num){
                return mid;
            }
            else if(sqrtAns > num){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long num = 2147395599;
        System.out.println(sqrt(num));
    }
}
