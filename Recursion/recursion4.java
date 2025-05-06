package Recursion;

public class recursion4 {
    //main function n=5
    //base - n==1 return 1
    //work - print n, call n-1

    public static int printFact(int n){
        //base case
        if(n==1 || n==0){
            return 1;
        }
        int fact = printFact(n-1);
        int fact_num = n*(fact);
        return fact_num;
    }
    public static void main(String[] args){
        int n = 5;
        int ans = printFact(n);
        System.out.println(ans);
        // 5 = 5*4*3*2*1 = 120
    }
}
