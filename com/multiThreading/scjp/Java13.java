package com.multiThreading.scjp;

class MyThread9 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread:"+i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
}


public class Java13 {
    public static void main(String[] args) {
        /*
        Daemon Thread.
        The threads which are executing in the backgrounda are called daemon thread.
        eg.
        1,Garbage Collector.
        2,Signal Dispatcher
        3,Attach Listener.

        The main Objective of daemon thread is to provide support for non-daemon threads(main thread).

        eg.
        If main threads run with low memory then JVM runs GC to destroy useless objects, so that number of bytes of free memory will be improved.
        With this free memory, main thread can continue its execution.

        Usually daemon thread having low priority but based on our requirement daemon thread can run with high priority also.

        we can find/check daemon nature of a thread by using isDaemon() method of Thread class.

        public boolean isDaemon();

        we can change daemon nature of a thread by using setDaemon() method.

        public void setDaemon(boolean b);

        But changing daemon nature is possible before starting of a thread only.
        After starting a thread if we are trying to change daemon nature then we will get RTE saying IllegalThreadStateException.

        Default Nature of a Thread.

        By default main() Thread is always non-daemon and for all remaining threads daemon nature will be inherited from parent to child.
        Means if the parent thread is daemon then automatically child thread is also daemon.

        And if the parent is non-daemon then automatically child thread is also non-daemon.

        NOTE:
        It is impossible to change daemon nature of main thread.
        Because it is already started by JVM at the beginning.

        eg.
        class MyThread extends Thread{

        }
        class Test{
            public static void main(String[] args){
                SOP(Thread.currentThread().isDaemon());//false

                Thread.currentThread().setDaemon(true);
                RTE: IllegalThreadStateException

                MyThread t= new MyThread();//non-daemon

                Sop(t.isDaemon());
                false

                t.setDaemon(true);
                SOP(t.isDaemon());
                //true

            }
        }

        Whenever last non-daemon thread terminates,automatically all daemon threads will be terminated irrespective of there position.

        eg2
        class MyThread extends Thread{
            public void run(){
                for (int i=0;i<10;i++){
                    SOP("Child Thread");
                    try{
                        Thread.sleep(2000);
                    }catch(IE e){

                    }
                }
            }
        }
        class DaemonThreadDemo{
            main(){
                MyThread t=new MyThread();
                t.setDaemon(true);
                t.start();
                SOP("End of Main Thread.");
            }
        }

        If we are commenting line01 both main and child thread are non-daemon and hence both threads will be executed untill there completion if we are not commenting line 1 then main thread is non-daemon and child thread is daemon,Hence whenever main thread terminates automatically child thread will be terminated.In this case,The output is..

        End of main thread
        child thread

        or

        end of main thread

        or 

        child thread 
        end of main thread
        



        */
        MyThread9 t=new MyThread9();
        t.setDaemon(true);//line 1
        t.start();
        System.out.println("End of Main Thread.");
    }
}
