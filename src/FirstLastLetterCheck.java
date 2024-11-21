import java.util.Scanner;

public class FirstLastLetterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is non-empty
        if (input.length() > 0) {
            // Convert to lowercase for case-insensitive comparison
            char firstLetter = Character.toLowerCase(input.charAt(0));
            char lastLetter = Character.toLowerCase(input.charAt(input.length() - 1));

            // Compare the first and last letters
            if (firstLetter == lastLetter) {
                System.out.println("first and last letter same");
            } else {
                System.out.println("first and last letter different");
            }
        } else {
            System.out.println("The string is empty.");
        }

        // Close the scanner
        scanner.close();
    }
}
