public class CopyArray{
public static void main(String[] args) {
// Original array
int[] numbers = {1, 2, 3, 4, 5};
// Create a new array and copy all elements
int[] copyNumbers = new int[numbers.length];
for (int i = 0; i < numbers.length; i++) {
copyNumbers[i] = numbers[i];
}
// Display the original and copied arrays
System.out.print("Original Array: ");
printArray(numbers);
System.out.print("Copied Array: ");
printArray(copyNumbers);
}
// Helper method to print an array
private static void printArray(int[] arr) {
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
