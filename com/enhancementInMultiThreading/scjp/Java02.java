package com.enhancementInMultiThreading.scjp;

/**
 * Java02
 */
public class Java02 {

    public static void main(String[] args) {
        /*
        Java.Util.concurrent package.

        The problems with traditional synchronized keyword

        1,
        we are not having any flexibility to try for a lock without waiting.

        2,
        There is no way to specify maximum waiting time for a thread to get lock so that thread will wait until getting the lock, which may create performance problem.
        which may cause deadlock.

        3,
        If a Thread releases a lock then which waiting thread will get that lock we are not having any control on this.

        4,
        There is no API to listout all waiting thread for a lock.

        5,
        The synchronized keyword compulsory we have to use either at method level or within a method and it is not possible to use across multiple methods.

        To overcome this problem,SUN people introduced java.util.concurrent.locks package in 1.5Version.

        It also provide several enhancement to the programmer to provide more control on concurrency.

        lock(I) interface.

        lock object is similar to implicit lock acquired by a Thread to execute a synchronized method or block.

        lock implementation provides more extensive opeeration then traditional implicit locks.

        Important method of lock interface.

        1,
        void lock();

        We can use this method to acquired a lock.If lock is already availble then immediately current thread will get that lock.

        If lock is not already available then it will wait until getting a lock.

        It is exactly same behaviour of traditional synchronized keyword.

        2,
        boolean tryLock();

        To acquire a lock without waiting.
        If lock is available then the thread acquired that lock and return true.
        If lock is not available then this method returns false and can continue its execution without waiting.

        In this case,Thread never be entered into waiting state.
        
        eg.
        if(l.tryLock()){
            //perform safe operation
        }else{
            //Perform alternative operation.
        }

        3,
        boolean tryLock(long time,TimeUnit unit);

        if lock is availble then the Thread will get the lock and continue its execution.
        If lock is not available then the thread will wait until specify amount of time.
        Still if the lock is not available then thread can continue its execution.

        TimeUnit:
        TimeUnit is an enum present in java.util.concurrent package.

        enum TimeUnit{
                NANOSECONDS,
                MICROSECONDS,
                MILLISECONDS,
                SECONDS,
                MINUTES,
                HOURS,
                DAYS;
        }

        eg.
        if(l.tryLock(1000,TimeUnit.MILLISECONDS)){

        }


        4.
        void lockInterruptibly();

        Acquires the lock if it is available and returns immediately.
        If lock is not available then it will wait.
        while waiting if the thread is interrupted then thread won't get the lock.

        5.
        void unLock();
        To releases a lock.

        To call this method compulsory current thread should be owner of the lock otherwise we will get RTE:
        IllegalMonitorStateException.
        






        */
    }
}