public class Multiple {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        // Parse the input argument as an integer
        int num = Integer.parseInt(args[0]);

        // Print the multiplication table for the specified number
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}