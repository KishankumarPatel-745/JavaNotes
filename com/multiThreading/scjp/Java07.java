package com.multiThreading.scjp;

class Display{

    synchronized void wish(String name){
        for (int i = 0; i < 4; i++) {
            System.out.print("Good Morning :- ");
        try {
            Thread.sleep(2000);
            
        } catch (InterruptedException e) {
            System.out.println("Got an interruption");
        }
        System.out.println(name);
        }
        
    }
}
class SynThreadDemo extends Thread{
    Display d;
    String name;
    SynThreadDemo(Display d,String name01){
        this.d=d;
        name=name01;
    }
    @Override
    public void run() {
        d.wish(name);
    }

}
public class Java07 {
    public static void main(String[] args) {
        /*
        SYNCHRONIZATION
        ==================

        Synchronized is a modifier applicable only for methods and blocks but not for classes and variables.

        If multiple threads are trying to operate simantaneously on the same Java Object then there may be a chance of Data inconsistency problem.
        To overcome this problem,we should go for synchronized keyword.
        If a method or block declared as synchronized then at a time only one thread allow to execute that method or block on the given object so that data inconsistency problem will be resolved.


        The main advantage of synchronized keyword is we can resolve data inconsistency problem but the main disadvantage of synchronized keyword is it increases waiting time of the thread and creates performance problem.
        Hence if there is no specific requirement then it is not recommanded to use synchronized keyword.

        Internally synchronization concept is implemented by using lock.Every object in java has a unique lock.

        Whenever we are using synchronized keyword then only lock concept will come into the picture.

        If a thread want to execute synchronized method on the given object.First it has to get lock of that object.

        Once Thread got the lock then it is allowed to execute any synchronized method on that object.

        Once method execution completes automatically thread releases a lock.

        Acquiring and releasing a lock internally takes care by JVM and programmer not responsible for this activity.

        while a Thread executing synchronized method on the given object, The remainging threads are not allowed to execute any synchronized method simantaneously on the same object.
        But remaining thread are allowed to execute non-synchronized method simantaneously.

        class X{
            synchronized m1(){
                
            }
            synchronized m2(){

            }
            m3(){

            }
        }

        t1 starts executing of m1().If t2 came to execute the same m1().got into waiting state.

        t3 came to execute m2():- waiting state.

        t4 came to execute m3():
        got immediate chance to execute.

        Lock concept is implemented based on Object but not based on method.


        An Object have an two area 
        1, Non-synchronized Area.
        This Area can be accessed by any number of Threads simantaneously

        2, Synchronized Area.
        This area can be accessed by only one thread at a time.


        class X{
            synchronized Area{
                Where we are performing update operation(add/delete/modifing).Meaning we are updating state of an Object.
            }

            non-synchronized Area{
                Where we are performing any read operation.

            }

        }

        eg.
        class ReservationSystem{
            non-synchronized checkAvailability(){
                //Just read operation

            }

            synchronized bookTicket(){
                //Update operation.
            }
        }

        If we are not declaring wish() as synchronized then both thread will be executed simantaneously.
        Hence we will get Irregular output.

        If we declare wish() as synchronied then at a time only one thread is allowed to execute wish() on the given display object hence we will get regular output.

        






        */
        Display d=new Display();
        SynThreadDemo t=new SynThreadDemo(d,"Kishan");
        SynThreadDemo t1=new SynThreadDemo(d,"JInal");
        t.start();
        t1.start();
    }
    
}
