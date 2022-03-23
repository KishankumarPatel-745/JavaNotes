package com.multiThreading.scjp;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Kishan "+i);
        }
    }
}
public class Java02 {
    public static void main(String[] args) {
        /*
        What is a Thread?
        a separate independent flow of execution is called a Thread.
        
        Defining a Thread?
        We can define a thread in the following two ways.
        1,
        By extending Thread Class.
        2,
        By implementing Runnable interface.

        1.By extending Thread class.

        Define a thread..
        class MyThread extends Thread{
        @Override
        public void run() { 
        for (int i = 0; i < 20; i++) {
            System.out.println("Kishan "+i);
        }
    }
 }
    In run method, we can specify a job of a thread.

    class ThreadDemo{
        main(){
            MyThread t=new MyThread();
            //Thread Instantiation
            t.start();
            //Starting of a Thread.
            for(int i=0;i<10;i++){
                SOP("Main Thread");
            }
        }
    }


    CASE01.
    Thread Scheduler.

    It is the part of JVM.
    It is responsible to schedule threads. Means if multiple threads are waiting to get the chance of execution.Then in which order Thread will be executed is decided by Thread Scheduler.

    We cannot expect exact algorithme followed by Thread Scheduler. It is varied from JVM to JVM. Hence we cannot expect Thread Execution order
    and Exact output.

    Hence whenever situation comes to multithreading there is no gaurantee for exact output.But we can provide several possible outputs.

    The following is various possible outcome of the multithreading code.
    eg.
    P-1
    Main Thread
    Main Thread
    --10 times.
    Child Thread.
    Child Thread.
    --10 times

    P-2
    Child Thread
    Child Thread
    Child Thread
    --10 times

    P-3
    Main Thread
    Child Thread
    Main Thread
    Child Thread
    -----
    -----

    P-4
    Child Thread
    Main Thread
    --10 times

    CASE02

    What is a different between t.start() and t.run()?

    In the case  of t.start() a new thread will be created,which is responsible for the execution of run method.
    But in the case of t.run(), a new thread won't be created and the run method will be executed just like a normal method call by main() thread.
    Hence in the above programm, if we replace t.start() with t.run() then the output is 

    child thread
    child thread
    --10 times
    Main thread
    Main thread
    --10 times

    This total output is produced by only main thread.

    CASE03
    Importance of thread class start method.

    Thread class start method is responsible to register the thread with thread scheduler.And all other mandatory activities.Hence without executing Thread class start method there is no chance of start a new thread in java.

    Due to this Thread class start method is considered as Heart of multiThreading.

    start(){
        1,Register this thread with Thread Scheduler
        2,Perform all other mandatory activities.
        3,Invoke run();
    }

    CASE04
    Overloading of run() method

    Overloading of run() is always possible but Thread class start method can invoke no-arg run method.

    The other overloaded method,we have to call explicitly like a normal method call.

    eg.
    class MyThread extends Thread{
        public void run(){
            SOP("No-arg run");
        }
        public void run(int i){
            SOP("Int-arg run");
        }
    }

    Overloaded method.

    class ThreadDemo{
        main(){
            MyThread t=new Thread();
            t.start();

        }
    }

    CASE05
    If we are not overriding run method, then thread class run method will be executed. Which has empty implementation.Hence we won't get any output.

    eg.
    class MyThread extends Thread{

    }
    class Test{
        main(){
            MyThread t= new Thread();
            t.start();
        }
    }
    No output

    It is highly recommoanded to override run method otherwise dont go for multi threading concept.

    CASE06
    Overriding of start method.

    IF we override start method then our start method will be executed just like a normal method call and new Thread won't be created.



    class MyThread extends Thread{
        public void start(){
            SOP("Start method");
        }
        public void run(){
            SOP("Run method");
        }
    }
    class Test{
        main(){
            MyThread t=new MyThread();
            t.start();
            SOP("Main Method");
        }
    }

    output 
    Start method
    Main Method

    Produced by only main thread.

    It is not recommaended to override start() otherwise don't go for multithreading Concept.

    class MyThread extends Thread{
        public void start(){
            super.start();
            SOP("Start Method");
        }
        public void run(){
            SOP("run method");
        }
    }
    class Test{
        main(String[] args){
            MyThread t=new Thread();
            t.start();
            SOP("Main thread");
        }
    }


    possible output

    run method
    start method
    main method

    start method
    main method
    run method

    start method 
    run method
    main method

    CASE08
    Thread life cycle.

    new/born(new MyThread())-->ready/runnable->running (if Thread Scheduler allocates processors)->Dead(If run() method completes).

    CASE09
    AFter starting a Thread,IF we are trying to restart the same Thread then we will get RTE saying IllegalThreadStateException.

    Thread t=new Thread();
    t.start();
    =======
    =======
    t.start();





        */
        //main thread create an thread object.
        MyThread t=new MyThread() ;
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main "+i);
        }
    }

}
