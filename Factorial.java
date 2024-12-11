import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = 1;
            for (int i = number; i >= 1; i--) {
                result *= i;
            }
            System.out.println("The factorial of " + number + " is " + result);
        }
        scanner.close();
    }
}
