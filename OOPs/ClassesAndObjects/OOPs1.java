
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPs1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shlok";
        s1.age = 18;
        s1.printInfo();
    }
}

// Output =>
// shlok
// 18

