public class main27{

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //insertion sorting

        int ary[] = { 7,3,8,1,2};
        // int ary[] = { 5,2,8,3,1,6};
        
        for(int i=1; i<ary.length; i++){
            int current = ary[i];
            int j = i-1;
            while(j>= 0 && current<ary[j]){
                ary[j+1] = ary[j];
                j--;
            }
            //placement
            ary[j+1] = current;
        }
        printArray(ary);
       //Time complexity is O(n^2)
    }
}