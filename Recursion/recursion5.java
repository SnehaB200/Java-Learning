package Recursion;

public class recursion5 {
    //given 1st -0 & 2md - 1
    //base nth term
    //work c = a+b
    public static void printFibo(int a, int b, int n){
       //base case
       if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibo(b, c, n-1);
    }

    public static void main(String[] args){
        //print fibonacci series till nth term

        int a = 0; 
        int b = 1;
        int n = 7;

        System.out.println(a);

        System.out.println(b);

        printFibo(a, b, n-2);
    }
}
