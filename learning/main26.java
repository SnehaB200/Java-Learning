public class main26 {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //selection sorting

        int ary[] = { 7,3,8,1,2};
        // int ary[] = { 5,2,8,3,1,6};
        
        for(int i=0; i<ary.length-1; i++){
            int small = i;
            for(int j=0; j<ary.length; j++){
                if(ary[small]>ary[j]){
                    small = j;
                }
                int temp = ary[small];
                ary[small] = ary[i];
                ary[i] = temp;
            }
            
        }
        printArray(ary);
       //Time complexity is O(n^2)
    }
}
