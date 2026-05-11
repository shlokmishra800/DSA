// Question.> Print keypad combimatiobs

public class KeypadCombination {
    public static String[] Keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void PrintComb(String str, int idx, String Combination) {
        if (idx == str.length()) {
            System.out.println(Combination);
            return;
        }
        char CurrChar = str.charAt(idx);
        String mapping = Keypad[CurrChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            PrintComb(str, idx + 1, Combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "23";
        PrintComb(str, 0, "");
    }
}

// Output =>

// dg
// dh
// di
// eg
// eh
// ei
// fg
// fh
// fi

// Time Complexity => (4^n)
// because masximum length of our string can be = 4
// and maximum choices we can have = 4