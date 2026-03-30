package Functions;
import java.util.*;
public class EligibleVote {
    public static void Eligible(int n) {
        if(n>18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int n = sc.nextInt();
        Eligible(n);
        sc.close();
    }
}
