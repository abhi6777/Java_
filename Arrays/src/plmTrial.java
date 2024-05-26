import java.util.List;

public class plmTrial {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> output = kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < output.toArray().length; i++) {
            System.out.print(output);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {boolean[] result = new boolean[candies.length];
        boolean check = true;
        for(int i = 0; i < candies.length; i++) {
            int totalCandies = candies[i] + extraCandies;

            for (int j = 0; j < candies.length; j++) {
                if( totalCandies < candies[j]) {
                    check = false;
                };
            }
            result[i] = check;
        }
        return result[];
    }
}