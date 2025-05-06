package OOPs.Abstract;

//Encapsulation is to combine the data and the functions that operate on that data into a single unit.

//abstract class is hiding the implementation of details and showing only the essential features of the object. 

//if the class is abstract then it show a error after running

public class Animal{
    public void walk(){
        
    }

    public void walks(){
        System.out.println("Animal walks on 4 legs");
    }
    class Horse extends Animal{
        public void walks(){
            System.out.println("Horse walks on 4 legs");
        }
    }
    class Chicken extends Animal{
        public void walk(){
            System.out.println("Dog walks on 2 legs");
        }
    }

    public static void main(String[] args) {
        //here no error found in code but error found in output
        Animal animal = new Animal();
        animal.walk();
        
        Animal horse = new Animal();
        horse.walks();
    }
}