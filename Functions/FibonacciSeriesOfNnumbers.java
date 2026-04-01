//in this program user will enter the limit of fibonacci series .....




package Functions;
import java.util.*;

public class FibonacciSeriesOfNnumbers {
    public static void Fibonacci(int n) {
         int first = 0,
          second=1;
for(int i=1 ; i<=n ; i++){
    System.out.println(first);
    int next = first + second;
    first = second;
    second = next ;



}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fibonacci series limit");
        int n = sc.nextInt();
        Fibonacci(n);
        sc.close();
    }
}
