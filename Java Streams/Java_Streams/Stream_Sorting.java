import java.util.Comparator;
import java.util.List;

public class Stream_Sorting {

    public static void main(String[] args) {
        var list = List.of(
                new Movie("A","10"),
                new Movie("B","20"),
                new Movie("C","30")
        );

        list.stream()
//                .sorted((s,t) -> s.getTitle().compareTo(t.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(s-> System.out.println(s.getTitle()));

        list.stream()
//                .sorted((s,t) -> s.getTitle().compareTo(t.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(s-> System.out.println(s.getTitle()));
    }
}
