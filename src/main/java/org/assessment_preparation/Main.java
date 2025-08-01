package org.assessment_preparation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assessment_preparation.cutting_paper_squares.CuttingPaper.cuttingPaper;
import static org.assessment_preparation.balanced_brackets.BalancedBrackets.isBalanced;
import static org.assessment_preparation.cells_game.GameWithCells.gameWithCells;
import static org.assessment_preparation.cutting_sticks.CuttingSticks.cutTheSticks;
import static org.assessment_preparation.latest_time_finder.LatestTimeFinder.findLatestTime;
import static org.assessment_preparation.longest_sequence.LongestConsecutiveSequence.longestConsecutiveSequence;
import static org.assessment_preparation.min_height_triangle.MinimumHeightTriangle.lowestTriangle;
import static org.assessment_preparation.non_repeated_character.FirstUniqueCharacter.firstUniqChar;
import static org.assessment_preparation.palindrome.Palindrome.isPalindrome;
import static org.assessment_preparation.palindrome.Palindrome.isPermutationOfPalindrome;
import static org.assessment_preparation.ptime_count.PrimeCount.primeCount;
import static org.assessment_preparation.reverse_game.ReverseGame.newIndex;
import static org.assessment_preparation.sherlock_array.sherlock_arr.balancedSums;
import static org.assessment_preparation.sherlock_beast.DecentNumber.decentNumber;
import static org.assessment_preparation.strange_grid.StrangeGrid.node;
import static org.assessment_preparation.summing_series.SummingSeries.summingSeries;
import static org.assessment_preparation.twosum.TwoSum.twoSum;
import static org.assessment_preparation.valid_parentheses.ValidParentheses.isValid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        System.out.println();
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

// *** 1 - Two Sum ***

        int[] numbers = {2, 7, 11, 15};
        int target = 22;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

// *** 2 - Valid Parentheses ***
        {
            System.out.println(isValid("()"));        // true
            System.out.println(isValid("()[]{}"));    // true
            System.out.println(isValid("(]"));        // false
            System.out.println(isValid("([)]"));      // false
            System.out.println(isValid("{[]}"));      // true
        }
// *** 3 *** Latest Time Finder ***
        {
            System.out.println("Latest time: " + findLatestTime(1, 9, 8, 3)); // Should print "19:38"
            System.out.println("Latest time: " + findLatestTime(9, 1, 2, 5)); // Should print "21:59"
        }
// *** 4 - First Unique Character ***
        {
            System.out.println(firstUniqChar("leetcode"));       // 0
            System.out.println(firstUniqChar("loveleetcode"));   // 2
            System.out.println(firstUniqChar("aabb"));           // -1
        }
// *** 5 - Balanced Brackets ***
        {
            String input1 = "([]){}";
            String input2 = "{[(])}";
            String input3 = "((({{[[]]}})))";

            System.out.println(isBalanced(input1)); // true
            System.out.println(isBalanced(input2)); // false
            System.out.println(isBalanced(input3)); // true
        }
// *** 6a - isPalindrome ***
        String test1 = "mamam"; // true
        String test2 = "MAMam"; // true
        String test3 = "mama"; // false
        String test4 = "P  O p"; // true
        String test5 = "mam am"; // true

        System.out.println("Task 6a:");
        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
        System.out.println(isPalindrome(test3));
        System.out.println(isPalindrome(test4));
        System.out.println(isPalindrome(test5));
// *** 6b - isPermutationOfPalindrome ***
        System.out.println("Task 6b:");
        System.out.println(isPermutationOfPalindrome("Tact Coa")); // true
        System.out.println(isPermutationOfPalindrome("Tact Coal")); // false
// *** 7 - Longest Consecutive Length ***
        System.out.println("Task 7:");
        int[] input = {5, 100, 4, 200, 1, 3, 2, 11, 12, 14, 13};
        System.out.println(longestConsecutiveSequence(input)); // Output: 4

// *** 8 - Minimum Height Triangle ***
        System.out.println("Task 8:");
        int base = 17;
        int area = 100;
        System.out.println("base = " + base + ", area =  " + area + "; minimum h = " + lowestTriangle(base, area));

