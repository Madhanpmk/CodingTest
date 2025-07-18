class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); // i am using  case-insensitive input
    }

    double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Error: Division by zero!");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation type.");
                return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10.0, 5.0, "divide");
        System.out.println("Result: " + calc.calculate());
    }
}