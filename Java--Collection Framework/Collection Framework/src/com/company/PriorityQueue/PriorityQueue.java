package com.company.PriorityQueue;

import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
//        All the functions that queue are in Priority queue
//        It gives priority to the elements
//        Queue<Integer>pq=new java.util.PriorityQueue<>(Comparator.reverseOrder());
//        By default execute min-heap but using compartor can make max-heap
        Queue<Integer>pq=new java.util.PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        pq.offer(100);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
