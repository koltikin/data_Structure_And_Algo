package com.cydeo.linkedList.demo;


public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        myList.addFirst(5);

        for (int i = 0; i <10 ; i++) {
            myList.addFirst(i);

        }
        myList.printNode();

        myList.deleteById(1);
        myList.deleteById(8);
        myList.deleteById(10);

        myList.printNode();
//        System.out.println(myList.size);
//
//        System.out.println(myList.indexOf(8));
//        System.out.println(myList.indexOf(3));
//        System.out.println(myList.indexOf(0));

        myList.addFirst(12);
        myList.printNode();
        System.out.println("5th element from last: " + myList.getKthFromLast(5));
        System.out.println("10th element from last: " + myList.getKthFromLast(10));
        System.out.println("13th element from last: " + myList.getKthFromLast(13));

    }
}
