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
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    int getKthFromLast(int k){
        if (isEmpty() || k > size) return -1;
        if (k == size) return head.id;
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        while (p1 != null){
            p1  = p1.next;
            p2 = p2.next;
        }
        return p2.id;

    }
    public void removeKthFromLast(int k){
        Node p1 = head;
        Node p2 = head;
        Node current = head;
        if (k == size){
            head = head.next;
            current.next = null;
        }
        if (k < size){
            for (int i = 0; i < k; i++) {
                p1 = p1.next;
            }
            while (p1.next != null){
                p1 = p1.next;
                p2 = p2.next;
            }
            current = p2.next;
            p2.next = p2.next.next;
            current.next = null;
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
