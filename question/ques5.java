package question;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10:");
        int btn = sc.nextInt();

        switch (btn) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Ni Hao");
            default:
                System.out.println("Invalid Button");
                break;
        }
    }
}
