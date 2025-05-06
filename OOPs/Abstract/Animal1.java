package OOPs.Abstract;

abstract class Animal1 {
    public void eat(){
        System.out.println("Animal eats...");
    }
    abstract class Animal{
        abstract void walk();
        
    }
    static class Dog extends Animal1 {
        // Optionally override methods if needed
    }

    public static void main(String[] args) {
        Animal1 animal = new Dog();
        animal.eat();
    }
}
