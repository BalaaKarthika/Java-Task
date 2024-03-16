import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the array elements separated by space: ");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int result = simpleArraySum(ar);
        System.out.println("The sum of the array elements is: " + result);
        scanner.close();
    }
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}
