package com.b2w.challenge.test;

import com.b2w.challenge.main.MagicNumbersCalculator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MagicNumbersCalculatorTest {

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
    public void whenNumbersAreIntegerAndPositive_thenAssertTrue() {
        assertTrue(MagicNumbersCalculator.isNatural(3));
        assertTrue(MagicNumbersCalculator.isNatural(1.0));
        assertTrue(MagicNumbersCalculator.isNatural(100));
        assertTrue(MagicNumbersCalculator.isNatural(831927391));
    }

    @Test
    public void whenNumbersAreNotIntegerAndPositive_thenAssertFalse() {
        assertFalse(MagicNumbersCalculator.isNatural(-987));
        assertFalse(MagicNumbersCalculator.isNatural(-1.8));
        assertFalse(MagicNumbersCalculator.isNatural(0));
        assertFalse(MagicNumbersCalculator.isNatural(5.4));
    }

    @Test
    public void whenNumbersArePrime_thenAssertTrue() {
        assertTrue(MagicNumbersCalculator.isPrime(2));
        assertTrue(MagicNumbersCalculator.isPrime(3));
        assertTrue(MagicNumbersCalculator.isPrime(5));
        assertTrue(MagicNumbersCalculator.isPrime(7));
        assertTrue(MagicNumbersCalculator.isPrime(331));
        assertTrue(MagicNumbersCalculator.isPrime(541));
        assertTrue(MagicNumbersCalculator.isPrime(643));
        assertTrue(MagicNumbersCalculator.isPrime(977));
        assertTrue(MagicNumbersCalculator.isPrime(4889));
        assertTrue(MagicNumbersCalculator.isPrime(17977));
    }

    @Test
    public void whenNumbersAreNotPrime_thenAssertFalse() {
        assertFalse(MagicNumbersCalculator.isPrime(-5));
        assertFalse(MagicNumbersCalculator.isPrime(0));
        assertFalse(MagicNumbersCalculator.isPrime(1));
        assertFalse(MagicNumbersCalculator.isPrime(6));
        assertFalse(MagicNumbersCalculator.isPrime(10));
        assertFalse(MagicNumbersCalculator.isPrime(78));
        assertFalse(MagicNumbersCalculator.isPrime(502));
        assertFalse(MagicNumbersCalculator.isPrime(994));
        assertFalse(MagicNumbersCalculator.isPrime(4886));
        assertFalse(MagicNumbersCalculator.isPrime(17985));
    }

    @Test
    public void whenNumbersAreMagic_thenAssertTrue() {
        assertTrue(MagicNumbersCalculator.isMagic(4));
        assertTrue(MagicNumbersCalculator.isMagic(25));
        assertTrue(MagicNumbersCalculator.isMagic(49));
        assertTrue(MagicNumbersCalculator.isMagic(289));
        assertTrue(MagicNumbersCalculator.isMagic(1681));
        assertTrue(MagicNumbersCalculator.isMagic(9409));
        assertTrue(MagicNumbersCalculator.isMagic(57121));
        assertTrue(MagicNumbersCalculator.isMagic(546121));
        assertTrue(MagicNumbersCalculator.isMagic(1329409));
        assertTrue(MagicNumbersCalculator.isMagic(34093921));
    }

    @Test
    public void whenNumbersAreNotMagic_thenAssertFalse() {
        assertFalse(MagicNumbersCalculator.isMagic(0));
        assertFalse(MagicNumbersCalculator.isMagic(10));
        assertFalse(MagicNumbersCalculator.isMagic(86));
        assertFalse(MagicNumbersCalculator.isMagic(100));
        assertFalse(MagicNumbersCalculator.isMagic(2453));
        assertFalse(MagicNumbersCalculator.isMagic(4737));
        assertFalse(MagicNumbersCalculator.isMagic(5032));
        assertFalse(MagicNumbersCalculator.isMagic(98491));
        assertFalse(MagicNumbersCalculator.isMagic(343288));
        assertFalse(MagicNumbersCalculator.isMagic(863290));
        assertFalse(MagicNumbersCalculator.isMagic(3529450));
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
