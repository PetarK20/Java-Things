// import java.util.*;

// public class ProbabilisticSearchWithFrequency {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         // Въвеждане на броя на числата в масива
//         System.out.print("Въведете броя на елементите в масива (n): ");
//         int n = scanner.nextInt();

//         // Генериране на случайни числа в масива
//         List<Integer> numbers = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             numbers.add(random.nextInt(10000)); // Числа от 0 до 9 (за повече повтарящи се стойности)
//         }

//         // Показваме случайно генерирания списък
//         System.out.println("Генериран списък: " + numbers);

//         // Въвеждане на числото за търсене
//         System.out.print("Въведете числото за търсене: ");
//         int target = scanner.nextInt();

//         // Пробабилистично търсене
//         probabilisticSearch(numbers, target);

//         // Намиране на честота на числото
//         int targetFrequency = getFrequency(numbers, target);
//         System.out.println("Числото " + target + " се среща " + targetFrequency + " пъти в списъка.");

//         // Намиране на честота на числото 8
//         int frequencyOfEight = getFrequency(numbers, 8);
//         System.out.println("Числото 8 се среща " + frequencyOfEight + " пъти в списъка.");

//         // Намиране на най-често срещаното число
//         int mostFrequent = getMostFrequentNumber(numbers);
//         System.out.println("Най-често срещаното число е: " + mostFrequent);
//     }

//     // Метод за пробабилистично търсене
//     public static void probabilisticSearch(List<Integer> numbers, int target) {
//         Random random = new Random();
//         List<Integer> remainingNumbers = new ArrayList<>(numbers);
//         boolean found = false;

//         while (!remainingNumbers.isEmpty()) {
//             int index = random.nextInt(remainingNumbers.size());
//             int currentNumber = remainingNumbers.get(index);

//             if (currentNumber == target) {
//                 System.out.println("Числото " + target + " е намерено.");
//                 found = true;
//                 break;
//             }

//             // Премахваме проверения елемент
//             remainingNumbers.remove(index);
//         }

//         if (!found) {
//             System.out.println("Числото " + target + " не беше намерено в списъка.");
//         }
//     }

//     // Метод за намиране на честота на дадено число
//     public static int getFrequency(List<Integer> numbers, int target) {
//         int frequency = 0;
//         for (int num : numbers) {
//             if (num == target) {
//                 frequency++;
//             }
//         }
//         return frequency;
//     }

//     // Метод за намиране на най-често срещаното число
//     public static int getMostFrequentNumber(List<Integer> numbers) {
//         Map<Integer, Integer> frequencyMap = new HashMap<>();
//         for (int num : numbers) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }

//         int mostFrequent = numbers.get(0);
//         int maxFrequency = 0;

//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             if (entry.getValue() > maxFrequency) {
//                 mostFrequent = entry.getKey();
//                 maxFrequency = entry.getValue();
//             }
//         }

//         return mostFrequent;
//     }
// }
import java.util.Arrays;

public class MinCoins {
    // Функция за намиране на минималния брой монети
    public static int findMinCoins(int[] coins, int amount) {
        // Създаваме масив за минималните монети за всяка сума от 0 до amount
        int[] dp = new int[amount + 1];
        // Попълваме масива с голямо число (infinity)
        Arrays.fill(dp, Integer.MAX_VALUE);
        // Нужни са 0 монети за сума 0
        dp[0] = 0;

        // Итерация през всички суми до "amount"
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // Ако dp[amount] не се е променило, значи не може да се постигне сумата
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        // Примерен вход: номинали на монетите и сума
        int[] coins = {1, 2, 5, 10, 20, 50}; // Номинали на монетите
        int amount = 68; // Сума, която трябва да се постигне

        // Извикване на функцията
        int result = findMinCoins(coins, amount);

        // Извеждане на резултата
        if (result != -1) {
            System.out.println("Минимален брой монети: " + result);
        } else {
            System.out.println("Сумата не може да се постигне с дадените монети.");
        }
    }
}
