package Recursion;

public class recursion3 {
    //3 parameter 
    //1st - which number, int i
    //2nd base condition, int n
    //3rd - store the sum, int sum
    public static void printSum(int i, int n, int sum){
        //base case
        if(i == n){
            sum+= i; //n is added in sum
            System.out.println(sum);
            return;
        }
        sum+=i; //addition
        printSum(i+1, n, sum); //call
        
        System.out.println(i);
    }
    public static void main(String[] args) {
        //print sum of 1st n natural number
        printSum(1, 4, 0);
        // i=1 n = 4 sum =1
        // i=2 n = 4 sum =3
        // i=3 n = 4 sum =6
        // i=4 n = 4 sum =10
        // i=5 n = 4 sum =15
    }
}
