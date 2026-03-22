package Functions;
import java.util.*;
public class PrintSum {
    public static int printSum(int a , int b) {
        int sum = a + b;
        return sum ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter second number ");
        int b = sc.nextInt();
       int sum = printSum(a, b);
        System.out.println("your sum is "  +sum);

    }
}
