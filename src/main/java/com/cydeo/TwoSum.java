package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 9, 5, 2, 7, 11, 15};
        int target = 8;

        System.out.println(Arrays.toString(findTarget(nums, target)));


    }

    private static int[] findTarget(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }

                }

            }

        }
        return new int[]{};
    }

}






//
//Problem: Two Sum
//
//        • Given an array of integers nums and an integer target, return indices of the two
//        numbers such that they add up to target.
//        • You may assume that each input would have exactly one solution, and you
//        may not use the same element twice.
//        • You can return the answer in any order.
//        • No solution will return empty array.
//
//        Example:
//        Input: nums = [2, 7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].