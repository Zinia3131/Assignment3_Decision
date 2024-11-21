import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer (less than ten billion): ");
        long number = scanner.nextLong();

        // Make the number positive if it is negative
        if (number < 0) {
            number = -number;
        }

        // Determine the number of digits
        int digits;
        if (number < 10) {
            digits = 1;
        } else if (number < 100) {
            digits = 2;
        } else if (number < 1000) {
            digits = 3;
        } else if (number < 10000) {
            digits = 4;
        } else if (number < 100000) {
            digits = 5;
        } else if (number < 1000000) {
            digits = 6;
        } else if (number < 10000000) {
            digits = 7;
        } else if (number < 100000000) {
            digits = 8;
        } else if (number < 1000000000) {
            digits = 9;
        } else if (number < 10000000000L) {
            digits = 10;
        } else {
            digits = -1; // Out of the specified range
        }

        // Print the result
        if (digits == -1) {
            System.out.println("The number is out of range (it should be less than ten billion).");
        } else {
            System.out.println("The number has " + digits + " digits.");
        }

        // Close the scanner
        scanner.close();
    }
}

