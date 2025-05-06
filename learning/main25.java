public class main25 {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //bubble sorting

        // int ary[] = { 7,3,8,1,2};
        int ary[] = { 5,2,8,3,1,6};
        
        for(int i=0; i<ary.length-1; i++){
            for(int j=0; j<ary.length-1; j++){
                if(ary[j]>ary[j+1]){
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }
            }
        } printArray(ary);
       //Time complexity is O(n^2)
    }
}
