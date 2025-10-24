package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance=100;
    private  final Lock lock=new ReentrantLock();

    public    void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS) ){

                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+"Processiong thread");
                        Thread.sleep(3000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+"Currcent trhead is completed");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    finally {
                        lock.unlock();
                    }

                }else{
                    System.out.println(Thread.currentThread().getName()+"Insufficient balance");
                }

            }else{
                System.out.println(Thread.currentThread().getName()+"Could not acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
