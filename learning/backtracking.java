public class backtracking {
    
    public static void printPermut(String str, String permut, int idx){
        if(str.length() ==0){
            System.out.println(permut);
            return;
        }
        for(int i=0; i<str.length(); i++){
            //to place  the charater at current position
            char currChar = str.charAt(i);

            //to remove the current char and add other string to the place
            String newString = str.substring(0, i)+ str.substring(i+1);
            //permut = permut + currChar
            printPermut(newString, permut+currChar, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermut(str, "", 0);
    }
}
