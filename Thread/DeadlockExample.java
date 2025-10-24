package Thread;

class Pen{
    public synchronized  void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+"is using pen"+this+"and trying");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+"finished using pen"+this);
    }
}
class  Paper{
    public synchronized  void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+"is using paper"+this +"and trying");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+"finished using pen"+this);
    }
}

public class DeadlockExample {

    public static void main(String args[]){

    }
}
