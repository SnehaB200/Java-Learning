package StackDSA;

public class stackClass{
    static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stacks{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }
        //push function

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            //if stack is not empty
            newNode.next = head;
            head = newNode;
        }
        //pop function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
    Stacks stck = new Stacks(); // Updated to use 'Stack'
        stck.push(1);
        stck.push(2);
        stck.push(3);
        stck.push(4);

        while (!stck.isEmpty()) {
            System.out.println(stck.peek());
            stck.pop();
        }
    }
}