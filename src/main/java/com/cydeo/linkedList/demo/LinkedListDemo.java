package com.cydeo.linkedList.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next= node3;
        node3.next= node4;


        System.out.println("Node1 NextAddress is: " + node1.next.id);
        System.out.println("Node2 NextAddress is: " + node2.next.id);
        System.out.println("Node3 NextAddress is: " + node3.next.id);
        System.out.println("Node4 NextAddress is: " + node4.next);

        Node current;
        current = node1;
        while (current != null){
            System.out.println("Id of the node is: " + current.id);
            current = current.next;
        }
        ArrayList<Node> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(node1);
        nodeArrayList.add(node2);
        nodeArrayList.add(node3);
        nodeArrayList.add(node4);

        for (Node node : nodeArrayList) {
            System.out.println(node.id);

        }
    }

}
