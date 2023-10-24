package Stacks;

// Ques: https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

import java.util.Stack;

// Solution:
public class ParenthesisChecker {
    static boolean ispar(String x){
        Stack<Character> stack = new Stack<>();

        if(x.length() % 2 != 0) return false;

        for(int i=0; i<x.length(); i++){
            char ch = x.charAt(i);

            if(ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.empty()) return false;

                if(ch == ')' && stack.peek() != '('){
                    return false;
                }
                else if(ch == ']' && stack.peek() != '['){
                    return false;
                }
                else if(ch == '}' && stack.peek() != '{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "{}{({}[])}[]";
        System.out.println(ispar(str));
    }
}
