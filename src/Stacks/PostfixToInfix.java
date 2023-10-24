package Stacks;
import java.util.Stack;

//Question: https://practice.geeksforgeeks.org/problems/postfix-to-infix-conversion/1

//Solution:
public class PostfixToInfix {
    static String postToInfix(String str) {
        Stack<String> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(isOperand(ch)){
                stack.push(Character.toString(ch));
            }
            else{
                String a = stack.peek();
                stack.pop();
                String b = stack.peek();
                stack.pop();
                stack.push("(" + b + str.charAt(i) + a + ")");
            }
        }
        return stack.peek();
    }

    static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z');
    }

    public static void main(String[] args) {
        String str = "AB*C+";
        System.out.println(postToInfix(str));
    }
}
