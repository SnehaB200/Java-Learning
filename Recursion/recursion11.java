package Recursion;

public class recursion11 {
    //moving any alphabet to the end
    public static void moveAlphabet(String str, int idx, int count, String newString){
        
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'l';
            }
            System.out.println(newString);
        }
        char currChar = str.charAt(idx);
        if(currChar == 'l'){
            count ++;
            moveAlphabet(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveAlphabet(str, idx+1, count, newString);
        }
    }
   public static void main(String[] args) {
        String str = "allbllclldll";
        moveAlphabet(str, 0, 0, "");
   }
   //time complexity is O(n)
}

