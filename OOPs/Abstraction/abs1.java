
abstract class Animal { // abstract class
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println(" walks on  4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println(" walks on 2 legs");
    }
}

public class abs1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk(); // it will run sucessfully
      //  Animal a1 = new Animal();// this will give  run time error error
       // a1.walk(); 

    }
}

// OUtput =>

// walks on 4 legs
