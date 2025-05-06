public class main24c {
    public static void main(String[] args){
        //bit manipulation

        //clear bit operator AND with NOT
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}
