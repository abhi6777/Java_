public class plm8 {
    public static void main(String[] args) {
        int[]  nums = {8,1,2,2,3};

        int[] result = smallerNumbersThanCurrent(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // Since the constraints mention 0 <= nums[i] <= 100
        for (int num : nums) {
            count[num]++;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallerCount = 0;
            for (int j = 0; j < nums[i]; j++) {
                smallerCount += count[j];
            }
            result[i] = smallerCount;
        }
        return result;
    }
}
