package Functions;
import java.util.*;

public class CountPositiveNegetiveZero {
   public static void countNumbers(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers with space :");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

       
        countNumbers(numbers);

        sc.close();
    }


}
