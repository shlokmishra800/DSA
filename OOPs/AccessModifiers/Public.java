class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}
public class Public {
      public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // Accessible everywhere
    }
}
