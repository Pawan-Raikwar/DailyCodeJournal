package GenralPracties;

public class OppsMethodOverloading {
    public void display(){
        System.out.println("No argument method");
    }
    public void display(String name){
        System.out.println("The name is: "+name);
    }

    public static void main(String[] args) {
        OppsMethodOverloading obj=new OppsMethodOverloading();
        obj.display();
        obj.display("Pawan Raikwar");
    }
}
