package Arrays;

public class PeakElement {
    
    // Find the index of any peak element in the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static int findPeakElement(int[] nums) {
        int n = nums.length;
        
        // Check first element
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        
        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        
        // Check last element
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        
        return -1; // No peak found (shouldn't happen with valid input)
    }
    
    public static void main(String[] args) {
        // Sample Input 1
        int[] nums1 = {1, 2, 3, 1, 5};
        System.out.println("Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Peak Element Index: " + findPeakElement(nums1));
        System.out.println();
        
        // Sample Input 2
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Peak Element Index: " + findPeakElement(nums2));
    }
}
