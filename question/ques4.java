package question;
import java.util.Scanner;

public class ques4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A:");
        int num1 = sc.nextInt();

        System.out.println("Enter number B:");
        int num2 = sc.nextInt();


        if ( num1 == num2) {
            System.out.println("Equal");
        }
        else if(num1 > num2){
            System.out.println("Greater than ");
        }
        else{
            System.out.println("Smaller than");
        }
    }
}
