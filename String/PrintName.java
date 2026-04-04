package String;
import java.util.*;
public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        // we use sc.next() for single word and sc.nextLine() for more then one word 
        String name = sc.nextLine();
        System.out.println("hello " +name +" how are you ?" );
        sc.close();
    }
}
