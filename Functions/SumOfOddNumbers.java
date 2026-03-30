package Functions;
import java.util.*;
public class SumOfOddNumbers {
   public static int OddSum(int n) {
       int sum = 0;
    for(int i =1 ; i<=n ; i+=2){
     
        sum += i;
        
   
    }
    
     return sum ;

   } 
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your number limit");
    int n = sc.nextInt();
    
    int sum = OddSum(n);
    System.out.println("sum of all odd numbers is " +sum);
    sc.close();
   }
}
