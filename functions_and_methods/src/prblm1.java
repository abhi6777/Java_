import java.util.Scanner;

//Define two methods to print the maximum and the minimum
// number respectively among three numbers entered by the user.

public class prblm1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first no.");
        int num1 = input.nextInt();
        System.out.println("Enter the second no.");
        int num2 = input.nextInt();
        System.out.println("Enter the third no.");
        int num3 = input.nextInt();

        maximum(num1, num2, num3);

        minimum(num1, num2, num3);
    }

    private static void minimum(int num1, int num2, int num3) {
        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Minimum number = " + min);
    }

    static  void maximum(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Maximum number = " + max);
    }
}
