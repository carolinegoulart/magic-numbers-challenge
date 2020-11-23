package com.b2w.challenge.main;

import java.util.List;

public class MagicNumbersCalculator {

    public static int calculate(List<List<Integer>> listOfIntervals) {
        int count = 0;

        for (List<Integer> interval: listOfIntervals) {
            int lowerLimit = interval.get(0);
            int upperLimit = interval.get(1);

            for (int number = lowerLimit; number <= upperLimit; number++) {
                if (isMagic(number))
                    count++;
            }
        }

        return count;
    }

    public static boolean isMagic(int number) {
        double sqrt = Math.sqrt(number);
        return isNatural(sqrt) && isPrime((int) sqrt);
    }

    public static boolean isNatural(double number) {
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
