package com.cydeo.review;

import java.util.List;

public class StackWithList<E> {
    List<E> list;

    public StackWithList(List<E> list) {
        this.list = list;
    }

    public void push(E e){
        list.add(0,e);
    }
    public E pop(){
        E result = list.get(0);
        list.remove(0);
        return result;

    }
}
