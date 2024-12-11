import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double y = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double z = scanner.nextDouble();

        System.out.println("FINDING THE MAX OF A, B, C");

        if (x >= y && x >= z) {
            System.out.println("Max is the value of a: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Max is the value of b: " + y);
        } else {
            System.out.println("Max is the value of c: " + z);
        }

        scanner.close();
    }
}
