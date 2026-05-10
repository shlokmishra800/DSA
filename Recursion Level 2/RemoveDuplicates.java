//Question.> Remove duplicates in a string 

public class RemoveDuplicates {
    public static boolean [] map = new boolean[26];
  
  
    public static void  RemoveDupli(String str , int idx , String NewString){

if( idx == str.length()){
    System.out.println(NewString);
    return ;
}

char currChar = str.charAt(idx);
if(map[currChar - 'a'] == true){
RemoveDupli(str, idx+1, NewString);

}
else{
    NewString +=currChar;
    map[currChar - 'a'] = true;
  RemoveDupli(str, idx+1, NewString);

}   
    }
    public static void main(String[] args) {
        String str = "aabbccdd";
        RemoveDupli(str, 0, "");
    }

}
//Output => abcd
//Time Complexity = )(n)

