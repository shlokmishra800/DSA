
import java.util.HashMap;

public class Hashmap3 {
    public static void main(String argd[]){
 HashMap< Integer , String> student = new HashMap<>();
student.put(1,"Shlok");
student.put(2 , "shobhit");
student.put(3 , "Shivay");

System.out.println("first name is =>" +student.get(1) );
for(Integer key : student.keySet()){
    System.out.println("other names are =>" +student.get(key));
}
    } 
}

// Output =>

// first name is =>Shlok
// other names are =>Shlok
// other names are =>shobhit
// other names are =>Shivay