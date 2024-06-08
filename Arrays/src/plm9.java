public class plm9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] result = createTargetArray(nums, index);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        // Initialize target array with a sentinel value (-1)
        for (int i = 0; i < target.length; i++) {
            target[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (target[index[i]] == -1) {
                // If the target position is empty, place the element
                target[index[i]] = nums[i];
            } else {
                // If the target position is occupied, shift elements to the right
                for (int j = target.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
        }
        return target;
    }
}
