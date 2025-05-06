package OOPs.Inheritance;

//to inherit properties & method from another class

class shape{
    //single level 

    public void area(){
        System.out.println("Display area");
    }

    //shape must be as same as class name
    class Triangle extends shape {
        public void area(int l, int h){
            System.out.println(l/2*l*h);
        }
    }

    //multi level inheritance

    class EquilateralTri extends Triangle{
        public void area(int l, int h){
            System.out.println(l/2*l*h);
        }
    }

    //hierachial imheritance

    class circle extends shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }

    //hybrid imheritance
    
}