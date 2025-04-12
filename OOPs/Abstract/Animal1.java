package OOPs.Abstract;

import OOPs.Abstract.Animal.Horse;

abstract class Animal1 {
    public void eat(){
        System.out.println("Animal eats...");
    }
    abstract class Animal{
        abstract void walk();
        
    }

    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.eat();
    }
}
