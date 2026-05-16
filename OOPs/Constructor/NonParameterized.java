package OOPs.Constructor;
class Student {
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
}
        Student() {

            System.out.println("Constructor  called");
        
    }
}
public class NonParameterized {
    

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Shlok";
        s1.age = 18;
        s1.printinfo();
    }
}
