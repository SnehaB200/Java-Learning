package Recursion;

public class recursion19 {
    //to find the no of way a  peron can be invited 

    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //single (n-1)
        int way1 = callGuest(n-1);
        //pair (n-1)* (n-2)
        int way2 = (n-1)* callGuest(n-2);

        return way1 + way2;
    }

    public static void main(String[] args){
        int n=4;
        System.out.println(callGuest(n));
    
    }

}
