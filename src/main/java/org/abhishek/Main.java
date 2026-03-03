package org.abhishek;

// comment to test webhook

// second comment to test

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nScientific Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Log");
            System.out.println("8. Power");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter first number: ");
                        double a1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b1 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.add(a1, b1));
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        double a2 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b2 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.subtract(a2, b2));
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        double a3 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b3 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.multiply(a3, b3));
                        break;

                    case 4:
                        System.out.print("Enter numerator: ");
                        double a4 = scanner.nextDouble();
                        System.out.print("Enter denominator: ");
                        double b4 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.divide(a4, b4));
                        break;

                    case 5:
                        System.out.print("Enter number: ");
                        double num = scanner.nextDouble();
                        System.out.println("Result: " + calculator.squareRoot(num));
                        break;

                    case 6:
                        System.out.print("Enter integer: ");
                        int fact = scanner.nextInt();
                        System.out.println("Result: " + calculator.factorial(fact));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        double log = scanner.nextDouble();
                        System.out.println("Result: " + calculator.naturalLog(log));
                        break;

                    case 8:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exp = scanner.nextDouble();
                        System.out.println("Result: " + calculator.power(base, exp));
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid option");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}