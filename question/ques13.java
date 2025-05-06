package question;

import java.util.Scanner;

public class ques13 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(isEven(num)==true){
            System.out.println("It is a Even number");
        }else{
            System.out.println("It is a Odd number");
        }
    }
}
