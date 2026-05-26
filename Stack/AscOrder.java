// Question.> sort the stack in ascending order

package Stack;

import java.util.*;

public class AscOrder {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(67);
        stack.push(90);
        stack.push(21);
        stack.push(11);

        System.out.println(" original stack = " + stack);

        List<Integer> list = new ArrayList<>(stack);
        Collections.sort(list);
        stack.clear();

        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        System.out.println(" sorted in ascending order" + stack);

    }
}

// Output=>

// original stack = [1, 67, 90, 21, 11]
// sorted in ascending order[1, 11, 21, 67, 90]
// Time Complexity = O(nlogn)