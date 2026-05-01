package String;

public class StringBuilder03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");

           
            sb.append("e");
            sb.append("l");
             sb.append("l");
            sb.append("o");
             sb.append(" ");
            sb.append("S");
             sb.append("h");
            sb.append("l");
             sb.append("o");
            sb.append("k");
            System.out.println(sb);
                    // as strings are immutable in java ...but here in string builder functions (.append)  will not create another string to make changes it will apply changes in existing string.
    }
}
