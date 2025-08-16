package org.assessment_preparation.largest_permutation;

import java.util.List;

public class LargestPermutation {

    /**
     * Returns the lexicographically largest permutation achievable with at most k swaps.
     * The input list is modified in-place and also returned.
     */
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();
        // pos[value] = current index of this value in the array
        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[arr.get(i)] = i;
        }

        int i = 0;
        while (i < n && k > 0) {
            // The value we want at index i is (n - i)
            int desired = n - i;
            int current = arr.get(i);

            if (current != desired) {
                // Find the current index of the desired value
                int j = pos[desired];

                // Swap arr[i] with arr[j]
                arr.set(j, current);
                arr.set(i, desired);

                // Update positions
                pos[current] = j;
                pos[desired] = i;

                k--; // one swap used
            }
            i++;
        }
        return arr;
    }

}
