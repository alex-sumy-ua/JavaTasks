package org.assessment_preparation.latest_time_finder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestTimeFinder {
    public static String findLatestTime(int d1, int d2, int d3, int d4) {
        int[] digits = {d1, d2, d3, d4};
        List<String> validTimes = new ArrayList<>();

        // Generate all permutations
        permuteAndCheck(digits, 0, validTimes);

        if (validTimes.isEmpty()) {
            return "No valid time";
        }

        // Return the latest valid time
        return Collections.max(validTimes);
    }

    private static void permuteAndCheck(int[] digits, int index, List<String> validTimes) {
        if (index == digits.length) {
            String time = formTime(digits);
            if (time != null) {
                validTimes.add(time);
            }
        }

        for (int i = index; i < digits.length; i++) {
            swap(digits, i, index);
            permuteAndCheck(digits, index + 1, validTimes);
            swap(digits, i, index); // Backtrack
        }
    }

    private static void swap(int[] digits, int i, int j) {
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private static String formTime(int[] digits) {
        int hours = digits[0] * 10 + digits[1];
        int minutes = digits[2] * 10 + digits[3];

        // Check for valid time (00:00 to 23:59)
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
            return String.format("%02d:%02d", hours, minutes);
        }
        return null;
    }
}
