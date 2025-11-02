package GenralPracties;

public class SwapTwoNumber {

    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("Number before swaping"+x+""+y);

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("Number after swaping "+x+" "+y);


    }
}
