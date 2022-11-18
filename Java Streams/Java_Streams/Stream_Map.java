import java.util.List;
import java.util.stream.Stream;

public class Stream_Map {
    public static void main(String[] args) {
//        // We use map in stream to transform objects
        var list = List.of(
                new Movie("A", "1"),
                new Movie("B","2"),
                new Movie("C", "3")
        );

        list.stream()
                .map(m-> m.getTitle())
                .forEach(n-> System.out.println(n));

//        flatMap flattens the streams
//        Stream<<List>x> -> Stream<x>

//        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
//
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(s -> System.out.println(s));


    }
}
