package question;

import java.util.Scanner;

public class ques10 {
    public static void printMult(int a, int b){
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number A:");
        int a = sc.nextInt();
        System.out.println("Input number B:");
        int b = sc.nextInt();
        printMult(a, b);
    }
}
