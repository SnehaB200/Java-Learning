package Recursion;

public class mergesort {
    public static void conquer(int arr[], int sind, int midInd, int eInd){
        int merged[] = new int[eInd - sind + 1];
        int idx1 = sind;
        int idx2 = midInd + 1;
        int x = 0;

        while(idx1 <= midInd && idx2 <= eInd){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= midInd){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= eInd){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j =sind; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int sind, int eind){
        if(sind >= eind){
            return;
        }
        int midInd = sind + (eind -sind)/2;
        divide(arr, sind, midInd);
        divide(arr, midInd+1, eind);

        conquer(arr, sind, midInd, eind);
    }
 
    
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n-1);
        
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
