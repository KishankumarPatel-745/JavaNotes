package com.multiThreading.scjp;

class MyTh01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Seetha Thread:- "+i);
            try {
                Thread.sleep(2000);
                
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
}
public class Java05 {
    public static void main(String[] args) throws InterruptedException{
        /*
        Prevent Thread Execution.

        1,yield()
        2,join()
        3,sleep()

        we can prevent a thread execution by using the following methods.

        1,yield()
        2,join()
        3,sleep()

        1,yield() method.
        yield() method causes to pause current executing thread to give the change for waiting thread of same priority.

        If there is no waiting thread or all waiting thread have low priority then same thread can continue its execution.
         
        If multiple threads are waiting with the same priorities then which waiting thread will get the chance we cannot expect.It depand on thread scheduler.

        The Thread,which is yielded,when it will get the chance once again. It depands on Thread Scheduler and we cannot expect exactly.

        public static native void yield();

        eg.
        class MyThread extends Thread{
            public void run(){
                for (int i=0;i<20;i++){
                    SOP("Child Thread");
                    Thread.yield(); line 01
                }
            }
        }
        class ThreadYieldDemo{
            main(){
                MyThread t=new MyThread();
                t.start();
                for (int i=0;i<10;i++){
                    SOP("Main Thread");
                }
            }
        }

        In above programm, if we are commenting line 1,then both thread will be executed simantanouesly and we cannot expect which thread will complete first.

        If we are not commenting line 1 then child thread always calls yield(), becauseof the main thread get chance more number of time. and the chance of completing main thread first is high.

        NOTE:
        Some platforms won't provide proper support for yield().

        join() method..

        If a thread wants to wait until completing some other thread then we should go for join() method.
        eg.
        For example, if a thread t1 wants to wait until completing t2 then t1 has to call t2.join().

        if t1 execute t2.join() then immediately t1 entered into waiting state until t2 completes.

        Once t2 completes then t1 can continue its execution.

        example.

        t1(Venue fixing activity).

        t2(wedding card printing).
        t1.join();

        t3(wedding cards distribution).
        t3.join();

        wedding card printing thread t2 has to wait untill venue fixing thread completion.Hence t2 has to call t1.join().

        Wedding card destribution thread t3 has to wait untill wedding cards printing Thread (t2) completion hense t3 has to call t2.join().

        public final void join() throws InterruptedException;

        public final void join(long miliseconds) throws InterruptedException;

        public final void join(long miliseconds,int nenoseconds) throws InterruptedException;

        Note:
        Every join method interuptedExeption which is checked exception hence compulsory we should handle IE exception by using try-catch or throws keyword otherwise we will get CTE.


        eg.













        */

        // MyTh01 t=new MyTh01();
        // t.start();
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Main Thread :- "+i);
            
        // }
        MyTh01 t=new MyTh01();
        t.start();
        t.join(10000);//cases line-1

        for (int i = 0; i < 10; i++) {
            System.out.println("Rama Thread:- "+i);
            
        }
        /*
         case01
         waiting of main thread untill completing child thread.(no time mentioned in join() method).

         If we comment line-1 then both main and child thread will be executed simantaneously and we cannot expect execute output.
         If we are not commenting line-1 then main thread calls join method on child thread object hence main() thread will wait untill completing child thread.In this case the output is

         seetha thread
         seetha thread
         --10 times
         Rama thread
         Rama thread
         --10 times.


        */
    }
    
}
