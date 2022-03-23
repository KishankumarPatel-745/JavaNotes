package com.multiThreading.scjp;

class MyThread01 extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread JOb");
    }
}
public class Java04 {
    public static void main(String[] args) {
        /*
        Thread Priorites

        Every Thread in java has some priority it may be default priority generated by JVM.
        Or Customized priority provided by programmer.

        The Valid range of Thread priority is 1-10.
        Where 1 is MIN-PRIORITY
        10 is MAX_PRIORITY.

        Thread class has defined the following constants to represent some standard priorities.

        Thread.MIN_PRIORITY :- 1
        Thread.NORM_PRIORITY :- 5
        Thread.MAX_PRIORITY :- 10

        Thread Scheduler will use priorities while allocating processer.
        The Thread which is having highest priority will get the chance first.

        If two threads having same priority then we cannot expect exact execution order.It depends on Thread Scheduler.

        Thread class define the following methods to get and set priority of a Thread.

        Public final int getPriority();

        public final void setPriority(int p);
        Allowed values range for p is 1 to 10.
        Otherwise RE: IllegalArgumentException.

        t.setPriority(7);
        t.setPriority(17);
        RE: IllegalArgumentException.

        Default Priority.
        The default priority only for the main thread is 5.But for all remaining thread,default priority will be inherited from parent to child.Means whatever priority parent thread has the same priority will be there for the child thread.

        eg.
        class MyThread01 extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread JOb");
    }
}

class Test{
    main(){
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9); line 1
        MyThread01 t=new MyThread01();
        t.start();
        System.out.println(t.getPriority());

    }
}
        
If we comment line01 then child thread priority will became 5.

MyThread--> Thread(Parent class)
MyThread--> Main thread(Parent Thread)


eg
    class MyThread extends Thread{
        public void run(){
            for (int i=0;i<10;i++){
                SOP("Child Thread");
            }
        }
    }
    class ThreadPriorityDemo{
        main(){
            MyThread t=new MyThread();
            t.setPriority(10); line 1
            t.start();
            for(int i=0;i<10;i++){
                SOP("Main Thread");
            }
        }
    }
    If we comment line 1 then both main and child thread hava the same priority 5 hence we cannot expect execution order and exact output.

    If we are not commenting line 1 then main thread has a priority 5 and child thread has a priority 10.

    Hence child thread will get the chance first following by main thread. In this case output is 
    Child Thread 
    Child Thread 
    --10 times
    Main Thread
    Main Thread
    --10 times


    NOTE:
    Some platform won't provide proper support for thread priorities.


        */

        System.out.println(Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(9);
        MyThread01 t=new MyThread01();
        t.setPriority(9);
        t.start();
        System.out.println(t.getPriority());
        System.out.println("Main Thread");
    }

}