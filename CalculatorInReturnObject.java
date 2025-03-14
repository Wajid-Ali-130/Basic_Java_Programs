class CalculationResult {
    private double result;
    private String message;

    public CalculationResult(double result, String message) {
        this.result = result;
        this.message = message;
    }

    public double getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}

class Calculator {
    public CalculationResult add(double a, double b) {
        double result = a + b;
        return new CalculationResult(result, "Addition successful.");
    }

    public CalculationResult subtract(double a, double b) {
        double result = a - b;
        return new CalculationResult(result, "Subtraction successful.");
    }

    public CalculationResult multiply(double a, double b) {
        double result = a * b;
        return new CalculationResult(result, "Multiplication successful.");
    }

    public CalculationResult divide(double a, double b) {
        if (b == 0) {
            return new CalculationResult(0, "Error: Division by zero.");
        }
        double result = a / b;
        return new CalculationResult(result, "Division successful.");
    }
}

public class CalculatorInReturnObject {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        CalculationResult additionResult = calculator.add(5, 3);
        System.out.println("Result: " + additionResult.getResult() + ", Message: " + additionResult.getMessage());

        CalculationResult subtractionResult = calculator.subtract(5, 3);
        System.out.println("Result: " + subtractionResult.getResult() + ", Message: " + subtractionResult.getMessage());

        CalculationResult multiplicationResult = calculator.multiply(5, 3);
        System.out.println("Result: " + multiplicationResult.getResult() + ", Message: " + multiplicationResult.getMessage());

        CalculationResult divisionResult = calculator.divide(5, 0); // Testing division by zero error
        System.out.println("Result: " + divisionResult.getResult() + ", Message: " + divisionResult.getMessage());
        
        CalculationResult divisionResult2 = calculator.divide(5, 2); // Normal division
        System.out.println("Result: " + divisionResult2.getResult() + ", Message: " + divisionResult2.getMessage());
    }
}