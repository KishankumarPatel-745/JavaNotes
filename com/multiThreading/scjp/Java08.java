package com.multiThreading.scjp;

class Display01{
    synchronized void displayNumber(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Number :- "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
    synchronized void displayChar(){
        for (int i = 65; i < 75; i++) {
            System.out.println("Char :- "+(char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }

    }
}
class Th001 extends Thread{
    Display01 t;
    Th001(Display01 d){
        t=d;
    }
    @Override
    public void run() {
        t.displayNumber();
    }

    
}
class Th002 extends Thread{
    Display01 t;
    Th002(Display01 d){
        t=d;
    }
    @Override
    public void run() {
        t.displayChar();
    }
}

public class Java08 {
    public static void main(String[] args) {
        /*
        CASE Study.

        main(){
            Display d1=new Display();
            Display d2=new Display();
            MyThread t1=new MyThread(d1,"Kishan");
            MyThread t2=new MyThread(d2,"Jinal");
            t1.start();
            t2.start();
        }

        d1.wish("Kishan");
        d2.wish("Jinal");

        Even through wish method is synchronized we will get irregular output.

        Because threads are operating on different Java object.

        Conclusion
        If multiple threads are operating on same java object then synchronization is required.
        If multiple threads are operating on multiple java object then synchronization is not required.

        class level lock
        Every class in java has a unique lock,which is nothing but class level lock.

        If a thread wants to execute static synchronized method, Then Thread required class level lock.
        Once class got class level lock then it is allowed to execute any static synchronized method of that class.
        Once method execution completes automatically thread releases a lock.


        While a thread executing static synchronized method,The remaining threads are not allowed to execute any synchronized method of that class simantaneously, But remaining threads are allowed to execute the following method simantaneously.

        normal static method,
        synchronized instance method
        and normal instance methods.

        class x{
            static synchronized m1();
            static synchronized m2();
            static m3();
            synchronized m4();
            m5();
        }


        X->t1(c(X)) can call m1()

        t2 want to call m1 then t2 is in waiting state.

        t3 want to call m2() then t3 is in waiting state hence t1 had acquire the class-level lock.

        t4 wants to call m3. called successfully.

        t5 wants to call m4.called successfully.

        t6 wants to call m5.called successfully.


        eg.
         on t object ,two different threads are trying to call two different methods.
        
        */

        Display01 t=new Display01();
        Th001 t1=new Th001(t);
        Th002 t2=new Th002(t);
        t1.start();
        t2.start();

    }
}
