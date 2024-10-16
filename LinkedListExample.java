import java.util.LinkedList;
import java.util.List;

public class LinkedListExample{
    public static void main(String[] args) {
        // Creating a LinkedList
        List<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Accessing elements
        System.out.println("First number: " + numbers.get(0));

        // Iterating through the list
        System.out.println("All numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Removing an element
        numbers.remove(Integer.valueOf(2));

        // Size of the list
        System.out.println("Number of numbers: " + numbers.size());
    }
}