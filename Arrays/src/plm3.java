public class plm3 {
    //   Running Sum of 1d Array

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};

        int[] output = sum(nums);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    static int[] sum(int[] nums) {
        int[] result = new int[nums.length];

        int num1 = 0;

        for (int i = 0; i < nums.length; i++) {
            int num2 = nums[i];
            int sum = num1 + num2;

            result[i] = sum;

            num1 = sum;
        }

        return result;
    }


}
