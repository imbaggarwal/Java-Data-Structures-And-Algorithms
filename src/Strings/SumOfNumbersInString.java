package Strings;

// Given a string str containing alphanumeric characters.
// The task is to calculate the sum of all the numbers present in the string.

public class SumOfNumbersInString {
    static int findSum(String str){
        int sum = 0;
        int num = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = num * 10 + str.charAt(i) - '0';
            }
            else{
                if(num != 0){
                    sum += num;
                    num = 0;
                }
            }
        }
        if(num != 0){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "22HeyThere11";

        System.out.println(findSum(str));
    }
}
