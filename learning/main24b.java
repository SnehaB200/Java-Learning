public class main24b {
    public static void main(String[] args) {
        //bit manipulation

        //set bit operator OR
        int n = 3;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
    }
}
