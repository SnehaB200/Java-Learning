import java.util.Scanner;
public class miniPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int user = 0;
        do{
            System.out.println("Guess my number from 1 to 100:");
            user = sc.nextInt();
            if(user == myNum){
                System.out.println("WoHoHo... Your answer is correct!");
                break;
            }
            else if(user > myNum){
                System.out.println("Too Large");
            }
            else{
                System.out.println("So Small");
            } 
        }while(user >=0);  
        
        System.out.println("My number was:");
        System.out.println(myNum);
    }
}
