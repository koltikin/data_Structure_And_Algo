package com.cydeo.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"ziya");
        Employee emp2 = new Employee(2,"yusuf");
        Employee emp3 = new Employee(3,"adil");

        emp1.next = emp2;
        emp2.next = emp3;

        System.out.println(emp1.next);
        System.out.println(emp2.next);
        System.out.println(emp3.next);

        Employee current  = emp1;
        while (current != null){
            System.out.println(current.id);
            current = current.next;
        }

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
    }



}
