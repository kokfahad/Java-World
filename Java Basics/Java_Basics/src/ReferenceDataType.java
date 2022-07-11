import java.util.Date;

public class ReferenceDataType {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now); // prints machines current time
        System.out.println(now.getTime()); // prints epoch time

    }
}
