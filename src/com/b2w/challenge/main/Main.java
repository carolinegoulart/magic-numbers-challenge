package com.b2w.challenge.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número de intervalos: ");

        try {
            int numberOfIntervals = scanner.nextInt();

            List<List<Integer>> listOfIntervals = new ArrayList<>();

            for (int i = 0; i < numberOfIntervals; i++) {
                System.out.println("Insira o limite inferior do intervalo número " + (i+1) + ": ");
                int lowerLimit = scanner.nextInt();

                System.out.println("Insira o limite superior do intervalo número " + (i+1) + ": ");
                int upperLimit = scanner.nextInt();

                List<Integer> interval = new ArrayList<>();

                interval.add(lowerLimit);
                interval.add(upperLimit);

                listOfIntervals.add(interval);
            }

            int result = MagicNumbersCalculator.calculate(listOfIntervals);
            System.out.println("A quantidade de números mágicos é: " + result);

        } catch (Exception e) {
            System.out.println("Por favor, insira apenas números inteiros!");
        }
    }

}