import java.util.Scanner;

public class plm1 {
    static Scanner input = new Scanner(System.in);

    // Build Array from Permutation
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 1, 0, 5, 4, 2}; // Revised permutation array
        int[] result = buildArray(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums.length) {
                throw new IllegalArgumentException("Permutation array contains invalid indices.");
            }
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
