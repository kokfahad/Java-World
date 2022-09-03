import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HandlingMultipleException {
    public static void main(String[] args) {
        try {
            var File = new FileReader("file.txt");
            var read = File.read();
            new SimpleDateFormat().parse("");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException | ParseException e){
            System.out.println(e.getMessage());
        }

        System.out.println("The next Line");
    }

}
