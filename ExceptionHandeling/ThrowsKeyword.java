    package ExceptionHandeling;

    import java.io.FileReader;
    import java.io.IOException;


    public class ThrowsKeyword {
        static void ReadFile(String FileName) throws IOException{

            try(FileReader file1 = new FileReader(FileName)){
    int data;
    while((data = file1.read()) != -1){
        System.out.println((char) data);
    }
            }
        }
    public static void main(String[] args) {
        try{
            ReadFile("text.txt");
        } catch(IOException e){
            System.out.println(" error caught" +e.getMessage());
        }
        System.out.println(" program continue after file Operation");
    }

    }

// Output=>

//  error caughttext.txt (The system cannot find the file specified)
//  program continue after file Operation
