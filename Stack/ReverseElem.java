// Question .> Reverse the elements of stack

package Stack;
import java.util.*;
public class ReverseElem {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<> ();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(" original stack " +stack);

        List <Integer> list = new ArrayList<>(stack);

        stack.clear();
        for(int i = list.size()-1 ; i >=0 ; i--){
            stack.push(list.get(i));
           
        }
         System.out.println(" after reversing the stack " +stack);
    }
}

// Output =>

//  original stack [1, 2, 3, 4, 5]
//  after reversing the stack [5, 4, 3, 2, 1]
// Time Complexity = O(n)