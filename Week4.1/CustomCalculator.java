import java.util.Scanner;

public class CustomCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = calculate(num1, num2, operator);
                System.out.println("Result: " + result);
                break; // Exit the loop after successful calculation

            } catch (InvalidInputException | ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) throws InvalidInputException, ArithmeticException {
        if (num1 > 100000 || num2 > 100000) {
            throw new InvalidInputException("Input value cannot be greater than 100000.");
        }

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                if (num2 > 7000) {
                    throw new InvalidInputException("Cannot multiply by a number greater than 7000.");
                }
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new InvalidInputException("Invalid operator.");
        }
    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}