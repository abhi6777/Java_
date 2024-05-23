public class plm5 {
    public static void main(String[] args) {
        int[] num = {2, 5, 1, 3, 4, 7};
        int n = num.length / 2;
        int[] result = shuffle(num, n);

        // To print the array in a readable format
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i]; /* {2, 5, 1, 3, 4, 7} */
            ans[(2 * i) + 1] = nums[i + n];
        }

        return ans;
    }
}
