import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyInException {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("File.txt");
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
