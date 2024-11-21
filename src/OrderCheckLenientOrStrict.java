import java.util.Scanner;

public class OrderCheckLenientOrStrict {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for strict or lenient mode
        System.out.print("Would you like to check order in 'strict' or 'lenient' mode? ");
        String mode = scanner.nextLine().trim().toLowerCase();

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Check order based on chosen mode
        if (mode.equals("strict")) {
            // Strict mode: strictly increasing or strictly decreasing
            if (num1 < num2 && num2 < num3) {
                System.out.println("increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("decreasing");
            } else {
                System.out.println("neither");
            }
        } else if (mode.equals("lenient")) {
            // Lenient mode: allows equal consecutive values
            if (num1 <= num2 && num2 <= num3) {
                System.out.println("increasing");
            } else if (num1 >= num2 && num2 >= num3) {
                System.out.println("decreasing");
            } else {
                System.out.println("neither");
            }
        } else {
            System.out.println("Invalid mode selected. Please enter 'strict' or 'lenient'.");
        }

        // Close the scanner
        scanner.close();
    }
}

