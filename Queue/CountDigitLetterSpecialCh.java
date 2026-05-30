// Question.>  program to Counts the number of digits, alphabets, and special characters in a queue of String

package Queue;

import java.util.*;

public class CountDigitLetterSpecialCh {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        String str = "java123@#";
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));

        }

        int Alphabets = 0, Digits = 0, Special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = ((LinkedList<Character>) queue).get(i);

            if (Character.isDigit(ch)) {
                Digits++;
            } else if (Character.isLetter(ch)) {
                Alphabets++;
            } else {
                Special++;
            }
        }

        System.out.println(" Total Number of Letters => " + Alphabets);
        System.out.println(" Total number of Digits => " + Digits);
        System.out.println(" Total number of Special Symbol => " + Special);

    }

}

// Output =>

// Total Number of Letters => 4
// Total number of Digits => 3
// Total number of Special Symbol => 2

// Time Complexity =>O(n)
// Space Complexity => O(n)
