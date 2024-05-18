public class plm2 {
    public static void main(String[] args) {
        //  Concatenation of Array
        int[] array = {1, 2, 1};

        int[] ans = concatenate(array);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] concatenate(int[] array) {
        int[] ans = new int[2 * array.length];

        for(int i = 0; i < ans.length; i++) {
            // Use modulo (%) for cycling through the indix of input array.
            ans[i] = array[i%array.length];
        }

        return ans;
    }


}
