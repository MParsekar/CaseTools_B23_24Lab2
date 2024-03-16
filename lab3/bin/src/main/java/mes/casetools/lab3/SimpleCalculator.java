import java.util.Scanner;

/**
 * Behold the SimpleCalculator - A portal to mathematical wonders!
 * Enter the cosmic realm of numbers and witness the magic unfold.
 * Each operation is a dance of celestial forces, guided by the user's cosmic will.
 * Brace yourself as we embark on an odyssey through the universe of calculations! 
 */
public class SimpleCalculator {

    /**
     * The main method, the cosmic gateway to the SimpleCalculator adventure.
     * Users will navigate the cosmos of numbers, selecting operations and witnessing the celestial outcomes.
     *
     * @param args Command-line arguments (not used in this cosmic journey)
     */
    public static void main(String[] args) {
        // Creating a Scanner, the mystical artifact that captures user input from the cosmic energy waves.
        Scanner scanner = new Scanner(System.in);

        // Gazing into the void, users are prompted to enter the first celestial number.
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // A second offering to the cosmic forces, users provide the second celestial number.
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // The cosmic menu, a guide to operations across the vast universe of numbers.
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Users align their cosmic intent, selecting the operation number.
        System.out.print("Enter the operation number: ");
        int choice = scanner.nextInt();

        // A cosmic switch, directing the flow of operations based on the user's celestial choice.
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2)); // A harmonious union of celestial numbers!
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2)); // A graceful parting of constellations!
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2)); // A symphony of mathematical brilliance!
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2)); // A dance of mathematical infinity!
                break;
            default:
                System.out.println("Invalid operation choice"); // An error in cosmic alignment.
        }

        // The Scanner, having captured the cosmic input, gracefully closes its connection to the energy waves.
        scanner.close();
    }

    /**
     * A celestial addition, where numbers unite in harmony.
     *
     * @param num1 The first celestial number
     * @param num2 The second celestial number
     * @return The result of the addition, a new celestial entity
     */
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * A celestial subtraction, where constellations part ways in elegant divergence.
     *
     * @param num1 The minuend, the initial celestial number
     * @param num2 The subtrahend, the subtracted celestial number
     * @return The result of the subtraction, a refined celestial outcome
     */
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * A celestial multiplication, orchestrating a symphony of mathematical brilliance.
     *
     * @param num1 The first celestial factor
     * @param num2 The second celestial factor
     * @return The result of the multiplication, a cosmic masterpiece
     */
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * A celestial division, performing a dance of mathematical infinity.
     *
     * @param num1 The dividend, the cosmic numerator
     * @param num2 The divisor, the celestial denominator
     * @return The result of the division, a choreographed celestial quotient
     */
    private static double divide(double num1, double num2) {
        // Checking for division by zero and handling gracefully.
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero. The cosmic balance is disrupted.");
            return Double.NaN; // Return NaN (Not a Number) for undefined results in the cosmic dance.
        }
    }
}