package pattern;

public class patrn3 {
    public static void main(String[] args) {
        //half pyramid
        int n=4;

        for(int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
