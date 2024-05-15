import java.util.Scanner;

public class product {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the first Number :- ");
        int num1 = input.nextInt();
        System.out.print("Enter the second Number :- ");
        int num2 = input.nextInt();

        multiply(num1, num2);
    }

    private static void multiply(int num1, int num2) {
        int total = num1 * num2;
        System.out.print("The product of both number is :- " + total);
    }
}
