package Thread;

public class World implements Runnable{


    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("RUNNNN");
        }
    }

    /*@Override
    public void run(){

        for(int i=0;i<100;i++){
            System.out.println("RUN");

        }
    }*/


}
