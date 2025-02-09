package org.assessment_preparation.balanced_brackets;

import java.util.Stack;

public class BalancedBrackets {

/*
    Task 4: Balanced Brackets
    Write a function that determines if a given string has balanced brackets. The brackets include {}, [], and ().

    Function Signature:
    public static boolean isBalanced(String s)
    Examples:
    Input: "([]){}"
    Output: true
    Input: "[({})]"
    Output: true
    Input: "{[(])}"
    Output: false
    Input: "("
    Output: false
    Constraints:
The input string can contain any characters, but only bracket characters need to be balanced.
 */

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '(' && close == ')') ||
               (open == '[' && close == ']');
    }

}
