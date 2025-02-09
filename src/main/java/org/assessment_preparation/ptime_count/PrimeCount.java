package org.assessment_preparation.ptime_count;

public class PrimeCount {
    /*
     * Complete the 'primeCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int primeCount(long n) {
        // Write your code here
        int result = -1;
        if (n < 1 || n > Math.pow(n, 18)) return result;
        else result = 0;
        long product = 1;
        final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                              43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (int prime : PRIMES) {
            if (product > n / prime) {
                break;
            }
            product *= prime;
            result++;
        }
        return result;
    }

}
