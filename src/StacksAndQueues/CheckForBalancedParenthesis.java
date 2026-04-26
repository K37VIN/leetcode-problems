package StacksAndQueues;

import java.util.*;

public class CheckForBalancedParenthesis {

    public boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {

            // If opening bracket → push
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }

            // If closing bracket → check
            else if (c == ')' || c == '}' || c == ']') {

                if (st.isEmpty()) return false;

                char ch = st.pop();

                if ((ch == '(' && c != ')') ||
                        (ch == '{' && c != '}') ||
                        (ch == '[' && c != ']')) {
                    return false;
                }
            }
        }

        // If stack empty → balanced
        return st.isEmpty();
    }
}