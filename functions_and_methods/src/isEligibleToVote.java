import java.util.Scanner;

public class isEligibleToVote {
    static Scanner input = new Scanner(System.in);

    // A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.

    public static void main(String[] args) {
        System.out.print("Enter your age :- ");
        int age = input.nextInt();
        checkAge(age);
    }

    private static void checkAge(int age) {
        if (age < 18 ) {
            System.out.println("You are not eligible for vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
