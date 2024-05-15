import java.util.Scanner;

public class prblm2 {
    static Scanner input = new Scanner(System.in);

    // Define a program to find out whether a given number is even or odd.

    public static void main(String[] args) {
        System.out.println("Enter a Number you wanna know even or odd");
        int num = input.nextInt();
        even_odd(num);
    }

    static void even_odd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even a Number");
        } else {
            System.out.println(num + " is not even a Number");
        }
    }
}
