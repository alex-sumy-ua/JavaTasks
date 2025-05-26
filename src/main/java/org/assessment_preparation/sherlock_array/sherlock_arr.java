package org.assessment_preparation.sherlock_array;

import java.util.List;

public class sherlock_arr {
    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.size(); i++) {
            totalSum -= arr.get(i); // totalSum now becomes rightSum

            if (leftSum == totalSum) {
                return "YES: " + "arr" + i + " = " + arr.get(i);
            }

            leftSum += arr.get(i);
        }

        return "NO";

    }
}
