package com.cydeo.stack;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 0; i < 6; i++) {
            myStack.push(i);
        }
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        myStack.push(10);

        System.out.println(myStack.peek());



    }
}
