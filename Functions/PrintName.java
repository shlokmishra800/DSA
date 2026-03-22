
package Functions;
import java .util.*;

public class PrintName {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        PrintMyName(name); 
        sc.close();  //Function Calling
    }
}
