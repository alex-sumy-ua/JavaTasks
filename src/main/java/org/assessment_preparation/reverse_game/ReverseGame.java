package org.assessment_preparation.reverse_game;

public class ReverseGame {

    public static int newIndex(int n, int k) {
        for (int i = 0; i < n; i++) {
            if (k >= i) {
                k = i + (n - 1 - k);
            }
        }
        return k;
    }

}
