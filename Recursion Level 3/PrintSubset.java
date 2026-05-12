// Question.> Prin all the subset of  a set of first n natural numbers

import java.util.*;

public class PrintSubset {

    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");

        }
        System.out.println();
    }

    public static void FindSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }
        subset.add(n);
        FindSubset(n - 1, subset);

        // dont add

        subset.remove(subset.size() - 1);
        FindSubset(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        FindSubset(n, subset);

    }
}

// Output =>

// 3 2 1
// 3 2
// 3 1
// 3
// 2 1
// 2
// 1
// time compleity for this question is O(2^n)
// because every element has 2 choice(include or not include);
