package Recursion;

public class recursion12 {
    public static boolean[] map = new boolean[26];

    //recursive function
    public static void removeCopy(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //map index if true
        if(map [currChar - 'a'] == true){
            removeCopy(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeCopy(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeCopy(str, 0, "");
    }
}
