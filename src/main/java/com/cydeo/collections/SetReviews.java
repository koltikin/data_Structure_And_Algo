package com.cydeo.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReviews {

    public static void main(String[] args) {
        // create set

        Set<Student> set = new LinkedHashSet<>();

        set.add(new Student(1,"alim"));
        set.add(new Student(2,"abdullah"));
        set.add(new Student(3,"yusuf"));
        set.add(new Student(4,"mike"));
        set.add(new Student(5,"john"));
        set.add(new Student(5,"john"));

        System.out.println(set.add(new Student(5,"john")));

        System.out.println(set);




    }
}
