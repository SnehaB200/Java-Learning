package question;
import java.util.Scanner;

public class ques9 {
    public static void printSum(int a, int b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two number A:");
        int a = sc.nextInt();
        System.out.println("Input two number B:");
        int b = sc.nextInt();
        printSum(a, b);
    }
}
