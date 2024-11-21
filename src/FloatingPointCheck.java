import java.util.Scanner;

public class FloatingPointCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        // Check if the number is zero
        if (number == 0) {
            System.out.println("zero");
        } else {
            // Determine if the number is positive or negative
            if (number > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            // Check if the absolute value of the number is small or large
            double absValue = Math.abs(number);
            if (absValue < 1) {
                System.out.print(" small");
            } else if (absValue > 1_000_000) {
                System.out.print(" large");
            }

            System.out.println(); // Move to a new line after printing
        }

        // Close the scanner
        scanner.close();
    }
}

