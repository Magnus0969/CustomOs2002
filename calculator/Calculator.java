package calculator;

import java.util.Scanner;

/**
 * A simple CLI calculator for basic arithmetic operations.
 */
public class Calculator {

    public static void runCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Calculator ---");

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit Calculator");
            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator...");
                return;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
            }
        }
    }
}