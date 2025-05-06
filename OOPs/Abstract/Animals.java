package OOPs.Abstract;

abstract class Animals{
    abstract void walk();
    Animals(){
        System.out.println("A new animal is creating...");
    }

    class Horse extends Animal{
        Horse(){
            System.out.println("A new horse is creating...");
        }
    }

    public static void main(String[] args) {
        
    }
}