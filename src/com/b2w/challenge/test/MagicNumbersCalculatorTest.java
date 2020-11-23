package com.b2w.challenge.test;

import com.b2w.challenge.main.MagicNumbersCalculator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MagicNumbersCalculatorTest {

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

}
