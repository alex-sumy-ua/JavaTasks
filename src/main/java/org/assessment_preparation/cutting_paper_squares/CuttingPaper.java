package org.assessment_preparation.cutting_paper_squares;

public class CuttingPaper {
    /*
    * Mary has an nxm piece of paper that she wants to cut into 1x1 pieces according to the following rules:
    * She can only cut one piece of paper at a time, meaning she cannot fold the paper or layer already-cut pieces on top of one another.
    * Each cut is a straight line from one side of the paper to the other side of the paper.
    * Given n and m, find and print the minimum number of cuts Mary must make to cut the paper into  nxm squares that are 1x1 unit in size.
    *
    *  Complete the 'solve' function below.
    *
    * The function is expected to return a LONG_INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER n
    *  2. INTEGER m
    */

    public static long cuttingPaper(int n, int m) {

        return ((long) n * (long) m) - 1;

    }

}
