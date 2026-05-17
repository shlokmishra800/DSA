

class  Animal{
public void eat(){
System.out.println("animal eats");
}
}

class Dog extends Animal{
    public void Bark(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    public void Meow(){
        System.out.println(" Cat Meows");
    }
}
public class Hierarchical {
 public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.eat();
    d1.Bark();
    Cat c1 = new Cat();
    c1.eat();
    c1.Meow();
 }
}
