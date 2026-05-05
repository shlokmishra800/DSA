// question=> Clear the 3rd bit (positon = 2) of a number n.

// n=0101

// Solution=> 
//     step 1 => find Bitmask  (1<<i);
// Step 2 = perform operation OR With AND ;

package BitManipulation;

public class CLEARBit {
    public static void main(String[] args) {
        int n = 5 ;//0101
        int pos = 2;
        int bitmask = 1<<pos;

        int notBitmask = ~(bitmask);
        int NewNumber = (notBitmask & n);
        System.out.println(NewNumber);

    }
}



// Output  = 1  
 // Binary number of 1 is  (0001) as 1 from 3rd position from right side has been removed