package pattern;

public class patrn14 {
    public static void main(String[] args) {
        //diamond pattern
        int n = 4;

        //upper part
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            int space = 2*i-1;
            for(int j=1; j<=space; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            int space = 2*i-1;
            for(int j=1; j<=space; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
