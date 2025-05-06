package question;

import java.util.Scanner;


public class ques12 {

    public static boolean checkPrime(int num){
        if(num<=1){
            System.out.println("Not a Prime number");
            return false;
        }
        if(num <= 3){
            System.out.println("A Prime number");
            return true;
        }
        //num divisible by 2 & 3 are not prime
        if(num % 2 == 0 || num % 3 == 0){
            System.out.println("Not a Prime number");
            return false;
        }
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                System.out.println("Not a Prime number");
                return false;
            }
        }
        System.out.println("A Prime number");
        return true;
       

    }
    public static void main(String[] args) {
        // to check whether a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int prime = sc.nextInt();
        checkPrime(prime);
    }
}
