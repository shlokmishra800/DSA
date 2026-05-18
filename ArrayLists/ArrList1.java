package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class ArrList1 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
System.out.println(List);
//get element

int element = List.get(1);
System.out.println(element);

 // add element in Between

 List.add(1 , 4);
System.out.println(List);

//set element
List.set(0, 5);
System.out.println(List);

//remove element
List.remove(3);
System.out.println(List);

//size
int size = List.size();
System.out.println(size);

//Loop
for(int i = 0 ; i < List.size() ; i++){
    System.out.println(List.get(i) + " ");
}

//Sort (ascending order)

Collections.sort(List);    //here sort is a function of collections class
System.out.println(List);
    }
}
