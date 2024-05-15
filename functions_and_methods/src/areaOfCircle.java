import java.util.Scanner;

public class areaOfCircle {
    static Scanner input = new Scanner(System.in);

    // Write a program to print the circumference and
    // area of a circle of radius entered by user by defining your own method.

    public static void main(String[] args) {
        System.out.print("Enter the radius of Circle :- ");
        int radius = input.nextInt();

        circumference(radius);
        area(radius);
    }

    private static void area(int radius) {
        double total = (3.14 * (radius * radius));

        System.out.println("Area of Circle is :- " + total);
    }

    private static void circumference(int radius) {
        double total = (2 * 3.14 * radius);

        System.out.println("Circumference of Circle is :- " + total);
    }
}
