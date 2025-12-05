package OOPS;


abstract class Vehicle{
    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }
}

// subclass provides implementation of abstract method

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is started with key");
    }
}


public class Abstraction {
    public static void main(String[] args) {

        Vehicle vehicle=new Car();
        vehicle.start();
        vehicle.stop();
    }
}
/*This example demonstrates abstraction and polymorphism:
  the abstract class hides the start method’s implementation,
  Car provides the concrete implementation, and we can use the
  parent reference to call both abstract and regular methods.”*/