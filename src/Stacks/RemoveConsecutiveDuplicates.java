package Stacks;
import java.util.Stack;

// Ques: https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1

// Solution:
public class RemoveConsecutiveDuplicates {
    static String removeConsecutiveCharacter(String S){
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(char ch : S.toCharArray()){
            if(stack.empty() || stack.peek() != ch){
                stack.push(ch);
            }
        }
        for(char ch : stack){
            ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbaabbcccaabbbaaab";
        System.out.println(removeConsecutiveCharacter(str));
    }
}
