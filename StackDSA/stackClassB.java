package StackDSA;

import java.util.*;

import StackDSA.stackClass.Stacks;

public class stackClassB {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push function
        public static void push(int data){
            list.add(data);
        }
        //pop function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
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
