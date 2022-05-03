import java.util.Arrays;

public class  Main {
    public static void main(String[] args) {
        //Lesson 6 Task 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Lesson 6 Task 2
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // проверка дополнительная для себя
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[29] + " рублей.");

        //Lesson 6 Task 2 (alternative way)
        int maxExpense = -1;
        for (int j : arr) {
            if (j > maxExpense) {
                maxExpense = j;
            }
        }
        int minExpense = arr[0];
        for (int j : arr) {
            if (j < minExpense) {
                minExpense = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей.");

        //Lesson 6 Task 3
        double averageValue = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

        //Lesson 6 Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}