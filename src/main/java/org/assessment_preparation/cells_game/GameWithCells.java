package org.assessment_preparation.cells_game;

public class GameWithCells {

    /*
    * Luke is daydreaming in Math class.
    * He has a sheet of graph paper with n rows and m columns, and he imagines that there is an army base in each cell for a total of n*m bases.
    * He wants to drop supplies at strategic points on the sheet, marking each drop point with a red dot.
    * If a base contains at least one package inside or on top of its border fence, then it's considered to be supplied.
    * Constraints:
    * 0 < n,m <= 1000
    * For example:
    * Input: 2, 2
    * Output: 1
    * Input: 4, 2
    * Output: 2
    *
    * Complete the 'gameWithCells' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER n
    *  2. INTEGER m
    */
    public static int gameWithCells(int n, int m) {
        // Write your code here
        int result = 0;
        if (n <= 0 || n > 1000 ||
            m <= 0 || m > 1000) return result;

        int rowGroups = (n + 1) / 2;  // Divide rows by 2 and round up
        int colGroups = (m + 1) / 2;  // Divide columns by 2 and round up

        // Return the total number of supply drops required
        result = rowGroups * colGroups;

        return  result;
    }


}
