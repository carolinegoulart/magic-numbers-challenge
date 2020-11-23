package com.b2w.challenge.test;

import com.b2w.challenge.main.MagicNumbersCalculator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MagicNumbersCalculatorIntervalsTest {

    private List<List<Integer>> listOfIntervals;
    private List<Integer> firstInterval;
    private List<Integer> secondInterval;
    private List<Integer> thirdInterval;

    @Before
    public void setUp() {
        listOfIntervals = new ArrayList<>();
        firstInterval = new ArrayList<>();
        secondInterval = new ArrayList<>();
        thirdInterval = new ArrayList<>();
    }

    @Test
    public void whenInputIsValid_thenReturnResultEqualsTo2() {
        firstInterval.add(8);
        firstInterval.add(27);
        listOfIntervals.add(firstInterval);

        int result = MagicNumbersCalculator.calculate(listOfIntervals);
        assertEquals(result, 2);
    }

    @Test
    public void whenInputIsValid_thenReturnResultEqualsTo3() {
        firstInterval.add(8);
        firstInterval.add(27);
        listOfIntervals.add(firstInterval);

        secondInterval.add(49);
        secondInterval.add(49);
        listOfIntervals.add(secondInterval);

        int result = MagicNumbersCalculator.calculate(listOfIntervals);
        assertEquals(result, 3);
    }

    @Test
    public void whenInputIsValid_thenReturnResultEqualsTo5() {
        firstInterval.add(8);
        firstInterval.add(27);
        listOfIntervals.add(firstInterval);

        secondInterval.add(49);
        secondInterval.add(49);
        listOfIntervals.add(secondInterval);

        thirdInterval.add(56);
        thirdInterval.add(149);
        listOfIntervals.add(thirdInterval);

        int result = MagicNumbersCalculator.calculate(listOfIntervals);
        assertEquals(result, 4);
    }

    @Test
    public void whenInputIsValid_thenReturnResultEqualsTo0() {
        firstInterval.add(1);
        firstInterval.add(2);
        listOfIntervals.add(firstInterval);

        secondInterval.add(2);
        secondInterval.add(3);
        listOfIntervals.add(secondInterval);

        thirdInterval.add(3);
        thirdInterval.add(3);
        listOfIntervals.add(thirdInterval);

        int result = MagicNumbersCalculator.calculate(listOfIntervals);
        assertEquals(result, 0);
    }

    @Test
    public void whenInputIsValid_thenReturnResultEqualsTo1940() {
        firstInterval.add(5456);
        firstInterval.add(43567);
        listOfIntervals.add(firstInterval);

        secondInterval.add(905950);
        secondInterval.add(328492874);
        listOfIntervals.add(secondInterval);

        int result = MagicNumbersCalculator.calculate(listOfIntervals);
        assertEquals(result, 1940);
    }

    @Test
    public void whenInputIsNegative_thenReturnResultEqualsTo0() {
        firstInterval.add(-8239);
        firstInterval.add(-405);
        listOfIntervals.add(firstInterval);

        secondInterval.add(-130);
        secondInterval.add(0);
        listOfIntervals.add(secondInterval);

        thirdInterval.add(-54);
        thirdInterval.add(-1);
        listOfIntervals.add(thirdInterval);

        int result = MagicNumbersCalculator.calculate(listOfIntervals);
        assertEquals(result, 0);
    }

}
