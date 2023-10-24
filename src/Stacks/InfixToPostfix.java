package Stacks;

// Question: https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1

import java.util.ArrayDeque;
import java.util.Deque;

//Solution:
public class InfixToPostfix {
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }

            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && Prec(ch) <= Prec(stack.peek())){
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            result.append(stack.peek());
            stack.pop();
        }
        return result.toString();
    }

    private static int Prec(char x){
        return switch (x) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(str));
    }
}
