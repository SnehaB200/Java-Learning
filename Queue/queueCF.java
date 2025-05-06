package Queue;
import java.util.*;

public class queueCF {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> que1 = new ArrayDeque<>();
        que1.add(1);
        que1.add(2);
        que1.add(3);
        que1.add(4);
        que1.add(5);
        while(!que1.isEmpty()){
            System.out.println(que1.peek());
            que1.remove();
        }
    }
}
