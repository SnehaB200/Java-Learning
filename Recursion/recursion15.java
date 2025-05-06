package Recursion;

public class recursion15 {
    //keypad combination

    //map create
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu", "vwx","yz"};

    //recursive function
    public static void printKey(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            printKey(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "1";
        printKey(str, 0, "");
    }
}
