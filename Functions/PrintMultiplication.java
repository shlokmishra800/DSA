package Functions;
import java.util.*;

public class PrintMultiplication {
    public static int multiplication(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number ");
        int a = sc.nextInt();
        System.out.println("enter your second number ");
        int b = sc.nextInt();
        
        System.out.println("multiplication is " +multiplication(a, b));
        sc.close();
    }
}
