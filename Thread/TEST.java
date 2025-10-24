package Thread;  
// Thread life cycle
public class TEST extends  Thread{
    @Override
    public void run(){
        System.out.println("RUNNNNN");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]) throws InterruptedException{
       /* World world=new World();
        world.run();


        for(int i=0;i<100;i++){
            System.out.println("TEST");
        }

        World world=new World();
        Thread t1=new Thread(world);
        t1.start();

        for(int i=0;i<100;i++){
            System.out.println("Main");
        }

        TEST test=new TEST();
        System.out.println(test.getState());
        test.start();
        System.out.println(test.getState());
        Thread.sleep(100);
        System.out.println(test.getState());
        test.join();
        System.out.println(test.getState());
*/


       Counter counter=new Counter();
       MyThread t1=new MyThread(counter);
       MyThread t2=new MyThread(counter);

       t1.start();
       t2.start();

       try {
           t1.join();
           t2.join();
       }catch (Exception e){

       }
        System.out.println(counter.getCount());

    }
}
