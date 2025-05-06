import java.util.Scanner;

public class project1 {
    
    public static void main(String[] args) {
    int number = 0;
       do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number:");
        number = sc.nextInt();
        System.out.print("Here is your number ");
        System.out.println(number);
       } while(number >=0);
        System.out.println("The End");
    }
}
