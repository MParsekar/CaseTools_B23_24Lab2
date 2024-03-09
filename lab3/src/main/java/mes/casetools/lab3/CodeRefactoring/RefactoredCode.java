package mes.casetools.lab3.CodeRefactoring;


public class RefactoredCode {

    public void run() {
        RefactoredCode calculator = new RefactoredCode();
        int sum = calculator.sum(5, 10);
        System.out.println("Sum: " + sum);

        int product = calculator.product(5, 10);
        System.out.println("Product: " + product);

        double division;
        try {
            division = calculator.division(10, 5);
            System.out.println("Division: " + division);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int product(int num1, int num2) {
        return num1 * num2;
    }

    public double division(int divident, int devisor) throws Exception {
        if (devisor == 0) {
            // System.out.println("Cannot divide by zero!");
            throw new Exception("Cannot divide by zero!");
            // return -1;
        } else {
            return divident / (double) devisor;
        }
    }
}
