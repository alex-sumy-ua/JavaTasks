package org.assessment_preparation.strange_grid;

public class StrangeGrid {

    public static long node (int row, int column) {
        long start;

        // For odd rows (1st, 3rd, 5th, etc. from bottom), start with even numbers
        if (row % 2 == 1) {
            start = ((long)(row - 1) / 2) * 10;
        } else {
            // For even rows (2nd, 4th, 6th, etc. from bottom), start with odd numbers
            start = ((long)(row - 1) / 2) * 10 + 1;
        }

        // The value at column c
        return start + (column - 1) * 2;
    }

}
