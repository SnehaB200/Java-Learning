import java.util.Scanner;

public class main24a {
    public static void main(String[ ] args){
        //bit manipulation

        //git bit operator AND

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter a position:");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit is 0");
        }else{
            System.out.println("Bit is 1");
        }
    }
}
