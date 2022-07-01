import java.util.ArrayList;

public class Stack_ArrayList {
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public boolean isEmpty(){
        return arrayList.size() == 0;
    }

    public void push(int val){
        arrayList.add(val);
    }

    public void pop(){
        if(isEmpty()){
            return;
        }
        arrayList.remove(arrayList.size()-1);
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arrayList.get(arrayList.size()-1);
    }

    public static void main(String[] args) {

        Stack_ArrayList stack =new Stack_ArrayList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Peek: " + stack.peek());
        stack.pop();
        System.out.println("New Peek: " + stack.peek());

    }
}
