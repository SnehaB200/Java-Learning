package Recursion;

public class recursion2 {
    public static void printNum(int n){
        //base case
        if(n>=6){
            return;
        }
        //print
        System.out.println(n);
        //recursion
        printNum(n+1);
    }

    public static void main(String[] args) {
        //print no from 1 to 5
        int n = 1;
        printNum(n);
    }
}
