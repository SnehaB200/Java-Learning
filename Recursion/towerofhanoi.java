package Recursion;

public class towerofhanoi {
    //TOWER OF HANOI
    public static void towerOfHanoi(int n,char src, char helper,char dest) {
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n, dest, helper, src);

        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        }
    }

    public static void main(String[] args){
        int n =1;
        towerOfHanoi(n, 's', 'h', 'd');
    }

    //time complexity is O(2^n-1) ~= O(2^n)
}
