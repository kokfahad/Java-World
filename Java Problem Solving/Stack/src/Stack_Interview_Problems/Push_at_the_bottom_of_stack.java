package Stack_Interview_Problems;

import java.util.Stack;

public class Push_at_the_bottom_of_stack {

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
        stack.push(4);
        pushAtTheBottomStack(5,stack);
        pushAtTheBottomStack(6,stack);
        pushAtTheBottomStack(7,stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
