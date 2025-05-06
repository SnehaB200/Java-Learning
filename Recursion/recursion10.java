package Recursion;

public class recursion10 {
    //to check an array is sorted in strictly increasing order
    public static boolean isSorted(int arr[], int idx){
        //base case
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            //array is sorted till now
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
    int arr[] = {1,3,3};
    System.out.println(isSorted(arr, 0));
}
    //time complexity is O(n)
}

