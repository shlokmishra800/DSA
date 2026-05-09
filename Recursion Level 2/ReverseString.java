// Question=> Print a string in reverse order

public class ReverseString {
    
public static void RevStr(String str , int idx) {
    if( idx == 0){
        System.out.print(str.charAt(idx));
        return ;
    }
    System.out.print(str.charAt(idx));
    RevStr(str, idx-1);
}
public static void main(String[] args) {
    String str = "abcde";
    RevStr(str, str.length()-1);     //time Complexity  = O(n)  
                                     //where n = length of  a string 
}

}


// Output => 

//     edcba