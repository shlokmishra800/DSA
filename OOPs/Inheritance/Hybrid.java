 interface A  {
public void methodA();
    
}
interface B extends A{
public void methodB();
}

interface C{
    public void methodC();
}

class D implements C , B {
public void methodA(){
    System.out.println(" method A is Called");
}
public void methodB(){
System.out.println(" method B is called");
}
public void methodC(){
    System.out.println(" method C is called");
}
}
public class Hybrid {
    public static void main(String[] args) {
        D d1 = new D();
d1.methodA();
d1.methodB();
d1.methodC();
    }
}
