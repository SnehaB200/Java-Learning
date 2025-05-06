package Recursion;

public class recursion7 {
    public static int calPower(int x, int n){
        //base case
        if( n== 0){
            return 1;
        }
        if( x==0 ){
            return 1;
        }
        if(n%2 ==0){
            return calPower(x, n/2)* calPower(x, n/2);
        }else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
    }

    public static void main(String[] args){
        //print x^n (stack height = logn)
        int x = 2;
        int n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
