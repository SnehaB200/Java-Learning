package Recursion;

public class recursion16{
    public static void printPermutation(String str, String permut){
        if(str.length() ==0){
            System.out.println(permut);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, permut+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, " ");
    }
}
