package org.assessment_preparation.min_height_triangle;

public class MinimumHeightTriangle {

/*
* Given integers b and a, find the smallest integer h,
* such that there exists a triangle of height h, base b, having an area of at least a.
* Constraints
* 1 <= a <= 1 000 000
* 1 <= b <= 1 000 000
*/
    public static int lowestTriangle(int base, int area) {

        int result = -1;

        if (base < 1 || base > 1000000 ||
            area < 1 || area > 1000000) return result;

        result = (int) Math.ceil((2.0 * area) / base);

        return result;

    }

}
