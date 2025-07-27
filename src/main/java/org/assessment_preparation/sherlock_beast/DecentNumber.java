package org.assessment_preparation.sherlock_beast;

public class DecentNumber {
    public static void decentNumber(int n) {
        int fives = n;

        while (fives % 3 != 0) {
            fives -= 5;
        }

        if (fives < 0) {
            System.out.println("-1");
            return;
        }

        int threes = n - fives;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < fives; i++) {
            sb.append("5");
        }
        for (int i = 0; i < threes; i++) {
            sb.append("3");
        }

        System.out.println(sb.toString());
    }

}
