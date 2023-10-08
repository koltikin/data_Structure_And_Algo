package com.cydeo.review;

import java.util.ArrayList;

public class QueueListTest {
    public static void main(String[] args) {
        QueueWithList<Integer> myQueue = new QueueWithList<>();

        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);

        System.out.println(myQueue.deQueue());
    }
}
