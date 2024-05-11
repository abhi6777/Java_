import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        sum();
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, total;

        // taking input from the user
        System.out.println("Enter the number you wanna add");
        System.out.printf("Enter the first Number = ");
        num1 = input.nextInt();

        System.out.printf("Enter the second Number = ");
        num2 = input.nextInt();

        total = num1 + num2;

        System.out.println("Total sum = " + total);
    }
}