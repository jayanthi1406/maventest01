package com.example.maven_test01;
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.subtract(10, 5));
        System.out.println("Multiplication: " + c.multiply(10, 5));
        System.out.println("Division: " + c.divide(10, 5));
    }
}
