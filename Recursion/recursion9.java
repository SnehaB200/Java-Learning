package Recursion;

public class recursion9 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccur (String str, int ind, char element){
        //base
        if(ind == str.length()){
            System.out.println(first );
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(ind);
        if(currchar == element){
            if(first == -1){
                first = ind;
            }else{
                last = ind;
            }
        }
        findOccur(str, ind+1, element);
    }
    public static void main(String[] args) {
        //the 1st and last occurance of an element in a string

        String str = "abaacdaafaah";
        findOccur(str, 0, 'a');
    }
    //time complexity is O(n)
}
