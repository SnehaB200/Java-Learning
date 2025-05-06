public class main22 {
    public static void main(String[] args) {
        //string comparing
        String one = "Snehangi";
        String two = "Snehangi";

        //null (same)
        //+ve (greater)
        //-ve (less)

        if(one.compareTo(two) == 0){
            System.out.println("Equal String");
        }else{
            System.out.println("Not Equal");
        }
    }
}
