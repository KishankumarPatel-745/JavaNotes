package com.enhancementInMultiThreading.scjp;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRun01 implements Runnable{
    String name;
    MyRun01(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name + "... job started by Thread:- "+Thread.currentThread().getName());

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);
            
        }
        System.out.println(name+"..job got completed by the "+Thread.currentThread().getName());
        
    }

}

public class Java04 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*
        Thread Pools(Executor Framework)

        Thread Pools.

        Creating a new Thread for every job may create performance and memory problem.
        To overcome this we should go for thread pool.

        Thread Pool is a pool of already created thread ready to do our job.

        Java1.5Version introduces Thread pool framework to implements Thread Pool.

        Thread Pool framework also known as Executor Framework.

        We can create a Thread Pool as follows.

        ExecutorService service=Executors.newFixedThreadPool(3);

        we can submit a runnable job by using submit method.

        service.submit(job);

        we can shutdown executor service by using shutdown method.

        service.shutdown();

        class MyRunnable implements Runnable{

        }



        */
        ExecutorService service=Executors.newFixedThreadPool(3);

        MyCallable[] jobs={
            new MyCallable(5),
            new MyCallable(6),
            new MyCallable(10),
            new MyCallable(100),
            new MyCallable(3),
            new MyCallable(2)
            };


            for (MyCallable job : jobs) {
                Future r=service.submit(job);
                System.out.println(r.get());
            }
            service.shutdown();

    }
}
class MyCallable implements Callable{
    int num;

    MyCallable(int number){
        num=number;
    }
    @Override
    public Object call() throws Exception {
       System.out.println(Thread.currentThread().getName()+" is responsible to get the sum of first "+num);
       int sum=0;
       for (int i = 1; i <= num; i++) {
           sum+=i;  
       }
       return sum;
    }

}
/*
In the above example, Three Threads are responsible to execute six jobs.
So that a single thread can be reused for multiple jobs.

NOTE.
While designing web servers and applications servers,we can use Thread Pool concept.

callable and Future.

In the case of runnable job,Thread won't return anything after completing the job.

If a thread is required to return some result after execution then we should go for callable.

callable interface contains only one method call().

public Object call() throws Exception

If we submit callable object to executor then after completing the job Thread returns Object of the type Future.

Means Future object can be used to retrieve the result from callable job.


Differences between Runnable and Callable.

Runnable VS Callable.

If a thread not required to return anything after completing the job then we should go for runnable.

IF a thread required to return somthing after completing a job then we should go for callable.

runnable interface contain only one method run.
callable interface contain only one method call.

runnable job not required to return anything and hence return type of run method is void.

callable job is to require to return something then the return type is Object.

within the run method,if there is any chance of raising checked exception then compulsory we should handle by using try-catch because we cannot use throws for run method.

Within call method,if there is any chance of raising any checked exception we are not required to handle by using try-catch.Because call method already throws exception.

runnable is present in java.lang package.1.0V

callable is present in java.util.concurrent package.1.5V



*/
