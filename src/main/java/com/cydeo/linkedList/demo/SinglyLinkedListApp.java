package com.cydeo.linkedList.demo;


public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i <10 ; i++) {
            myList.add(i);

        }
        myList.printNode();

        myList.deleteById(1);
        myList.deleteById(8);
        myList.deleteById(10);

        myList.printNode();
        System.out.println(myList.size);

    }
}
