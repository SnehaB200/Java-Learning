
public class main16 {
    public static void main(String[] args) {
        //to handle error
        //two keyword try & catch
        int[] marks = {90,91,92};
        System.out.println(marks[2]); //92
        System.out.println(marks[5]); //error

        //if there is an error no next line will execute if you want to continue the do try and catch keywords
        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            
        }
        System.out.println("snehangi");
    }
}
