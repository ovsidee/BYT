package s31719;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");

        System.out.println("Provide first value:");
        double x = scanner.nextDouble();

        System.out.println("Provide second value:");
        double y = scanner.nextDouble();

        System.out.println("Provide operation of what you want to do with those numbers: (*, +, -, \\)");
        char operation = scanner.next().charAt(0);

        try {
            Calculator calculator = new Calculator(x, y, operation);
            System.out.println("Result: " + calculator.calculate());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
