import java.util.Scanner;

/**
 * Addition
 */
public class Addition {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter 2 numbers: ");
        num1 = inputScanner.nextInt();
        num2 = inputScanner.nextInt();
        result = num1 + num2;
        System.out.println("Sum: " + result);
    }
}