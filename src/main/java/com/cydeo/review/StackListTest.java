package com.cydeo.review;

import java.util.ArrayList;


public class StackListTest {
    public static void main(String[] args) {

        StackWithList<Integer> myStack = new StackWithList<>(new ArrayList<>());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println(myStack.pop());

    }
}
