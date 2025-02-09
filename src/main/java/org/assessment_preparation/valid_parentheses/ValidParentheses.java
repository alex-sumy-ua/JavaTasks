package org.assessment_preparation.valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

//    Problem 2: Valid Parentheses (Medium)
//    Given a string s containing just the characters (, ), {, }, [ and ], determine if the input string is valid.
//
//            Rules
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//            Input
//    s = "()[]{}"
//    Output
//    true
//    Input
//    s = "(]"
//    Output
//    false

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) { return false; }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' & top != '[')) { return false; }
            }
        }
        return stack.isEmpty();
    }
}
