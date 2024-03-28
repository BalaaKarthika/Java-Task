import java.util.Scanner;

public class ReadDouble {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a double value
        System.out.print("Enter a double value: ");

        // Read the double value entered by the user
        double number = scanner.nextDouble();

        // Print the double value back to the console
        System.out.println("You entered: " + number);

        // Close the scanner
        scanner.close();
    }
}

