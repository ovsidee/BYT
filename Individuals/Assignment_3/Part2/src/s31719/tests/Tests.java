package s31719.tests;

import org.junit.jupiter.api.Test;
import s31719.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Tests {
    @Test
    void testCalculatorAddition() {
        Calculator calculator = new Calculator(5, 3, '+');
        assertEquals(8, calculator.calculate());
    }

    @Test
    void testCalculatorSubtraction() {
        Calculator calculator = new Calculator(5, 3, '-');
        assertEquals(2, calculator.calculate());
    }

    @Test
    void testCalculatorMultiplication() {
        Calculator calculator = new Calculator(5, 3, '*');
        assertEquals(15, calculator.calculate());
    }

    @Test
    void testCalculatorDivision() {
        Calculator calculator = new Calculator(6, 3, '/');
        assertEquals(2, calculator.calculate());
    }

    @Test
    void testCalculatorDivisionByZero() {
        Calculator calculator = new Calculator(6, 0, '/');
        Exception exception = assertThrows(ArithmeticException.class, calculator::calculate);
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

    @Test
    void testCalculatorInvalidOperation() {
        Calculator calculator = new Calculator(6, 3, '%');
        Exception exception = assertThrows(IllegalArgumentException.class, calculator::calculate);
        assertEquals("Invalid operation provided. Provide either (*, -, +, or \\).", exception.getMessage());
    }

    @Test
    void testCalculatorNegativeNumbers() {
        Calculator calculator = new Calculator(-4, -6, '+');
        assertEquals(-10, calculator.calculate());
    }

    @Test
    void testCalculatorDecimalNumbers() {
        Calculator calculator = new Calculator(5.5, 2.2, '*');
        assertEquals(12.1, calculator.calculate(), 0.0001);
    }

    @Test
    void testCalculatorZeroAddition() {
        Calculator calculator = new Calculator(0, 5, '+');
        assertEquals(5, calculator.calculate());
    }

    @Test
    void testCalculatorZeroMultiplication() {
        Calculator calculator = new Calculator(0, 5, '*');
        assertEquals(0, calculator.calculate());
    }
}