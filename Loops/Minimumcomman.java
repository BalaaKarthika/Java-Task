// Minimum comman value 
public class Minimumcomman {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 6};
        int[] nums2 = {2, 3, 4, 5};
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                System.out.println("Minimum common value: " + nums1[i]);
                return;  // Exit after finding the first common value
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("No common value found");
    }
}

	   
	