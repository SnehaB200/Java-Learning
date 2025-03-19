import java.util.Scanner;

public class main20A {
    public static void main(String[] args) {
        
        //taking the array list from user
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array and also list:");
        int size = sc.nextInt();

        int num[] = new int[size];
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
            System.out.println(num[i]);
        }
    }   
}
