import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Check if all numbers are the same
        if (num1 == num2 && num2 == num3) {
            System.out.println("all the same");
        }
        // Check if all numbers are different
        else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("all different");
        }
        // Otherwise, print "neither"
        else {
            System.out.println("neither");
        }

        // Close the scanner
        scanner.close();
    }
}
