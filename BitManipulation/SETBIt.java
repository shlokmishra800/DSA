// q1.> Set the 2nd bit (Position =1) of a number n.

// n=0101


// Solution =>
//      Step1=> fint Bitmask (1<<i)
//      Step 2=> perform operation  OR 


package BitManipulation;

public class SETBIt {
    public static void main(String[] args) {
        int n=5; //0101 
        int pos = 1;
        int bitmask = 1<<pos;
        int NewNumber = bitmask | n;
        System.out.println(NewNumber);
    }
}

// Output => 7 
// As the binary number of 7 is (111) 
// which means the 3rd position from right side has converted in to 1