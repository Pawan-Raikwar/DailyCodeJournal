package Thread1;


class MyThread extends Thread{

    public void run(){
        System.out.println("This is run method");
    }
}
public class createThread {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
