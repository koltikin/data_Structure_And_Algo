package com.cydeo.stack.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 1, 3,2};
        sunsetViews1(buildings,"west").forEach(System.out::println);
    }

    private static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int step = 1;
        if (direction.equalsIgnoreCase("west")){
            i = buildings.length-1;
            step = -1;
        }
        while (i >= 0 && i < buildings.length) {
            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i += step;

        }
        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);

        return new ArrayList<>(stack);
    }

    private static ArrayList<Integer> sunsetViews1(int[] buildings, String direction) {
        Stack<Integer> stack = new Stack<>();
        int i = buildings.length-1;
        int step = -1;
        if (direction.equalsIgnoreCase("west")){
            i = 0;
            step = 1;
        }
        while (i>=0 && i< buildings.length) {
            if (!stack.isEmpty() && buildings[i] < buildings[stack.peek()]){
                i += step;
                continue;
            }
            stack.push(i);
            i += step;
        }
        if (direction.equalsIgnoreCase("east"))Collections.reverse(stack);

        return new ArrayList<>(stack);
    }
}
