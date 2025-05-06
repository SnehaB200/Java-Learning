// import the ArrayList class
import java.util.*;

public class ArrayListExm {
    public static void main(String[] args) {
        //define an array list
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements to the array list
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get element
        int element = list.get(1);
        System.out.println(element);

        //add element in between
        list.add(1,5);
        list.add(3,7);
        System.out.println(list);

        //set element
        list.set(1,8);
        System.out.println(list);

        //delete elemet
        list.remove(2);
        System.out.println(list);

        //to count size
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting

        Collections.sort(list);
        System.out.println(list);
    }
}
