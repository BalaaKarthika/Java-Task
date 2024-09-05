// Remove duplicates elements

public class Remove{
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 3};  // Original array
        int length = removeDuplicates(nums); // Remove duplicates and get new length
        
        // Print the array after duplicates have been removed
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int index = 1; // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Compare with the previous element
                nums[index++] = nums[i]; // Place non-duplicate element at index
            }
        }
        return index; // New length of array with unique elements
    }
}
