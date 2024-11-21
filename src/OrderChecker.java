import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Check order
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("in order");
        } else if (num1 >= num2 && num2 >= num3) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }

        scanner.close();
    }
}

