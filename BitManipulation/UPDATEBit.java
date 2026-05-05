// IT has 2 conditions --                      | 
//                                             |
//                                             |
//                     For 0  (Clear)          |        For 1 (Set)
//                                             | 
// Solution=>                                  | Solution=>
//     Steps 1=> Find Bitmask(1<<i);           | Step1=> Find Bitmask (1<<i);
// Step 2=> Perform Operation AND with NOT ;   | Step2=> Perfprm OR operation;



// Question.> Update the 2nd Bit (position =1) of the number n to 1 .

// n = 0101


package BitManipulation;
import java.util.*;
public class UPDATEBit {
    public static void main(String[] args) {
        System.out.println("enter your choise (0  or 1)");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        //if operation =1 (set) : operation =0 (clear)
        int n = 5;
        int pos =1 ;
        int bitmask = 1<<pos;
        if(operation == 1){   //set
int NewNumber = (bitmask  | n);
System.out.println(NewNumber);
        }
        else {  //clear
int NewBitMask = ~(bitmask);
int NewNumber = (NewBitMask & n);
System.out.println(NewNumber);
        }
    }
}


//for 1 output will be 7 which is (0111)
//for 0 output will be 5 which is (0101)
