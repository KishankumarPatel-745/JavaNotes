package com.multiThreading.scjp;

class MyTh02 extends Thread{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            System.out.println(e);
    }
    for (int i = 0; i < 10; i++) {
        System.out.println("Child Thread after :- "+i);
        
    }

}
}
public class Java06 {
    public static void main(String[] args) throws InterruptedException {
        /*
        CASE02 
        Waiting of child thread untill completing main() Thread.
        */
        // MyTh02.mt=Thread.currentThread();
        // MyTh02 t=new MyTh02();
        // t.start();
        // System.out.println("DEADLOCK...");
        // t.join();//CASE03
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Main First :- "+i);
        //     Thread.sleep(2000);
            
        // }

        //Interrupt example

        MyTh03 t001=new MyTh03();
        t001.start();
        t001.interrupt();//line-1
        System.out.println("End of Main...");
    }
    /*
    In the above example,Child thread calls join on main thread object,Hence child thread has to wait until completing main thread.

    In this case,output is 
    Main First :- 0
    Main First :- 1
    Main First :- 2
    Main First :- 3
    Main First :- 4
    Main First :- 5
    Main First :- 6
    Main First :- 7
    Main First :- 8
    Main First :- 9
    Child Thread after :- 0
    Child Thread after :- 1
    Child Thread after :- 2
    Child Thread after :- 3
    Child Thread after :- 4
    Child Thread after :- 5
    Child Thread after :- 6
    Child Thread after :- 7
    Child Thread after :- 8
    Child Thread after :- 9


    CASE03
    If a main() Thread calls join method on child thread object and child thread calls join() on main thread object then both thread will wait forever and the programm will be stucked.This is a DEADLOCK.

    CASE04.
    If a thread calls join method on the same thread object itself then the programm will be stucked.This is a DEADLOCK.
    In this case, thread has to wait infinite amount of time.

    eg
    class Test{
        main() throws IE{
            Thread.currentThread().join();
        }
    }


    sleep() method.
    If a Thread don't want to perform any operation for a particuler amount of time then we should go for sleep() method.

    public static native void sleep(long millisecond) throws InterruptedException;

    public static void sleep(long millisecond,int nenosecond) throws InterruptedExcetion

    Every sleep method throws InterruptedException,which is checked exception hence whenever we are using sleep method compulsory we should handle interruptedException either by try-catch and throws exception otherwise we will get CTE.

    eg.
    class SlideRotator{
        main() Throws IE{
            for(int i=1;i<=10;i++){
                SOP("Slide-"+i);
                Thread.Sleep(5000);
            }
        }
    }

    How a thread can interrupt another Thread?

    A Thread can interrupt a sleeping thread or waiting thread by using interrupt method of Thread class.

    public void interrupt();

    eg.interrupt code in current file.

    If we comment line-1 then main thread won't interrupt child thread. In this case,child thread will execute for loop 10 times.

    If we are not commenting line-1 then main thread interrupt child thread.
    In this case the output is 
    End of Main...
    Child Thread I am Lazy:- 0
    I got interrupted by other Threadjava.lang.InterruptedException: sleep interrupted

    **NOTE.

    Whenever we are calling interrupt() method if the target thread not in sleeping or waiting state then there is no impact of interrupt call immediately.
    Interrupt call will be waited until target thread entered into sleeping or waiting state.

    If the target thread entered into sleep or waiting state, then immediately interrupt call will interrupt the target thread.

    If the target Thread never entered into sleeping or waiting state in its life time then there is no impact of interrupt call.
    This is the only case where interrupt call will be wasted.

    eg.
    class MyThread extends Thread{
        public void run(){
            for(int i=0;i<=10000;i++){
                SOP("I am lazy Thread"+i);
            }
            SOP("I am entering into sleeping state.");
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                SOP("I got Interrupted");
            }
        }
    }
    class ThreadSleepDemo01{
        main(){
            MyThread t=new Thread();
            t.start();
            t.interrupt();
            SOP("End of the main");
        }
    }

    In the above example, interrupt call waited until child thread completes for loop 10000 times.

    COMPARISON TABLE OF yield(),join() and sleep() methods.

    Purpose:

    yield: If a Thread want to pause its execution to give the chance for remaining threads of same priority,then we should go for yield method.

    join: If a thread want to wait until completing some other thread then we should call for join().

    sleep: If a thread don't want to perfoem any operation for a particular ammount of time then we should go for sleep().

    Refer image for more comparison.
    


    */
}

class MyTh03 extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread I am Lazy:- "+i);
                Thread.sleep(2000);

            }
        }catch(InterruptedException e){
            System.out.println("I got interrupted by other Thread"+e);
        }
    }
}

