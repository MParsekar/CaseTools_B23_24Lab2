package mes.casetools.lab3.bca_2205121;
/**
 * This class represents a simple calculator that can perform
 * basic arithmetic operations like addition, subtraction,
 * multiplication, and division.
 *
 * @author Your Name
 * @version 1.0
 * @since 2023-03-09
 */
public class cal {
     /**
     * Adds two numbers together.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a the first number
     * @param b the second number
     * @return the difference between the two numbers
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers together.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of the two numbers
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     *
     * @param a the first number (dividend)
     * @param b the second number (divisor)
     * @return the quotient of the two numbers
     * @throws ArithmeticException if the divisor is zero
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * The main method to test the calculator.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}
