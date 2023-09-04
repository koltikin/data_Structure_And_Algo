package com.cydeo.collections;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"ziya"));
        students.add(new Student(2,"abdullah"));
        students.add(new Student(3,"yusuf"));
        students.add(new Student(4,"mike"));
        students.add(new Student(5,"john"));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("printing with iterator ..............");

        Iterator<Student> iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("printing Backwards with iterator ..............");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
        System.out.println("printing for each loop with lambda ..............");

        students.forEach(System.out::println);
        // sorting list
        System.out.println("sort with List.sort ..............");
        students.sort(Comparator.comparing(Student::getId).reversed());
        students.forEach(System.out::println);

        System.out.println("sort with List.sort ..............");
        students.sort(Comparator.comparing(Student::getName));
        students.forEach(System.out::println);

        System.out.println("sort with comparator ..............");
        Collections.sort(students,Comparator.comparing(Student::getId).reversed());
        students.forEach(System.out::println);


    }
}
