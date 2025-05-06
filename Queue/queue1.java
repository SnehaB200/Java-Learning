package Queue;

public class queue1 {
    //queue using array
    static class Queue{
        static int arr[];
        static int size;
        static int rear =-1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue que1 = new Queue(5);
        que1.add(1);
        que1.add(2);
        que1.add(3);
        que1.add(4);
        while(!que1.isEmpty()){
            System.out.println(que1.peek());
            que1.remove();
        }
    }
}


