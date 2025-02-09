package org.assessment_preparation.longest_sequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] input) {

        int max = 0;

        if (input == null || input.length == 0) { return max; }

        Set<Integer> fastLookups = new HashSet<>();
        for (int element : input) {
            fastLookups.add(element);
        }

        for (int num : fastLookups) {
            if (!fastLookups.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (fastLookups.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                max = Math.max(max, currentLength);
            }
        }
        return max;
    }
}
