package Functions;
import java.util.*;
public class ReturnCircumferenceOfCircle {
  public static double Circum(double r) {
   double  circum = (2 * 3.14 * r) ;
   return circum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter radious of circle ");
    double r = sc.nextInt();
   double circum = Circum(r);
   System.out.println("the Circumference of your circle (in cm) is "+circum);
   
sc.close();
  }
}
