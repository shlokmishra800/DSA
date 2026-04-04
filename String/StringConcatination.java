package String;
import java.util.*;
public class StringConcatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");
        String First = sc.next();
         System.out.println("enter your last name");
        String Last = sc.next();
        String full = First + " " + Last ;
        System.out.println("your full name is " +full);
sc.close();
    }
}
