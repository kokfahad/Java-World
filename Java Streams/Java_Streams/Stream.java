import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Stream {
    public static void main(String[] args) {
        // four ways to create stream
        //1) From Collections
        Collection<Integer>x; // Every class that implement collection can use stream

//        var list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.stream()
//                .forEach(s-> System.out.println(s));


//      2) Using Array
//        int[] arr = {1,2,3,4,5};
//        Arrays.stream(arr)
//                .forEach(n -> System.out.println(n));

//        3) using arbitrary number of objects
//        var stream = java.util.stream.Stream.generate(() -> Math.random());
//
//        stream
//                .limit(10)
//                .forEach(n-> System.out.println(n));

//        4) using iterate method
        java.util.stream.Stream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n -> System.out.println(n));

    }
}
