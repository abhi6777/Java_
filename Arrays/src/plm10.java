import java.util.HashSet;
import java.util.Set;

public class plm10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence = "leetcode";
        boolean result = checkIfPangram(sentence);

        System.out.println(result);
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        // Create an array to keep track of the letters
        boolean[] seen = new boolean[26];

        // Iterate through the sentence and mark the letters we see
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            int index = c - 'a'; // Get the index for the letter (0 for 'a', 1 for 'b', etc.)
            seen[index] = true;
        }

        // Check if we've seen all the letters
        for (boolean letterSeen : seen) {
            if (!letterSeen) {
                return false; // If any letter is not seen, it's not a pangram
            }
        }

        return true; // All letters are seen, it's a pangram
    }
}
