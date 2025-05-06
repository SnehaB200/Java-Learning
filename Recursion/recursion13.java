package Recursion;

public class recursion13 {
    //to print all the subsequences of a string
    public static void subSequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be add
        subSequence(str, idx+1, newString + currChar);

        //to not be add
        subSequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }
    //time complexity is O(2^n)
}
