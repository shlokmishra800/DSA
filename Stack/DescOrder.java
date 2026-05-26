// Question .> Sort the Stack elements in descending order

package Stack;

import java.util.*;

public class DescOrder {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(67);
        stack.push(90);
        stack.push(21);
        stack.push(11);
        System.out.println(" original stack elements " + stack);

        List<Integer> list = new ArrayList<>(stack);

        Collections.sort(list);

        stack.clear();

        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));

        }
        System.out.println(" after sorting in descending order " + stack);
    }
}

// Output =>

// original stack elements [1, 67, 90, 21, 11]
// after sorting in descending order [90, 67, 21, 11, 1]

// Time Complexity = O(nlogn)