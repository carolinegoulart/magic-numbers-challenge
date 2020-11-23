package com.b2w.challenge.main;

import java.util.List;

public class MagicNumbersCalculator {

    public static int calculate(List<List<Integer>> listOfIntervals) {
        int count = 0;

        for (List<Integer> interval: listOfIntervals) {
            for (int i = interval.get(0); i <= interval.get(1); i++) {
                if (isMagic(i)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isMagic(int number) {
        double sqrt = Math.sqrt(number);
        return isIntegerAndPositive(sqrt) && isPrime((int) sqrt);
    }

    public static boolean isIntegerAndPositive(double number) {
        if (number < 0) return false;
        return number % Math.floor(number) == 0;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number/2 ; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
