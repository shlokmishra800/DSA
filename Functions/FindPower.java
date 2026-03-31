

//in this program user will input base and power and i have to find answer --



package Functions;
import java.util.*;
public class FindPower {
    public static int Power(int n , int m) {
        int power = 1;
       for (int i = 1 ; i<=m ; i++){
        power *= n ;
       }   
      
     return power ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base number");
        int n = sc.nextInt();
        System.out.println("enter power ");
        int m = sc.nextInt();
       
 System.out.println("answer is" +Power(n, m));
 sc.close();
    }
}
