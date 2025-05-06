package question;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        //to search the x from user at which index it occur
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter column:");
        int cols = sc.nextInt();

        int[][] num = new int[row][cols];
        //input
        for(int i=0; i<row; i++){
            //column
            for(int j=0; j<cols; j++){
                num[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i=0; i<row; i++){
            for (int j=0; j<cols; j++){
                //compare with x 
                if(num[i][j] == x){
                    System.out.println("X is found in (" + i + "," + j + ")");
                }
            }
        }
    }
}
