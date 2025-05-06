package Recursion;

public class recursion17 {
    //backtracking
    //count total path in a maze to move from (0,0) to (n, m) n=3, m=3

    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        
        //down
        int downPath = countPath(i+1, j, n, m);
        //right
        int rightPath = countPath(i, j+1, n, m);
        return rightPath + downPath;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        int totalPath = countPath(0, 0, n, m);
        System.out.println(totalPath);
    }
    
}
