package com.cydeo.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < 21; i++) {
            stack.push(i+=1);
        }
        System.out.println(stack);

//        Deque<Integer> myStack = new LinkedList<>();
        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < 21; i++) {
            myStack.push(i+=1);
        }
        System.out.println("myStack = " + myStack);

    }



}
