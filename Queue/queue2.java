package Queue;

public class queue2 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            rear = (rear +1)% size;
            arr[rear] = data;
            if(front == -1){
                front = 0;
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args) {
            Queue que1 = new Queue(5);
            que1.add(1);
            que1.add(2);
            que1.add(3);
            que1.add(4);
            que1.add(5);
            System.out.println(que1.remove());
            que1.add(6);
            while(!que1.isEmpty()){
                System.out.println(que1.peek());
                que1.remove();
            }
        }
    }
}
