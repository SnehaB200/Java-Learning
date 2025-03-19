package question;
import java.util.*;

public class ques14 {
    public static void main(String[] args) {
        //to search a number given by user in the array list
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array:");
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0; i<size; i++){
            //input
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i =0; i<size; i++){
            //output
            if(number[i] == x){
                System.out.println("X is found at index:" + i);
            }
        }
    }
    // 1st input for size
    //2nd input for array list of the size enter
    //3rd input for x
}
