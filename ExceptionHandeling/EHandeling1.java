package ExceptionHandeling;

public class EHandeling1 {
    public static void main(String[] args) {

        int n = 5;
        int m = 0;

        try {
            int result = n / m;
            System.out.println(" sum is  " + result);
        } catch (ArithmeticException e) {
            System.out.println(" divisible by zero " + e);
        }
    }
}

// Output =>

// divisible by zero java.lang.ArithmeticException: / by zero