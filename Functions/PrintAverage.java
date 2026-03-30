package Functions;
import java.util.*;
public class PrintAverage {
    public static int PrintAvg(int a , int b , int c) {
        return (a + b + c)/3;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your first number");
    int a = sc.nextInt();
    System.out.println("enter your second number");
    int b = sc.nextInt();
    System.out.println("enter your third number");
    int c = sc.nextInt();

    System.out.println(" average of given 3 numbers is " +PrintAvg(a, b, c));
    sc.close();
}
}
