import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("index.txt");
            writer.write(" My name is Shlok Mishra");
            writer.close();
            System.out.println(" written work completed");

        } catch (IOException e) {
            System.out.println("errro caught" + e.getStackTrace());
        }
    }
}

// Output =>

// written work completed

// inside index.txt => My name is Shlok Mishra
