package OOPS;

public class multiple_Inheritance {
    public static void main(String[] args) {
        Queen queen=new Queen();
        queen.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , dowm ,left,diagonal,");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Down , left ,right");
    }
}
