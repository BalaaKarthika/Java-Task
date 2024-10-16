import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Doubles
        List<Double> prices = new Vector<>();

        // Add elements to the Vector
        prices.add(10.5);
        prices.add(15.2);
        prices.add(20.0);

        // Access elements by index
        double firstPrice = prices.get(0); // 10.5

        // Iterate through the Vector
        for (Double price : prices) {
            System.out.println(price);
        }
    }
}