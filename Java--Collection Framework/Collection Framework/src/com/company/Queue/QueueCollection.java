package com.company.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue :"+ queue);

//        In order to delete from queue
        System.out.println(queue.poll());

        System.out.println("After delete Queue: "+ queue);

//        In order to know the first standing element in queue
        System.out.println(queue.peek());



    }
}
