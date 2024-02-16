package com.example.spe_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpeCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeCalculatorApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function - √x");
            System.out.println("2. Factorial function - x!");
            System.out.println("3. Natural logarithm (base е) - ln(x)");
            System.out.println("4. Power function - x^b");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    squareRoot();
                    break;
                case 2:
                    factorial();
                    break;
                case 3:
                    naturalLogarithm();
                    break;
                case 4:
                    powerFunction();
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for square root: ");
        double x = scanner.nextDouble();
        double result = Math.sqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int x = scanner.nextInt();
        long result = 1;

        for (int i = 2; i <= x; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + x + " is: " + result);
    }

    private static void naturalLogarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for natural logarithm: ");
        double x = scanner.nextDouble();
        double result = Math.log(x);
        System.out.println("Natural logarithm of " + x + " is: " + result);
    }

    private static void powerFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (x) for the power function: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (b) for the power function: ");
        double b = scanner.nextDouble();
        double result = Math.pow(x, b);
        System.out.println(x + " raised to the power of " + b + " is: " + result);

    }
}
