//  Question.> Find the number of ways in which you can invite n people to your party  , single or in pair
 
 
 public class CallGuest {
    public static int  callguest( int n) {
        if( n <= 1){
            return 1;
        }

        // single

        int single = callguest(n-1);

        //pair 
        int pair = (n-1) * callguest(n-2);

        return single + pair ;

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callguest(n));
    }
}

// Output => 10

// we can improve time complexity for this program using Dynamic Programming