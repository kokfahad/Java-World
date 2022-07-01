package com.company.ArrayDeque;

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer>adq= new java.util.ArrayDeque<>();
        adq.offer(20);
        adq.offer(30);
        adq.offerFirst(70);
        adq.offerLast(100);
        System.out.println(adq);

        System.out.println("Peek value: "+ adq.peek());
        System.out.println("Peek First value: "+ adq.peekFirst());
        System.out.println("Peek Last value: "+ adq.peekLast());

        System.out.println("Poll value: "+adq.poll());
        System.out.println("Poll First value: "+adq.pollFirst());
        System.out.println("Poll Last value: "+adq.pollLast());

        System.out.println(adq);
    }
}
