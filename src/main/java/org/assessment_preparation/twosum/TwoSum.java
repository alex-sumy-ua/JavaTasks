package org.assessment_preparation.twosum;

import java.util.HashMap;

public class TwoSum {

//    Problem 1: Two Sum (Easy)
//    Given an array of integers nums and a target integer target, return the indices of the two numbers such that they add up to the target.
//    Input
//    nums = [2, 7, 11, 15]
//    target = 9
//    Output
//    [0, 1]
//    Constraints
//    Each input will have exactly one solution.
//    You may not use the same element twice.

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
