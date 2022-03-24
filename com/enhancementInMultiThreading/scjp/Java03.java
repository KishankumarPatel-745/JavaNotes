package com.enhancementInMultiThreading.scjp;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Display{
    ReentrantLock l=new ReentrantLock();
    void wish(String name){
        l.lock(); //line01
        for (int i = 0; i < 4; i++) {
            System.out.print("Good Morning:- ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                
            }
            System.out.println(name);
            
        }
       
        l.unlock();//line02
    }
}
class T0 extends Thread{
    String name;
    Display d;

    T0(Display d,String name){
        this.d=d;
        this.name=name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}
public class Java03 {
    public static void main(String[] args) {
        /*
        ReentrantLock(C)
        ----------------

        It is the implementation class of lock(I) interface.

        And it is the direct child class of Object(C).
        
        Reentrant means a thread can acquire some lock again and again ,multiple time without any issue.

        Internally,reentrantlock increment threads personal count, whenever we are calling lock method and decrement count value whenever thread calls unlock method. and the lock will be released whenever count reaches 0.

        constructor.

        1,
        ReentrantLock l=new ReentrantLock();

        create an instance of ReentrantLock.

        2,
        ReentrantLock l=new ReentrantLock(boolean fairness);

        Creates ReentrantLock with the given fairness policy.

        If the fairness is true,then longest waiting thread can acquire the lock if it is available.
        Means it is follow first come first serve policy.
        
        If fairness is false then which waiting thread will get the chance we cannot expect.

        The default value for fairness is false.

        Which of the following declaretion are equal?

        ReentrantLock l=new ReentrantLock();

        ReentrantLock l=new ReentrantLock(true);

        ReentrantLock l=new ReentrantLock(false);

        all the above.

        1 and 3 are equal.


        Important methods of ReentrantLock.

        1,
        void lock();

        2,
        boolean tryLock();

        3,
        boolean tryLock(long l,TimeUnit t);

        4,
        void lockInterruptibly();

        5,
        void unlock();

        all above are from lock(I) interface.

        6,

        int getHoldCount();

        return number of hold on this lock by current thread.

        7,
        boolean isHeldByCurrentThread();

        return true if lock is hold by current thread.

        8,
        int getQueueLength();
        return number of Threads waiting for the lock.

        Collection getQueuedThreads();

        It returns a collection of threads,which are waiting to get the lock.

        9,
        boolean hasQueuedThreads();

        Return true if any thread waiting to get the lock.

        10,
        boolean isLocked();

        returns true if the lock is acquired by some thread.


        11,
        boolean isFair();
        return true if the fairness is set with true value.

        12.
        Thread getOwner();
        return the thread which acquired the lock.


        if we comment line1 and line2 then the thread will be executed simantaneously and we will get irregular output.

        If we are not commenting line1 and line2 then the thread will be executed one by one and we will get regular output.

        Demo programm for try lock method.




        */

        // ReentrantLock r1=new ReentrantLock();
        // r1.lock();
        // r1.lock();
        // System.out.println(r1.isLocked());//true

        // System.out.println(r1.isHeldByCurrentThread());//true

        // System.out.println(r1.getQueueLength());//0

        // r1.unlock();

        // System.out.println(r1.getHoldCount());//1

        // System.out.println(r1.isLocked());//true

        // r1.unlock();

        // System.out.println(r1.isLocked()); //false

        // System.out.println(r1.isFair());//false


        // Display d=new Display();
        // T0 t=new T0(d,"kishan");
        // T0 t1=new T0(d,"Jinal");
        // t.start();
        // t1.start();
        TrywithTime t1=new TrywithTime("First Thread");
        TrywithTime t2=new TrywithTime("Second Thread");
        t1.start();
        t2.start();

    }
}

class TrywithTime extends Thread{
    static ReentrantLock l=new ReentrantLock();
    TrywithTime(String name){
        super(name);
    }
    public void run() {
       
        do {
            try {
                if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+" Got the lock");
                    Thread.sleep(30000);
                    System.out.println(Thread.currentThread().getName()+" releases the lock");
                    l.unlock();
                    break;

                }else{

                    System.out.println(Thread.currentThread().getName()+" Unable to get the lock will try again in 5s");
                }
                
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
            
        } while (true);
    }
}
/*

output>
First Thread Got the lock
Second Thread Unable to get the lock will try again in 5s
Second Thread Unable to get the lock will try again in 5s
Second Thread Unable to get the lock will try again in 5s
Second Thread Unable to get the lock will try again in 5s
Second Thread Unable to get the lock will try again in 5s
First Thread releases the lock
Second Thread Got the lock
Second Thread releases the lock


*/