package leetcode;

import java.util.Stack;

// 1021. Remove Outermost Parentheses
// https://leetcode.com/problems/remove-outermost-parentheses/description/
public class Remove_Outermost_Parentheses_1021 {
    // With stack
    public String removeOuterParentheses_(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = -1;
        for(int i = 0; i < s.length(); i++) {
            if (stack.size() == 0) {
                start = i;
            }
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
            }
            if (stack.size() == 0) {
                sb.append(s.substring(start+1,i));
            }
        }
        return sb.toString();
    }

    // With int
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int start = -1;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) sb.append("(");
                count++;
            } else {
                count--;
                if (count > 0) sb.append(")");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Remove_Outermost_Parentheses_1021 obj = new Remove_Outermost_Parentheses_1021();
        String  s = "(()())(())";
        String s1 = "(()())(())(()(()))";
        String s2 = "()()";
        System.out.println(obj.removeOuterParentheses(s1));
    }
}
