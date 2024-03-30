public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String reversedArr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr += arr[i] + " ";
        }
        System.out.println("Reversed Array: " + reversedArr);
    }
}
