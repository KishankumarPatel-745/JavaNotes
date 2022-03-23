package com.multiThreading.scjp;

public class Java10 {
    public static void main(String[] args) {
        /*
        Inter Thread communication.

        Two Threads can communicate with each-other by using wait()-notify()-notifyAll() methods.

        The Thread,which is expecting updation is responsible to call wait().Then immediately tht thread will entered into waiting state.

        The Thread,which is responsible to perform updation.After performing updation, it is responsible to call notify() method then waiting thread will get that notification and continue its execution with those updated items.

        wait-notify-notifyAll methods present in object class but not in thread class because Thread can call this methods on any java object.

        To call wait-notify-notifyAll methods on any object,Thread should be owner of that object.means Thread should has lock of that object.
        Means Thread should be inside synchronized area,Hence we can call wait-notify-notifyAll method only from synchronized area.
        Otherwise we will get RTE saying  IllegalMonitorStateException.

        If a thread calls wait method on any object. It immediately releases the lock of that particular object and entered into waiting state.

        If a Thread calls notify method on any object.It releases the lock of that object but may not immediately.
        Except wait-notify-notifyAll there is no other method where thread releases the lock.

        Method-->is it releases lock?

        yield() :- No
        join() :- No
        sleep() :- No
        wait() :- Yes
        notify() :- Yes
        notifyAll() :- Yes
        
        Que:
        Which of the following is valid?

        1, if a thread calls wait() immediately it will entered into waiting state without releasing any lock?
        Invalid.

        2,If a thread calls wait method it releases the lock of that object but may not immediately?
        Invalid

        3,If thread calls wait method on any object,It releases all locks acquired by that thread and immediately entered into waiting state.
        Invalid.

        4,If a thread calls wait method on any object.It immediately releases the lock of that particular object and entered into waiting state.
        Valid

        5,
        If a thread calls notify() on any object it immediatly releases the lock of that particular object.
        Invalid.
        
        6,
        If a thread calls notify() on any object, it releases the lock of that object but may not immediatly.
        Valid.

        wait() signatures

        public final void wait() throws InterruptedException;

        public final native void wait(long millisecond) throws InterruptedException;

        public final void wait(long millisecond,int nenosecond) throws InterruptedException
        ;
        
        notify() method.

        public final native void notify();

        notifyAll() method.

        public final native void notifyAll();

        NOTE
        Every wait() throws InterruptedException, which is checkde exception hence whenever we are using wait method,compulsory we should handle this InterruptedException either by try-catch or by throws keyword.Otherwise we will get CTE.

        Image for Thread lifcycle with wait-notify..
        

        
        */
    }
}
