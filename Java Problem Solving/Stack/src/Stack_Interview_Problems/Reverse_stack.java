package Stack_Interview_Problems;

import java.util.Stack;

public class Reverse_stack {

    public static void stackReverse(Stack<Integer>stack){
        if (stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        stackReverse(stack);
        pushAtTheBottomStack(top,stack);
    }

    public static void pushAtTheBottomStack(int data,Stack<Integer>stack){
        if (stack.empty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtTheBottomStack(data,stack);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stackReverse(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
