package ExceptionHandeling;

public class FinallyExample {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };

        try {
            System.out.println(" number is " + num[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" error caugh " + e);
        } finally {
            System.out.println(" this block always run ");
        }
        System.out.println(" exicution continue");
    }
}

// Output =>

// error caugh java.lang.ArrayIndexOutOfBoundsException: 7
// this block always run
// exicution continue