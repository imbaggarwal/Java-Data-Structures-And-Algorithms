package Stacks;
import java.util.Stack;

//Question: https://practice.geeksforgeeks.org/problems/prefix-to-infix-conversion/1

//Solution:
public class PrefixToInfix {
    static String preToInfix(String str) {
        Stack<String> stack = new Stack<>();

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);

            if(isOperand(ch)){
                stack.push(Character.toString(ch));
            }
            else{
                String a = stack.peek();
                stack.pop();
                String b = stack.peek();
                stack.pop();
                stack.push("(" + a + str.charAt(i) + b + ")");
            }
        }
        return stack.peek();
    }

    static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z');
    }

    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        System.out.println(preToInfix(str));
    }
}
