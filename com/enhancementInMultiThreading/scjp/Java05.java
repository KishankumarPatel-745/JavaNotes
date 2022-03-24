package com.enhancementInMultiThreading.scjp;

// import java.util.concurrent.locks.ReentrantLock; 

class Customer01 extends Thread{

    static Integer custID=0;
    // static ReentrantLock l=new ReentrantLock();
    private static ThreadLocal tl=new ThreadLocal(){
        protected Object initialValue() {
            return ++custID;
        };

    };


    @Override
    public void run() {
        // l.lock();
        System.out.println(Thread.currentThread().getName()+" is executing with the customer ID:-"+tl.get());
        // l.unlock();
    }
}
public class Java05 {
    public static void main(String[] args) {
        /*
        Thread Local class provides thread local variables thread local class maintains value per thread basis.

        Each threadLocal object maintains a separate values like userID,trancastionID.

        Foreach thread that accesses that TL object.

        Thread can access its local value, can manipulate its valus,can remove its value.
        
        In every part of the code which is executed by the thread, we can access its local variable.

        Consider a servlet,which invokes some business methods. we have a requirement to generate unique transactionID for each and every request and we have to pass this transactionID to business Methods for this requirement we can use threadLocal to maintain a separate transactionID for every request means for every Thread.

        NOTE.
        ThreadLocal Class introduced in 1.2 version and enhanced in 1.5V.

        ThreadLocal can be associated with Thread Scope.

        Total code,which is executed by Thread has access to the correspondin ThreadLocal Variable.

        A thread can access its own local variable and cannot access other thread's local variable.

        Once thread entered into dead state,all its local variables are available/eligible for Garbage Collection.

        Constructor.

        ThreadLocal tl=new ThreadLocal();

        create a thread local variable.

        Methods 

        1,
        Object get();

        return the value of Thread local variable associated with current thread.

        2,
        Object initialValue();

        return initial value of Threadlocal value associated with current Thread.

        The default implementation of this method return null.

        To customize our own initial value, we have to override this method.

        3,
        void set(Object newValues);

        To set a new value.

        4,
        void remove();

        to remove the value of threadlocal variable associated with current Thread.

        it is newly added method in 1.5 version.
        after removal if we are trying to access it will be reinitialized once again by invoking its initialValue method.

        eg.

        main(){
            ThreadLocal tl=new ThreadLocal();

            SOP(tl.get());//null
            tl.set("Kishan");
            SOP(tl.get());//Kishan
            tl.remove();
            SOP(tl.get());//null
        }

        OVERRIDing of Initial value method.

        main(){
            ThreadLocal tl=new ThreadLocal(){
                public Object initialValue(){
                    return "abc";
                }
            };

            SOP(tl.get());//abc
            tl.set("Kishan");
            SOP(tl.get());//Kishan
            tl.remove();
            SOP(tl.get());//abc
        }


        
        */
        Customer01 c1=new Customer01();
        Customer01 c2=new Customer01();
        Customer01 c3=new Customer01();
        Customer01 c4=new Customer01();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        ParentThread p=new ParentThread();
        p.start();

    }

    /*
    In above programm,for every customer thread a separate customerID will be maintained by threadLocal object.


    ThreadLocal VS Inheritance.

    parent threads ThreadLocal Variable by default not availble to the child Thread.

    If we want to make parent Thread's ThreadLocal variable value available to the child thread then we should go for InheritableThreadLocal Class.

    By default,child Thread value is exactly same as parent thread's value but we can provide customized values for child thread by overriding childValue() methods.

    Constructor.

    InheritableThreadLocal tl=new InheritableThreadLocal();

    methods.

    InheritableThreadLocal is a child class of Threadlocal and hence all method present in ThreadLocal by default availble to InheritableThreadlocal.

    In addition to this methods,
    it contains only one method.

    public Object childValue(Object parentValue);

    



    */
}

class ParentThread extends Thread{
    public static InheritableThreadLocal il=new InheritableThreadLocal(){
        protected Object childValue(Object parentValue) {
            return "CC";
            
        };
    };
    @Override
    public void run() {
        il.set("PP");
        System.out.println("Parent ThreadLocal Value:- "+il.get());
        ChildThread c=new ChildThread();
        c.start();
    }


    
}
class ChildThread extends Thread{

    @Override
    public void run() {
        System.out.println("Child ThreadLocal Value:- "+ParentThread.il.get());
    }
}

/*
In the above programm, if we replace InheritableThreadLocal to ThreadLocal and if we are not overriding childvalue() then the output is 
Parent Thread value:PP
Child Thread value:null

in above programm, if we are maintaining inheritanbleThreadLocal and if we are not overriding method,then output is 
Parent Thread value:PP
Child Thread value: PP
*/