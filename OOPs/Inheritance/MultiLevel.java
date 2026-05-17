class Animal { // Parent Class
    public void Sound() {
        System.out.println("Animals Sound ");
    }
}

class Dog extends Animal { // Child Class
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Dog { // Child class
    public void meow() {
        System.out.println("Cat meows");
    }
}

class Cow extends Cat { // Child class
    public void moose() {
        System.out.println("Cow Moose");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Cow s1 = new Cow();
        s1.bark();   //inherit dog
        s1.meow();   //inherit cat
        s1.moose();

    }
}


// Output => 

// Animals Sound 
// Cat meows
// Dog barks
// Cow Moose