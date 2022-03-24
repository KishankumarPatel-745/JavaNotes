package com.enhancementInMultiThreading.scjp;

/**
 * Java01
 */
public class Java01 {

    public static void main(String[] args)
    throws InterruptedException {
        /*
        
        ThreadGroup.

        Based on functionality, we can group thread into a single unit which is nothing but ThreadGroup.
        Means ThreadGroup contains a group of Thread.

        In addition to Threads,ThreadGroup can also contain sub-thread groups.

        Main Advantages.

        The main advantage of maintaining thread in the form of ThreadGroup is we can perform common Operation very easily.

        Every Thread in Java belongs to some Group.
        Main Thread belongs to main Group.
        Every ThreadGroup in Java is a child group of system Group either directly or indirectly.
        hence system group acts as root for all ThreadGroup in java.

        SystemGroup contains several system level Threads.
        Like
        Finalizer

        Reference Handler

        Signal Dispatcher

        Attach Listener.

        Diagram attached..

        Code written in this file.


        ThreadGroup is a java class present in java.lang package.
        And it is direct child class of Object.


        Constructor.
        1,
        ThreadGroup g=new ThreadGroup(String groupName);

        eg.
        ThreadGroup g=new ThreadGroup("First Group");

        create a new ThreadGroup with the specified GroupName.

        The parent of this new Group is The ThreadGroup of currently executing Thread.

        2,
        ThreadGroup g=new ThreadGroup(ThreadGroup parentGroupReference,String newGroupName);

        Creates a new ThreadGroup with the Specified GroupName.

        The Parent of this new Thread Group is specified parent group.

        ThreadGroup g1=new ThreadGroup(g,"Second Group");

        eg.
        refer code

        system TG<--main TG<--First TG<--Second TG.


        Importance methods of ThreadGroup class.

        1,
        String getName();

        return name of the ThreadGroup.

        2,
        int getMaxPriority();

        return max priority of ThreadGroup.

        3,
        void setMaxPriority(int p);

        To set maximum priority of ThreadGroup.

        The default max priority is 10.

        Threads in ThreadGroup that already have higher priority won't be affected but newly added thread this max priority is applicable.

        eg.
        main(){
            ThreadGroup g1=new ThreadGroup("tg");
            Thread t1=new Thread(g1,"Thread1");//5
            Thread t2=new Thread(g1,"Thread2");//5
            g1.setMaxPriority(3);
            Thread t3=new Thread(g1,"Thread3");//3

            SOP(t1.getPriority());//5
            SOP(t2.getPriority());//5
            SOP(t3.getPriority());//3
        }


        4,
        ThreadGroup getParent();

        Return parent group of current Thread.

        5,
        void list();

        It print information about ThreadGroup to the console.

        6,
        int activeCount();

        return number of active threads present in the ThreadGroup.


        7,
        int activeGroupCount();

        It return number of active groups present in the currentThread Group.

        8,
        int enumerate(Thread[] t);

        To copy all active thread of this ThreadGroup into provided Thread Array.

        In this case,sub-thread group's threads are also considered.


        9,
        int enumerate(ThreadGroup[] t);

        To copy all active sub-thread groups into ThreadGroup array.

        10,
        boolean isDaemon();

        To check whether the ThreadGroup is daemon or not.

        11,
        void setDaemon(boolean b);

        To chance the daemon nature of the ThreadGroup.

        12,
        void interrupt()

        To interrupt all waiting or sleeping threads present in the ThreadGroup.

        13,
        void destroy();

        To destroy ThreadGroup and its sub-thread groups.






        












        

        */
        // System.out.println(Thread.currentThread().getThreadGroup().getName());
        // System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        // ThreadGroup g1=new ThreadGroup("First TG");

        // System.out.println(g1.getParent().getName());
        // //main


        // ThreadGroup g2=new ThreadGroup(g1,"Second TG");

        // System.out.println(g2.getParent().getName());
        // //First TG

        // ThreadGroup pg=new ThreadGroup("ParentGroup");

        // ThreadGroup cg=new ThreadGroup(pg,"ChildGroup");

        // MT001 t=new MT001(pg,"ChildThread01");

        // MT001 t1=new MT001(pg,"ChildThread02");

        // t.start();
        // t1.start();

        // System.out.println(pg.activeCount()); //2

        // System.out.println(pg.activeGroupCount()); //1

        // pg.list();

        // Thread.sleep(10000);

        // System.out.println(pg.activeCount()); //0

        // System.out.println(pg.activeGroupCount());//1

        // pg.list();
        
        /*
        ThreadGroups
         
        system<--main<--ParentGroup(ChildThread1,ChildThread2)<--ChildGroup



        Write a programm to Display all active therad names belongs to system group and its child groups.


        */
        ThreadGroup sys01=Thread.currentThread().getThreadGroup().getParent();
        Thread[] t=new Thread[sys01.activeCount()];
        sys01.enumerate(t);
        for (Thread t1 : t) {
            System.out.println(t1.getName()+"----"+t1.isDaemon());
            /*
            output

            Reference Handler----true
            Finalizer----true
            Signal Dispatcher----true
            Attach Listener----true
            main----false
            */
        }


    }
}

class MT001 extends Thread{
    MT001(ThreadGroup g,String name){
        super(g,name);
    }
    @Override
    public void run() {
        System.out.println("Child Thread..");
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException e) {
            
        }
    }
}
