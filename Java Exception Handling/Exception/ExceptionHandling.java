import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            var File = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//            System.out.println("File Not found");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        System.out.println("The next Line");
    }
}
