package com.cydeo.assignment;

import java.util.Deque;
import java.util.LinkedList;

public class SymbolBalancing {
    public static void main(String[] args) {

        String expr = "(A-b)/[8+4]*({5-p}+78)([)";
        System.out.println(balanceCheck(expr));

    }
    public static boolean balanceCheck(String expr){
        Deque<Character> myStack = new LinkedList<>();
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') continue;
            if (ch == '(' || ch == '[' || ch == '{'){
                myStack.push(ch);
                continue;
            }
            if (myStack.isEmpty()) return false;

            switch (ch){
                case ')':
                    if (myStack.pop() != '(') return false;
                    break;
                case ']':
                    if (myStack.pop() != '[') return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }

        }
        return myStack.isEmpty();
    }
}
