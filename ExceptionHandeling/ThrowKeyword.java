package ExceptionHandeling;

public class ThrowKeyword {
    static void CheckAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(" age must be 18 + ");
        }
    }

    public static void main(String[] args) {
        CheckAge(2);
    }
}

// Output =>

// Age must be 18 or above
// at ExceptionHandeling.ThrowKeyword.checkAge(ThrowKeyword.java:7)
// at ExceptionHandeling.ThrowKeyword.main(ThrowKeyword.java:13)