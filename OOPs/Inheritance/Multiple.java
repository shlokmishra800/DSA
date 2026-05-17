interface Father {
public void Money();

    
}
interface Mother {
    public void Car();
}

 class Child implements Father , Mother {
    public void Money(){
         System.out.println("Father gives money");
    }
    public void Car(){
        System.out.println(" mother gives me car");
    }
 }


public class Multiple {
    
    public static void main(String[] args) {
        Child s1 = new Child();
        s1.Money();
        s1.Car();
        
    }
}
