package com.company.Stack;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Elephant");
        stack.push("Deer");
        System.out.println("Stack "+ stack);

//        To see which element is in top
        System.out.println("Top element in stack "+ stack.peek());
//        to delete an element
        stack.pop();
        System.out.println("Top element in stack "+ stack.peek());
    }
}
