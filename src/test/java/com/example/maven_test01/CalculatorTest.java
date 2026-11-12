package com.example.maven_test01;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, c.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, c.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
            () -> c.divide(10, 0));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, c.add(-10, 5));
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0, c.multiply(10, 0));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(-2, c.divide(-10, 5));
    }
}

