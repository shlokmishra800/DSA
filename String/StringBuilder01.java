
// In Java, StringBuilder lets you modify text directly without creating new objects, making it faster and more memory‑efficient for frequent string operations.


package String;
import java.util.*;
public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shlok");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'k');  //this function replace character
        System.out.println(sb);
        sb.insert(2, 'o');  //this function add a character
        System.out.println(sb);
        sb.delete(2 , 3);  //this function delete a character
        System.out.println(sb);
        sb.setCharAt(0, 'S');
        System.out.println(sb);
    }
}
