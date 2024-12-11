import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class max {
    public static int max;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("От колко елемента ще е масива?");
        int numberOfElements = scanner.nextInt();
        int[] MyArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements-1; i++) {
            MyArray[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(MyArray));
        for (int i = 0; i < numberOfElements-1; i++) {
            if (MyArray[i] > max){
                max = MyArray[i];
            }
        }
        System.out.println("Най - голямото число в масива е: "+ max);
        scanner.close();
    }

}