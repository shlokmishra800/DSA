package Functions;
import java.util.*;
public class GreaterNumber {
    public static int GreaterNum(int n , int m ) {
        if(n>m){
            System.out.println("first number is greater");
            return n ;
        }
        else {
            System.out.println("second number is greater");
            return m;
        }
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your first number");
        int n = sc.nextInt();
        System.out.println("please enter your second number");
        int m = sc.nextInt();
     GreaterNum(n, m);
     sc.close();
    }
  
}
