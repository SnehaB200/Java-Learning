package OOPs;

public class student {
    String name;
    int age;

    //function
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    student(){
        System.out.println("Constructor called");
    }

    //parameter
    student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //copy construstor
    //create a copy of object and place it in another object 
    student(student student3){
        this.name = student3.name;
        this.age = student3.age;
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "Snehangi";
        student1.age = 21;
        student1.printInfo();

        student student2 = new student("Sneha", 21);
        student2.printInfo();

        student student3 = new student(student1);
        student3.printInfo();
    }
}
