package ExceptionHandeling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(" outer try block");
            try {
                int n = 5;
                int m = 0;
                int resule = n / m;
                System.out.println(resule);
            } catch (ArithmeticException e) {
                System.out.println("inner catch" + e);
            }
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(" outer catch" + e);
        }
    }
}

// Output =>

// outer try block
// inner catchjava.lang.ArithmeticException: / by zero
// outer catchjava.lang.NullPointerException
