public class Queue_Using_Array {

    static class Queue{
        static int [] arr;
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        //Enqueue
        public void push(int data){
            if (rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear]= data;
        }

        //DeQueue
        public int remove(){
            if (isEmpty()){
                System.out.println("No element to delete");
                return -1;
            }
            int front = arr[0];

            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public int peek(){
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("peek: "+ queue.peek());

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
