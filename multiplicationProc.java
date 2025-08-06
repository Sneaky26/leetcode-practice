import java.util.Scanner;

public class MultiplicationProc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double multiplicand, multiplier, product = 0;

        System.out.println("Calculator Without the * Symbol");
        System.out.print("Enter the first number (multiplicand): ");
        multiplicand = scanner.nextDouble();
        System.out.print("Enter the second number (multiplier): ");
        multiplier = scanner.nextDouble();

        for (int i = 0; i < multiplier; i++) {
            product += multiplicand;
        }

        System.out.println("Product: " + product);
    }
}
