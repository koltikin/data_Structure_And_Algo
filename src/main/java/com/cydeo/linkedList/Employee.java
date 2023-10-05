package com.cydeo.linkedList;

import lombok.Data;

@Data
public class Employee {
    int id;
    String name;
    Employee next;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
