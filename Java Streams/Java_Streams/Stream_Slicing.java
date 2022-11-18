import java.util.List;

public class Stream_Slicing {
    public static void main(String[] args) {
        var list = List.of(
                new Movie("A","10"),
                new Movie("B","20"),
                new Movie("C","10")
        );

//        list
//                .stream()
//                .limit(2)
//                .forEach(m -> System.out.println(m.getTitle()));

//        list
//                .stream()
//                .skip(2)
//                .forEach(m -> System.out.println(m.getTitle()));

        list
                .stream()
                .takeWhile(m-> m.getTitle().equals("B"))
                .forEach(m -> System.out.println(m.getTitle()));
        list
                .stream()
                .dropWhile(m-> m.getTitle().equals("B"))
                .forEach(m -> System.out.println(m.getTitle()));

    }
}
