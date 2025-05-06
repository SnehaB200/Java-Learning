package Recursion;

public class recursion18 {
    
    //tile placing
    public static int placeTile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertical
        int vert = placeTile(n-m, m);
        //horizontal 
        int hori = placeTile(n-1, m);
        return vert + hori;
    }
    public static void main(String[] args){
        int n=4, m=2;
        System.out.println(placeTile(n, m));
    }
}
