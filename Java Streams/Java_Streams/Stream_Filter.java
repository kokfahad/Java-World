import java.util.List;

public class Stream_Filter {
    public static void main(String[] args) {
        var list = List.of("a","b", "c");

        list
                .stream()
                .filter(s -> s.equals("b"))
                .forEach(s -> System.out.println(s));
    }
}
