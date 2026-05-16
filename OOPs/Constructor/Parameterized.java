
    class Student {
     String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
}
        Student(String name , int age) {

             name = this.name;
             age = this.age;

        
    }
}
public class Parameterized {
    public static void main(String[] args) {
        
        Student s1 = new Student("shlok" , 18);
        s1.name = "Shlok";
        s1.age = 18;
        s1.printinfo();
    }
}
