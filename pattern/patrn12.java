package pattern;

public class patrn12 {
    public static void main(String[] args) {
        //number pyramid

        int n= 5;

        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //number
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
