package OOPS;

interface A{
    void show();
}
interface B{
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println("C's implementation of show");
    }
}
public class MultipleInheri{
    public static void main(String[] args) {
        C c=new C();
        c.show();
    }
}
