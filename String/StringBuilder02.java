package String;
import java.util.*;
public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shlok");
        int front = sb.charAt(0);
        int back = sb.length()-1;
        for(int i = 0  ; i<sb.length()-1 ; i++){
            int FrontChar = sb.length()-1-i;
            int BackChar = sb.charAt(0);
            System.out.println(sb);

                    

        }
    }
}
