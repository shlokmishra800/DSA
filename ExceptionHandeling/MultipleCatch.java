    package ExceptionHandeling;

    public class MultipleCatch {
        public static void main(String[] args) {
            try {
                int result = 5 / 0; // // Arithmetic Exception
                System.out.println(+result);

                int[] num = { 1, 2, 3 }; // // ArrayIndexOutOfBounds Exception
                System.out.println(num[7]);

                String str = null; // // NullPointer Exception
                System.out.println(str.length());
            } catch (ArithmeticException e) {
                System.out.println(" Divisible by 0 " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" another exception" + e);
            } catch (NullPointerException e) {
                System.out.println(" another exception" + e);
            } catch (Exception e) {
                System.out.println(" Universal Exception Handler" + e);
            }
            System.out.println("Program continues after handling exceptions...");
        }
    }


//     Output =>

//    Divisible by 0 java.lang.ArithmeticException: / by zero
// Program continues after handling exceptions...  

//Here only the first exception occurred, the remaining lines did not execute because once an exception happens, the control directly goes to the catch block.