// Question .> Find Maximum and Minimum elements of Stack


package Stack;
import java.util.*;

public class FindMaxMin {

    public int findMax(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        } else {
            int temp = stack.pop();
            int max = findMax(stack);
            stack.push(temp);
            return Math.max(temp, max);
        }
    }

    public int findMin(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("stack is empty");
            return Integer.MAX_VALUE;
        } else {
            int temp = stack.pop();
            int min = findMin(stack);
            stack.push(temp);
            return Math.min(temp, min);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(67);
        stack.push(90);
        stack.push(21);
        stack.push(11);

        FindMaxMin obj = new FindMaxMin();

        int max = obj.findMax(stack);
        int min = obj.findMin(stack);

        System.out.println("Maximum element of stack is " + max);
        System.out.println("Minimum element of stack is " + min);
        System.out.println("Stack after recursion (unchanged): " + stack);
    }
}

// Output =>

//  maximum element of stack is  90
//  minimum element of stack is 0
// Time complexity for both Max and Min  = > O(n)