package Searching;

// Given array size n,
// task is to find repeated element.
// Array has numbers from 1 to n - 1.

public class FindRepeatedNumber {
    static int repeat(int[] arr, int n){
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);

        slow = arr[0];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5,7,3};
        int n = 8;

        System.out.println(repeat(arr, n));
    }
}
