package Recursion;

import java.util.HashSet;

public class recursion14 {
    //to print unique sebsequences of a string
    public static void subSequence(String str, int idx, String newString, HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be add
        subSequence(str, idx+1, newString + currChar, set);

        //to not be add
        subSequence(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0, "",set);
    }
}
