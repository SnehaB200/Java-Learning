package pattern;

public class patrn10 {
    public static void main(String[] args){
        int n = 5;

        //butterfly pattern

        //upper part
        for(int i=1; i<=n; i++){
            //left part
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower part
        for(int i=n; i>=1; i--){
            //left part
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //right part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
