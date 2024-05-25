import java.util.ArrayList;
import java.util.List;

public class plm6 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> output = kidsWithCandies(candies, extraCandies);

        for (Boolean b : output) {
            System.out.print(b + " ");
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies any kid currently has
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Check for each kid if they can have the greatest number of candies after getting the extra candies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
