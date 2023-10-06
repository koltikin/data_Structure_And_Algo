package com.cydeo.linkedList.demo;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }
    void add(int data){
        Node node = new Node(data);
        if (isEmpty()){
            head = tail = node;
            size ++;
        }else {
            tail.next = node;
            tail = node;
            size++;
        }

    }
    void deleteById(int id){
            // check if empty
        if (isEmpty()) System.out.println("List is empty!!!");
        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.id == id) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }
    int indexOf(int id){
        if (isEmpty()) return -1;
        int position = 0;
        Node current = head;
        while (current != null){
            if (current.id == id ){
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }

    void addFirst(int data){
        Node node = new Node(data);
        if (isEmpty()){
           head = tail = node;
           size++;
        } else {
            node.next = head;
            head = node;
            size ++;
        }
    }
    void printNode(){
        Node current = head;
        while (current != null){
            if (current.next == null) System.out.println(current.id + "=>null");
            else {
                System.out.print(current.id + "=> ");

            }
            current = current.next;

        }
    }
}
