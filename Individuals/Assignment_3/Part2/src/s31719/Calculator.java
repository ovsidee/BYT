package s31719;

public class Calculator {
    public double x;
    public double y;
    public char operation;

    public Calculator(double x, double y, char operation){
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public double calculate() {
        switch (this.operation) {
            case '*' -> {
                return this.x * this.y;
            }
            case '/' -> {
                if (this.y == 0){
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return this.x / this.y;
            }
            case '+' -> {
                return this.x + this.y;
            }
            case '-' -> {
                return this.x - this.y;
            }
            default -> {
                throw new IllegalArgumentException("Invalid operation provided. Provide either (*, -, +, or \\).");
            }
        }
    }
}