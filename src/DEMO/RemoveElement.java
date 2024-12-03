package DEMO;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 2, 2};
        int val = 3;
    
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { 
                nums[k] = nums[i]; // Move valid element to the front
                k++;
            }
        }
        System.out.println("Number of elements not equal to " + val + " is: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
