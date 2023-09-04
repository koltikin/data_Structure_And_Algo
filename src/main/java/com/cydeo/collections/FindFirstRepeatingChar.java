package com.cydeo.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingChar {
    public static void main(String[] args) {
        String str = "java Developer";

        System.out.println(findRepeatingChar(str));
    }

    private static Character findRepeatingChar(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) return c;

        }

        return null;
    }
}
