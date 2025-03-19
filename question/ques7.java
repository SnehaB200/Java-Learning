package question;
import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to type a table
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}
