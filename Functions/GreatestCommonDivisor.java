
//in this program user will enter 2 numbers and i have to find greatest common divisior of that 2 numbers......




package Functions;
import java.util.*;
public class GreatestCommonDivisor {
    public static int CommonDiv(int n  , int m) {
       while(m != 0){
int temp = m;
m = n%m;
n = temp;

       }
      return n ;
        
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first Number");
        int num1 = sc.nextInt();
        System.out.println("enter your Second Number");
        int num2 = sc.nextInt();
       int result  = CommonDiv(num1, num2);
        System.out.println("greatest common divisior of"+num1 + " and" + num2 +" is" +result);
        sc.close();
    }
}
