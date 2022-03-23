package com.multiThreading.scjp;

class Sum01 extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized(this){
            System.out.println("Child Threads start calculations..");//seq02
            for (int i = 0; i < 101; i++) {
                total +=i;
                // System.out.println(total);
                
            }
            System.out.println("Child thread trying to give notification");//seq03
            this.notify();

        }
    }
}
public class Java11 {
    public static void main(String[] args) throws InterruptedException
    {
        /*
        Inter Thread Communication.

        Producer-Consumer Problem.
        producer thread is responsible to produce item to the queue and consumer thread is responsible to consume items from the queue.

        If queue is empty then consumer thread will call wait() and entered into waiting state.

        AFter produceing items to the queue producer thread is responsible to call notify method then waiting consumer will get that notification and continue its execution with updated items.

        queue object.

        producer thread

        class ProduceThread{
            produce(){
                synchronized(q){
                    //Produce items to the queue.

                    q.notify();
                }
            }
        }

        Consumer Thread

        class ConsumerThread{
            consumer(){
                synchronized(q){
                    if (q is empty){
                        q.wait();
                    }else{
                        consume items from queue.
                    }
                }
            }
        }

        Difference between notify() and notifyAll().

        We can use notify() to give the notification for only one waiting thread.
        If multiple thread are waiting then only one thread will be notified and the remaining threads have to wait for further notifications.

        Which thread will be notified we cannot expect. It depends on JVM.

        We can use notifyAll to give the notification for all waiting thread of a particular object.
        Eventhrough multiple threads notified but execution will be performed one by one because threads required lock.And only one lock is availble.

        On which object, we are calling wait() Thread required the lock of that particular object.
        for example,if we are calling wait() on s1 then we have to get the lock of s1 object but not on s2 object.

        eg.
        Stack s1=new Stack();
        Stack s2=new Stack();

        synchronized(s1){
            --
            --
            s2.wait();
        }
        RTE:IllegalMoniterStateException

        synchronized(s1){
            --
            --
            s1.wait();

        }Valid
        


        
        */
        Sum01 t=new Sum01();
        // t.setPriority(10);
        t.start();

        synchronized(t){

            System.out.println("Main Thread trying to call wait() method ");//seq01
            t.wait(10000);//To remove the infinite waiting scenario.

            System.out.println("Main Thread got Notification");//seq04
            System.out.println("main:-"+t.total);//seq05
        }
        
    }
}
