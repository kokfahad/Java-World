import java.util.Locale;
import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {
        String[] str = new String[10];

        str[5]="Hello World";

        Optional<String>checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            String myString = str[5].toLowerCase();
            System.out.println(myString);
        }else {
            System.out.println("no value present");
        }
//        System.out.println(checkNull);
    }
}
