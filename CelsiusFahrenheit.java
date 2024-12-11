import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5) + 32;
        System.out.println(celsius + " Celsius in Fahrenheit is " + fahrenheit);

        scanner.close();
    }
}
