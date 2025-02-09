package org.assessment_preparation.palindrome;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        char[] word = s.replaceAll("\\s+", "").toLowerCase().toCharArray();
        for (int i = 0; i < word.length / 2; i++) {
            if (word[i] != word[word.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutationOfPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and lowercase
        Map<Character, Integer> charCount = new HashMap<>();

        // Count character frequencies
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check for at most one odd character count
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 == 1) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }

}
