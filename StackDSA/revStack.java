package StackDSA;

import java.util.*;

public class revStack {
    public class stackImplict {
        public static void pushAtBottom(int data,Stack<Integer> stks){
            if(stks.isEmpty()){
                stks.push(data);
                return;
            }
            int top = stks.pop();
            pushAtBottom(data, stks);
            stks.push(top);
        }
        public static void revStack(Stack<Integer> stk){
            if(stk.isEmpty()){
                return;
            }
            int top = stk.pop();
            revStack(stk);
            pushAtBottom(top, stk);
        }
        public static void main(String[] args) {
            Stack<Integer> stks = new Stack<>();
            stks.push(1);
            stks.push(2);
            stks.push(3);
            stks.push(4);
            while(!stks.isEmpty()){
                System.out.println(stks.peek());
                stks.pop();
            }
            revStack(stks);
        }
    }    
}
