package OOPs.Polymorphism; 
//polymorphism
//ability of message to be displayed in more than one form


public class Students {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " "+ age);
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Snehangi";
        student1.age = 21;
        student1.printInfo(student1.name);
        student1.printInfo(student1.age);
        student1.printInfo(student1.name, student1.age);
    }
}
