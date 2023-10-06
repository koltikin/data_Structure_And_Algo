package com.cydeo.stack;

import java.util.NoSuchElementException;

public class MyStack <T>{
    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom == null;
    }
    public void push(T item){
        SNode<T> node = new SNode<>(item);
        if (isEmpty()) bottom = top = node;

        else {
            top.next=node;
            top = node;
        }
        size++;
    }
    public T peek(){
        return (T) top.value;
    }

    public T pop(){
        SNode peekNode;
        if (isEmpty()) throw new NoSuchElementException();

        if (top==bottom){
            peekNode = top;
            top=bottom=null;
            size--;
        }
        else {
            peekNode = top;
            SNode prev = bottom;
            while (prev.next != top){

            }
            prev.next = null;
        }
        size--;
        return (T)peekNode.value;
    }

}
