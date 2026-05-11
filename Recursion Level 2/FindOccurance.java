// QUESTION .>  Find the first and last occurance of an element in a string ;

public class FindOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void Occurance(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println("First => " + first);
            System.out.println(" Last => " + last);
            return;
        }

        char CurrChar = str.charAt(idx);
        if (CurrChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        Occurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        Occurance(str, 0, 'a');
    }
}

// Output =>

// First => 0
// Last => 10