public class Patterne {
    public static void main(String[] args) {
        int row = 4;  // number of rows
        int col = 4;  // number of columns

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Print '*' for border or corners, otherwise print space
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) 
                    System.out.print("*");
                 else 
                    System.out.print(" ");
                
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

	    