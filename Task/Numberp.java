public class Numberp {
    public static void main(String[] args) {
        int count = 1;
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers in the pattern
            for (int k = 1; k <= i; k++) {
                System.out.print(count + " ");
                count++;
            }
            
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}