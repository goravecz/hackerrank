package _java.datastructures.javastack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String brackets = scanner.next();
            System.out.println(isBalanced(brackets));
        }
    }

    private static boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack();
        boolean balanced = true;
        for (int i = 0; i < brackets.length(); i++) {
            Character bracket = brackets.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (!stack.isEmpty()) {
                    if ((bracket == ']' && stack.peek() == '[') ||
                            (bracket == '}' && stack.peek() == '{') ||
                            (bracket == ')' && stack.peek() == '(')) {
                        stack.pop();
                    }
                } else {
                    balanced = false;
                    break;
                }
            }
        }

        return balanced && stack.isEmpty();
    }
}
