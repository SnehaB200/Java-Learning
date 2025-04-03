package OOPs;

public class Pen {
    String color;
    String type; //ballpoint & gel
     
    public void write(){
        System.out.println("Write Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.color = "Blue";
        pen1.printColor();
        pen1.write();
        pen2.color = "Red";
        pen2.printColor();
    }

}
