package pattern;

public class patrn13 {
    public static void main(String[] args) {
        //palindromic pattern
        int n= 5;
         
        for (int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //half number (backward)
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
