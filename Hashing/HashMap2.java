
import java.util.HashMap;

public class HashMap2 {

    public static void main(String[] args) {
        // HashMap create karna
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Aman");

        System.out.println("Roll 101: " + students.get(101));

        for (Integer key : students.keySet()) {
            System.out.println("Roll: " + key + " Name: " + students.get(key));
        }
    }
}

// Output =>
// Roll 101: Rahul
// Roll: 101 Name: Rahul
// Roll: 102 Name: Priya
// Roll: 103 Name: Aman
