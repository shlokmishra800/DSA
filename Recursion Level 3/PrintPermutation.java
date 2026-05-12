// Question.> Print all permutations of a string 

public class PrintPermutation {
    public static void PrintPermu(String str, String Permutation) {

        if (str.length() == 0) {
            System.out.println(Permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char CurrChar = str.charAt(i);
            String NewString = str.substring(0, i) + str.substring(i + 1);
            PrintPermu(NewString, Permutation + CurrChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        PrintPermu(str, "");
    }
}

// Output =>

// abc
// acb
// bac
// bca
// cab
// cba

// Time Complexity => O(n!)
// because total number of permutations are = n!