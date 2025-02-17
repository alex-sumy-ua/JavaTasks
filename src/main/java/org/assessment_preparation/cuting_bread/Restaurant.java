package org.assessment_preparation.cuting_bread;

public class Restaurant {

    public static int restaurant(int l, int b) {

            // Find the greatest common divisor (GCD)
            int gcd = gcd(l, b);
            // Calculate the number of maximum-sized squares
            return (l * b) / (gcd * gcd);
        }

        private static int gcd(int a, int b) {
            return (b == 0) ? a : gcd(b, a % b);
        }

}
