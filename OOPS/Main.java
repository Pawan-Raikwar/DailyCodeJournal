package OOPS;

class Outer{
    static class Inner{
         void display(){
             System.out.println("Hello from static nested class");
         }
    }
}
public class Main {
    public static void main(String[] args) {

        Outer.Inner obj=new Outer.Inner();
        obj.display();

    }
}
