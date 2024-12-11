import java.util.Scanner;
import java.lang.Math;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        System.out.println("Write the length of the radius of the circle: ");
        radius = scanner.nextDouble();

        double area;

        area = Math.PI * radius * radius;

        System.out.println("Area of circle = " + area);
        scanner.close();
    }
}
