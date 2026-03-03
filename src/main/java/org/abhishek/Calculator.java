package org.abhishek;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return a / b;
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative input not allowed");
        }
        return Math.sqrt(number);
    }

    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative input not allowed");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLog(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Input must be positive");
        }
        return Math.log(number);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}