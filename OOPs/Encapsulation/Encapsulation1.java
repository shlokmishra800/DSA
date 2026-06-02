package OOPs.Encapsulation;

 class Coder {
private String name;

public String getName(){

return name;

}

public void  setName(String name){
   this.name = name;
}


}



public class Encapsulation1 {
    

    public static void main(String[] args) {
        Coder c1 = new Coder();
        c1.setName("Shlok");
        System.out.println(" Coder name is => " +c1.getName());
    }
}

// Output =>

//  Coder name is => Shlok