// *** 9 - Game With Cells ***
        System.out.println("Task 9:");
        int n = 2;
        int m = 3;
        System.out.println("n = " + n + ", m = " + m + "; min parcels = " + gameWithCells(n, m));

// *** 10 - Prime Count ***
        System.out.println("Task 10:");
        long number = 614889782588491410L;
        System.out.println("The number of primes for number = " + number + " is: " + primeCount(number));

// *** 11 - Cutting Paper ***
        System.out.println("Task 11: ");
        int nn = 1;
        int mm = 3;
        System.out.println("The number of cuts for the paper n=" + nn + ", m=" + mm + " is: " + cuttingPaper(nn, mm) + " cuts.");

// *** 12 - Summing Series ***
        System.out.println("Task 12:");
        long nnn = 2L;
        int t = 7;
        System.out.println("The mod of summing series S mod pow(10, " + t + ") + " + nnn + " is: " + summingSeries(nnn, t));

// *** 13 - Reverse Game ***
        System.out.println("Task 13:");

        // 1
        // 3 1
        // > 2

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int tt = Integer.parseInt(bufferedReader.readLine().trim());
//        if (t > 0) {
//            int nnnn = 0;
//            int k = 0;
//            for (int j = 1; j <= tt; j++) {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//                nnnn = Integer.parseInt(firstMultipleInput[0]);
//                k = Integer.parseInt(firstMultipleInput[1]);
//                System.out.println("New index: " + newIndex(nnnn, k));
//            }
//        }
////        bufferedReader.close();
//
//// *** 14 - Strange Grid ***
//        System.out.println("Task 14:");
//        // 6 3
//        // > 25
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int r = Integer.parseInt(firstMultipleInput[0]);
//
//        int c = Integer.parseInt(firstMultipleInput[1]);
//
//        long result14 = node(r, c);
//
//        System.out.println("Result: " + result14);
//
//        bufferedReader.close();

// *** 15 - Cut the Sticks ***
        // 1 2 3 4 3 3 2 1
        // > 8
        // > 6
        // > 4
        // > 1

        System.out.println("Task 15:");
        System.out.println("Enter stick lengths (space separated):");

        // Read stick lengths directly - no need to first read count since we can get it from the list
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result15 = cutTheSticks(arr);

        System.out.println("Sequence of stick counts:");
        result15.forEach(System.out::println);

// *** 16 - Sherlock and Array ***

        // 2
        // 3
        // 1 2 3
        // 4
        // 1 2 3 3
        // > NO
        // > YES

        System.out.println("Task 16:");
        System.out.println("Enter number of test cases:");

        int testCases = Integer.parseInt(bufferedReader.readLine().trim());

        for (int t16 = 0; t16 < testCases; t16++) {
            System.out.println("Enter size of array:");
            int n16 = Integer.parseInt(bufferedReader.readLine().trim());

            System.out.println("Enter array elements separated by spaces:");
            List<Integer> arr16 = Stream.of(bufferedReader.readLine().trim().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            System.out.println(balancedSums(arr16));
        }

// *** 17 - Sherlock and the Beast ***
//        Sherlock determines the key to removing the virus is to find the largest Decent Number having that number of digits.
//        A Decent Number has the following properties:
//        Its digits can only be 3's and/or 5's.
//        The number of 3's it contains is divisible by 5.
//        The number of 5's it contains is divisible by 3.
//        It is the largest such number for its length.
//        Print the decent number for the given length, or  if a decent number of that length cannot be formed. No return value is expected.
//        The first line is an integer, , the number of test cases.
//          The next  lines each contain an integer , the number of digits in the number to create.

//        STDIN   Function
//        -----   --------
//        4       t = 4
//        1       n = 1 (first test case)
//        3       n = 3 (second test case)
//        5
//        11
//
//        > -1
//        > 555
//        > 33333
//        > 55555533333

        System.out.println("Task 17: Sherlock and the Beast");

        System.out.println("Enter number of test cases:");
        int t17 = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < t17; i++) {
            System.out.println("Enter the number of digits:");
            int n17 = Integer.parseInt(bufferedReader.readLine().trim());
            decentNumber(n17);
        }





// Close bufferedReader at the very end after all input is done:
        bufferedReader.close();
    }

}