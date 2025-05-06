package Recursion;

public class recursion6 {
    public static int calPower(int x, int n){
        int xPow1 = calPower(x, n-1);
        int xPowNum = x * xPow1;
        return xPowNum;
    }
}
