import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pen = 20 & book = 30
        System.out.println("Enter cash:");
        int cash = sc.nextInt();
        if(cash < 10){
            System.out.print("Can't buy anything");
            System.out.println("get more money");
        }
        else if(cash >10 && cash < 30 ){
            System.out.println("buy only one thing");
        }
        else{
            System.out.println("buy both");
        }
    }
}
