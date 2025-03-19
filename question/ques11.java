package question;

import java.util.Scanner;

public class ques11 {

    public static void printFact(int n) {
        int fact = 1;
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i=n; i>=1; i--){
            fact = fact *i;
        }
        System.out.println(fact);
        
    }
    public static void main(String[] args) {
        //factioral of number
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int fat = sc.nextInt();
        printFact(fat);
    }
}
