
class Shape {                             //Parent Class
    public void area() {
        System.out.println("area of triangle is ");

    }

}

class Triangle extends Shape {          //Child Class  
    public void area(int l, int h) {
double result = .5 * l * h;
        System.out.println(result);
    }
}

public class SingleLevel {
    public static void main(String[] args) {

      
        Triangle t1 = new Triangle();
        t1.area(3, 5);
        t1.area();

    }
}
