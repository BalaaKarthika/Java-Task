import java.util.Scanner;
public class MaxofThreeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        System.out.println("The maximum of the three numbers is: " + max);
        scanner.close();
    }
}
