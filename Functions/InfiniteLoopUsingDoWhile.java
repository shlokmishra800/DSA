package Functions;
import java.util.*;

public class InfiniteLoopUsingDoWhile {
    public static void Loop() {
        do{
            int i=0;
           System.out.println(+i);
            i+=1;

        }
        while(true);
        
    }
    public static void main(String[] args) {
        Loop();
    }
}
