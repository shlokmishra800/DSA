import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try {

            File f1 = new File("index.txt");

            Scanner Reader = new Scanner(f1);

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);

            }

            Reader.close();
        } catch (IOException e) {
            System.out.println(" error caught" + e.getStackTrace());
        }
    }
}

// Output =>

// My name is Shlok Mishra