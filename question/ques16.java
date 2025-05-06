package question;

public class ques16 {
    public static void main(String[] args) {
        //reverse a string using string builder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }   
}
