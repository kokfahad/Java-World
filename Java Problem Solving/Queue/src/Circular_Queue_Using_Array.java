public class Circular_Queue_Using_Array {

    static class Queue{
        static int[] arr ;
        static int size;
        static int front = -1;
        static int rear = -1;
        Queue(int n){
            arr = new int[10];
            this.size = n;
        }

        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public boolean isFull(){
            return rear+1 == front;
        }

        public void add(int data){
            if (isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1){
                front++;
            }
            rear = (rear+1)%size;

            arr[rear] = data;
        }

        public int remove(){
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int top = arr[front];

            if (front == rear){
                front = rear = -1;
                return top;
            }
            front= (front+1) % size;

            return top;

        }

    }

    public static void main(String[] args) {

        Queue queue = new Queue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}
