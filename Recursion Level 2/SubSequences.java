// Print all subsequences of a string 

public class SubSequences {
    public static void subsequence(String str, int idx, String NewString) {
        if (idx == str.length()) {
            System.out.println(NewString);
            return;
        }

        char CurrChar = str.charAt(idx);
        // add

        subsequence(str, idx + 1, NewString + CurrChar);

        // dont add

        subsequence(str, idx + 1, NewString);

    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }
}
//Time Complexity = )(2^n)
//  Output => 

    // abc
    // ab
    // ac
    // a
    // bc
    // b
    // c
    