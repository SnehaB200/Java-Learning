public class main12 {
    public static void main(String[] args) {
        //logical statement and(&&) and or(||)
        
        int a = 60;
        int b = 30;
        if (a<50 && b<50)
            System.out.println("Both are less than 50");
        if(a<50 || b<50)
            System.out.println("Atleast one is less than 50");
        
        //negation(!)
        boolean isAdult = false;
        if(!isAdult)
            System.out.println("Adult");
        else
            System.out.println("Not Adult");
    }
}
