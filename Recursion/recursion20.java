package Recursion;

import java.util.ArrayList;

public class recursion20 {

    public static void printSubset(ArrayList<Integer> subset){
        for (int i=-0; i<subset.size();i++){
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }

    //printing recursion of natural no
    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        //want to be add
        subset.add(n);
        findSubset(n-1, subset);

        //not want to be add
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
