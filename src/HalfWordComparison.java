import java.util.Scanner;

public class HalfWordComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int length = word.length();

        // Check if the word has at least 2 characters
        if (length < 2) {
            System.out.println("The word is too short to compare halves.");
        } else {
            // Calculate midpoint, ignoring middle letter if the length is odd
            int mid = length / 2;

            String firstHalf = word.substring(0, mid);
            String secondHalf = (length % 2 == 0) ? word.substring(mid) : word.substring(mid + 1);

            // Compare the first and second halves (case-insensitive)
            if (firstHalf.equalsIgnoreCase(secondHalf)) {
                System.out.println("first and second half same");
            } else {
                System.out.println("first and second half different");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
