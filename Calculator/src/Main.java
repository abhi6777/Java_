import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;

        // take the operator as input
        System.out.println("Enter the operator");
        char op = input.next().trim().charAt(0);

        // condition to know which operation to do
        if (op == '+' || op == '_' || op == '*' || op == '/' || op == '%') {

            // take the numbers from the user
            System.out.println("Enter the first number");
            int num1 = input.nextInt();
            System.out.println("Enter the first number");
            int num2 = input.nextInt();

            if (op == '+'){
                ans = num1 + num2;
            }
            if (op == '-'){
                ans = num1 - num2;
            }
            if (op == '*'){
                ans = num1 * num2;
            }
            if (op == '/'){
                if (num2 == 0) {
                    System.out.println("Error");
                }
                ans = num1 / num2;
            }
            if (op == '%'){
                if (num2 == 0) {
                    System.out.println("Error");
                }
                ans = num1 % num2;
            }
        }
        System.out.println(ans);
    }
}