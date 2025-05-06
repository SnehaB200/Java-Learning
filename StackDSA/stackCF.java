package StackDSA;
import java.util.Stack;

public class stackCF {
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
    }
}
