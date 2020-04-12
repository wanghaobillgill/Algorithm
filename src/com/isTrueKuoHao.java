package com;

import sun.security.util.Length;

import java.util.Stack;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/4/7 19:34
 * @Project Algorithm
 */
public class isTrueKuoHao {
    public static void main(String[] args) {
        System.out.println(isValid("(())"));
    }

    public static boolean isValid(String s) {
        if ("{".equals(s) || "(".equals(s) || "[".equals(s) || "]".equals(s)
                || ")".equals(s) || "}".equals(s)) {
            return false;
        }
        Stack<Character> charactersStart = new Stack<>();
        Stack<Character> charactersEnd = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            charactersStart.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            Character pop = charactersStart.pop();
            if (pop == '}' || pop == ')' || pop == ']') {
                charactersEnd.push(pop);
            } else if (charactersEnd.isEmpty()) {
                charactersEnd.push(pop);
            } else {
                if (pop == '{' && charactersEnd.peek() == '}') {
                    charactersEnd.pop();
                } else if (pop == '[' && charactersEnd.peek() == ']') {
                    charactersEnd.pop();
                } else if (pop == '(' && charactersEnd.peek() == ')') {
                    charactersEnd.pop();
                } else
                    charactersEnd.push(pop);
            }
        }
        return charactersEnd.isEmpty();
    }
}
