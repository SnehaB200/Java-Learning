import java.util.*;

public class main21 {
    public static void main(String[] args) {
        // /2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row:");
        int row = sc.nextInt();
        System.out.println("Enter Column:");
        int cols = sc.nextInt();

        //taking input from user for row and column & printing the number from user

        int[][] number = new int[row][cols];
        //for repeating value use loop

        //for row
        for(int i=0; i<row; i++){
            //column
            for (int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<row; i++){
            for (int j=0; j<cols; j++){
                System.out.println(number[i][j]);
            }
            System.out.println();
        }
    }
}
