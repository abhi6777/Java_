import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you wanna reverse");

        int data = input.nextInt();

        int result = 0 ;

        while (data != 0) {
            int rem = data % 10;

            result = (result * 10) + rem;

            data = data / 10;
        }

        System.out.println("Reversed Number  " + result);
    }
}
