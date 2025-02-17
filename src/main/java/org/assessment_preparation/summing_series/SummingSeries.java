package org.assessment_preparation.summing_series;

public class SummingSeries {

    /*
    * T = n*n - (n-1)*(n-1)
    * S = T1 + T2 + T3 + ... + Tn
    *
    * 1 <= n <= pow(10, 16)
    * 1 <= t <= 10
    *
    * Result = S mod (pow(10, 9) + t)
    *
    */

    public static int summingSeries(long n, int t) {
        int mod = 1000000000 + t;
        return (int) ((n % mod) * (n % mod) % mod);    }

}
