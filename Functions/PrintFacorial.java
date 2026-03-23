package Functions;
import java.util.*;
public class PrintFacorial {
    public static void PrintFactorial(int n) {
       //Base Condition 
       
       if(n<0){
        System.out.println("factorial can't be negative! ");
        return;
       }
       int factorial =1;
       for(int i=n ; i>=1 ; i--){
         factorial = factorial *i;
        

       }
       System.out.println("factorial of given number is " +factorial);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
        PrintFactorial(n);
    }
}
