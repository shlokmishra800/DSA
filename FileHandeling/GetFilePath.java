import java.io.File;

public class GetFilePath {
    public static void main(String[] args) {

        File f1 = new File("index.txt");
        System.out.println(" file path is " + f1.getAbsolutePath());
    }
}

// Output =>

// file path is C:\Users\shlok mishra\Desktop\new_java\index.txt