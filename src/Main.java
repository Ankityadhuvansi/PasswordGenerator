import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            displayMenu();
            try {
                input = scanner.nextInt();

                if (input < 0 || input > 4) {
                    System.out.println("Invalid Input 😒");
                    continue;
                }

                if (input != 0) {
                    System.out.println("Enter the size of your password:");
                    int size = scanner.nextInt();
                    generateAndPrintPassword(input, size);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Consume the invalid input to avoid an infinite loop
            }

        } while (input != 0);

        // Close the scanner after the loop to prevent resource leak
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Welcome to Password Generator.");
        System.out.println("Enter your choice for password:");
        System.out.println("1. For Uppercase");
        System.out.println("2. For Lowercase");
        System.out.println("3. For Alphanumeric");
        System.out.println("4. For Alphanumeric with Special Characters");
        System.out.println("0. For Exit");
    }

    private static void generateAndPrintPassword(int input, int size) {
        switch (input) {
            case 1:
                System.out.println(uppercasePass.uppercase(size));
                break;
            case 2:
                System.out.println(lowerPass.lowercase(size));
                break;
            case 3:
                System.out.println(AlphaNumeric.alphanumeric(size));
                break;
            case 4:
                System.out.println(RandomAlphanumericWithSpecialCharsGenerator.strongPass(size));
                break;
            default:
                System.out.println("Invalid Input 😒");
        }
    }
}
