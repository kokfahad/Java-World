import java.util.*;

public class Queue_Interview {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
        q.add(2);
        q.add(3);
//        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
