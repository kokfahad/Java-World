public class Stack_LinkedList {

    static class Node{
       int data;
       Node next;
       Node(int val){
           this.data = val;
           this.next = null;
       }
    }

    static class stack{
       static Node head ;
       public boolean isEmpty(){
           return head==null;
       }
       public void push(int val){
           Node n = new Node(val);
           if (isEmpty()){
               head = n;
               return;
           }
           n.next = head;
           head= n;
       }
       public void pop(){
           if (isEmpty()){
               return;
           }
           head =head.next;
       }

       public int peek(){
           if (isEmpty()){
               return -1;
           }
           return head.data;
       }
    }


    public static void main(String[] args) {
          stack s =new stack();

          s.push(1);
          s.push(2);
          s.push(3);
          s.push(4);

          while (!s.isEmpty()){
              System.out.println(s.peek());
              s.pop();
          }
    }
}
