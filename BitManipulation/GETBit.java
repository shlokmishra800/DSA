// Q1.> Get the 3rd bit (position = 2) of number n . 
// n = 0101

// Solution =. step 1 = fint bitmask (1<<i)
// step 2=> perform operation AND


package BitManipulation;

public class GETBit {
    public static void main(String[] args) {
        int n = 5;
        int pos =2;
            int bitmask = 1<<pos;
            if((bitmask & n) ==0 ){
                System.out.println("bit was 0");

            }
            else {
                System.out.println("bit was 1");
            }

    }
}


// Output = 1 
// as the 3rd bit from right side on position 2 is 1