package question;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Is Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
