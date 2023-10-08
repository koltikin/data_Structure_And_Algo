package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class QueueWithList<E> {
    List<E> list;

    public QueueWithList() {
        this.list = new ArrayList<>();
    }
    public void enQueue(E e){
        list.add(e);
    }

    public E deQueue(){
        E result = list.get(0);
        list.remove(0);
        return result;
    }
}
