package String;
import java.util.*;
public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");
        String First = sc.next();
         System.out.println("enter your last name");
        String Last = sc.next();
        String full = First + " " + Last ;
        System.out.println("your full name is " +full);
        System.out.println("length of your name is " +full.length()); // we use .length() function to find the length of a string 
for(int i = 0 ; i<full.length() ; i++){
    System.out.println(full.charAt(i));  //we use chatAt()function to access every index of a string.
}
// .compareTo() => this function compare two strings and check 3 conditions --
 // if string1  < string 2 = then it will return an negetive(-) value
 // if string1  > string 2 = then it will return an positive(+) value
 // if string1  = string 2 = then it will return 0 
 if(First.compareTo(Last) == 0) {
System.out.println("strings are equal");
 }
 else{
    System.out.println("Strings are not equal");
 }




// substring(beg index , end index)

// in substring() function we have to give the begenning index and ending index of a string and it will return the middle part of the index which we have to store in a variable as a substring.
// #note 1.
// 1.) here ending index is not including in creating substring. it include begenning index and (ending index-1)
// eg: substring(1 , 3 ) => here 1 will enclude but 3 will not enclude in creating substring .
// 2.) if we do not provide ending index then by default it will include last index of string.

String sentence = "My Name Is Shlok " ;
 String name = sentence.substring(11  , sentence.length());
System.out.println(" your SubString is " +name);
sc.close();
    }
}
 





