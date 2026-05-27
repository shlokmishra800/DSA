// Question.> Remove duplicate elements from stack

package Stack;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        System.out.println(" original stack elements " + stack);

        LinkedHashSet<Integer> seen = new LinkedHashSet<>(stack); // LinkedHashSet maintains insertion order with unique
                                                                  // values.
        Stack<Integer> result = new Stack<>();
        for (Integer val : seen) {
            result.push(val);
        }

        System.out.println(" after removing duplicate elements " + result);

    }
}

// Output =>

// original stack elements [1, 2, 3, 4, 3, 2]
// after removing duplicate elements [1, 2, 3, 4]
// Time complexity = O(n)