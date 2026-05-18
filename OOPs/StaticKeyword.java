class Student{
String name;
static String School;  // we use static keyword on that things which are common in every places

}

public class StaticKeyword {
    public static void main(String[] args) {
        Student.School = "ABC";   // we can access static vaiables by their class name  
     Student s1 = new Student();
     s1.name = "Shlok";
System.out.println(s1.name);
System.out.println(Student.School);
    }
}
