public class main15 {
    public static void main(String[] args) {
        //break and continue
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i>5) {
                break;
            }
        }
        //if you want to skip any number but still want to cotinue
        int j = 0;
        while(true){
            if(j ==3){
                j = j+1;
                continue;
            }
            System.out.println(j);
            j++;
            if (j>5) {
                break;
            }
        }
    }
}
