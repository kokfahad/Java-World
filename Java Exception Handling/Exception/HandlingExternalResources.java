import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandlingExternalResources {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("File.txt");) //initializing file and adding finally by default & handling exception
        {
            var value = reader.read();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
