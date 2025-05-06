package pattern;

public class patrn5 {
    public static void main(String[] args) {
        //inverted half pyramid rotate by 180 deg
        int n = 4;
        for(int i = 1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        int m = 6;
        for(int i = 1; i<=m; i++){
            //space
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
