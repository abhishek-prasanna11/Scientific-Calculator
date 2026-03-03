package org.abhishek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(7.0, calculator.add(3, 4), 0.0001);
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.subtract(5, 4), 0.0001);
    }

    @Test
    void testMultiplication() {
        assertEquals(20.0, calculator.multiply(5, 4), 0.0001);
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calculator.divide(5, 2), 0.0001);
    }

    @Test
    void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16), 0.0001);
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, calculator.naturalLog(1), 0.0001);
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    void testNegativeSquareRoot() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-1);
        });
    }
}