// Move all 'x' to the end of string 


public class MoveXToEnd {
    public static void MoveAllX(String str, int count, int idx, String NewString) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {

                NewString += 'x';
            }
            System.out.println(NewString);
            return;

        }
        char CurrChar = str.charAt(idx);

        if (CurrChar == 'x') {
            count++;
            MoveAllX(str, count, idx + 1, NewString);
        } else {
            NewString += CurrChar;
            MoveAllX(str, count, idx + 1, NewString);
        }

    }

    public static void main(String[] args) {
        String str = " axbxcx";
        MoveAllX(str, 0, 0, "");
    }
}

// Output => abcxxx

// time complexity = O(n)
// where n = length of string