import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number+" is четно");
        }else{
            System.out.println(number +" is нечетно");
        }
        scanner.close();
    }
}
