public class main23 {
    public static void main(String[] args) {
        //string builder
        StringBuilder sb = new StringBuilder("Sneha");
        System.out.println(sb);

        //printing the charcter at index 0
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(3));

        //to insert character
        sb.insert(5, "B");
        System.out.println(sb);

        //delete
        sb.delete(3, 4);
        System.out.println(sb);

        //append - joining at the end
        sb.append(" Behera");
        System.out.println(sb);
    }
}
