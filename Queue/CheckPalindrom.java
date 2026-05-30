// Question.> Check whether the number is palindrom or not

package Queue;

import java.util.*;

public class CheckPalindrom {
    public static void main(String[] args) {

        int num = 12321;
        String str = String.valueOf(num);
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));

        }
        Boolean isPalindrom = true;
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {

            char front = ((LinkedList<Character>) queue).get(i);
            char rear = ((LinkedList<Character>) queue).get(n - 1 - i);

            if (front != rear) {
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom) {
            System.out.println(" number is Palindrom");
        } else {
            System.out.println(" number is not palindrom");
        }

    }
}

// Output =>

// number is Palindrom

// Time Complexity = O(n)
// Space Complexity = O(n)