import java.util.Scanner;

public class TwoPairsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read four integers
        System.out.print("Enter four integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // Check for two pairs
        if (isTwoPairs(num1, num2, num3, num4)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }

        scanner.close();
    }

    // Method to check if there are two pairs
    private static boolean isTwoPairs(int a, int b, int c, int d) {
        int[] nums = {a, b, c, d};

        // Count occurrences of each number
        int[] counts = new int[10]; // Assumes numbers are between 0 and 9; can expand if needed
        for (int num : nums) {
            counts[num]++;
        }

        // Count pairs
        int pairCount = 0;
        for (int count : counts) {
            if (count == 2) {
                pairCount++;
            }
        }

        // Check if there are exactly two pairs
        return pairCount == 2 || (pairCount == 1 && counts[a] == 4); // Covers the "2 2 2 2" case
    }
}

