package question;
import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");

        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
