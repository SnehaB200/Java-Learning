package Recursion;

public class quicksort {

    public static void quickSort(int arr[], int low, int high){
        if(low <high){
            int pivot = partion(arr, low, high);
            //for small from pivot
            quickSort(arr, pivot+1, high);
            //for high from pivot
            quickSort(arr, low, pivot-1);
        }
    }

    public static int partion(int arr[], int low, int high){  
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot ){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot 
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
