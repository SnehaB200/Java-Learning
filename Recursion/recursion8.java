package Recursion;

public class recursion8 {
    public static void printRev(String str, int ind){
        System.out.println(str.charAt(ind));
        printRev(str, ind-1);
        if(ind == 0){
            System.out.println(str.charAt(ind));
            return;
        }
    }
    public static void main(String[] args){
        String str = "abcd";
        printRev(str, str.length()-1);
    }
    //time complexity is O(n)
}
  