// Question.> Reverse a String using stack

package Stack;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Shlok";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        System.out.println(" original String " + str);
        System.out.println(" reversed String " + reverse);
    }
}

// output =>

// original String Shlok
// reversed String kolhS

// Time Complexity => O(n)
