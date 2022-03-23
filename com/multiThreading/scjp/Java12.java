package com.multiThreading.scjp;

class A{
    synchronized void d1(B b){
        System.out.println("Thread1 starts execution of d1 method");
        try {
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread1 is trying to call B's last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("A's class last method");
    }
}
class B{
    synchronized void d2(A a){
        System.out.println("Thread2 starts execution of d2 method");

        try {
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread2 trying to call A's last method");
        a.last();

    }
    synchronized void last(){
        System.out.println("B's class last method");
    }
}

class Deadlock extends Thread{
    A a=new A();
    B b=new B();
    void m1(){
        this.start();
        a.d1(b);//main got the a object lock
    }
    @Override
    public void run() {
        b.d2(a); //Thread-0 got the b class lock.

    }

}
public class Java12 {
    public static void main(String[] args) {
        /*
        Deadlock
        Deadlock VS Starvation

        If two threads are waiting for each-other forever is known as deadlock.
        Such type of infinite  waiting is called deadlock.

        synchronized keyword is the only reason for deadlock situation.Hence by using synchronized keyword,we have to take special care.There are no resolution techniques for deadlock but several preventation techniques are availble.

        In the above programm,if we remove atleast one synchronized keyword then the programm won't entered into deadlock.Hence synchronized keyword is the only reason for deadlock situation.Due to this while using synchronized keyword, we have to take special care.    

        DeadLock VS Starvation

        Long waiting of a thread,where waiting never ends is called deadlock.

        Whereas long waiting of a thread where waiting ends at certain point is called Starvation.
        eg.
        low priority thread has to wait untill completing all high priority threads.
        It maybe long waiting but ends at certain point,which is nothing but starvation.
        
        */
        Deadlock t=new Deadlock();
        t.m1();
    }
}
