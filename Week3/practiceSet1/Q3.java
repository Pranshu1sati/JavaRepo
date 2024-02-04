class Base1{
    public Base1() {
        System.out.println("I am a constructor");
    }
    public Base1(int x){
        System.out.println("I am an overloaded constructor with value of x: "+x);
    }
}

class Derived1 extends Base1{
    public Derived1(){
        // to choose between no-args constructor or args-constructor of the base class
        super(5);
        System.out.println("I am a derived class constructor");
    }
    public Derived1(int x, int y){
        super(x);
        System.out.println("I am an derived class overloaded constructor with value of y: "+y);
    }
}
class ChildOfDerived1 extends Derived1{
    public ChildOfDerived1(){
        System.out.println("I am a child of derived constructor");
    }
    public ChildOfDerived1(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overload child of derived class constructor with \nvalue of z: "+z);
    }
}

public class Q3 {
    public static void main(String[] args) {
        // call for constructur of derived class

        Derived1  d = new Derived1(16,9);
// call for constructur of grand child class class
        
        ChildOfDerived1 cd = new ChildOfDerived1(24,45,7);
        // if you make constructor of derived class it will still run the base class
        // constructor first then the derived class constructor
    }
}
