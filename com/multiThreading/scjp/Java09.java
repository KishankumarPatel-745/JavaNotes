package com.multiThreading.scjp;

public class Java09 {
    public static void main(String[] args) {
        /*
        synchronized block..
        =================

        If very few lines of the code required synchronization then it is not recommanded to declare declare entire method as synchronized we have to enclose those few lines of the code by using synchronized block.
        The main advantage of synchronized block is it reduces waiting time and improves the performance of a System.

        we can declare synchronized block as follows

        1,
        to get lock of current object.

        synchronized(this){
            ---
            ---
        }
        If a thread got lock of current object then only it is allowed to execute this area.


        2,to get lock of particular object.

        synchronized(b){
            ---
            ---
        }

        If a Thread got lock of particular object 'b' then only it is allowed to execute this area.

        3,to get class level lock.

        synchronized(Display.class){
            ---
            ---
        }

        If a thread got class level lock of "Display" class,then only it is allowed to execute this area.

        eg.

        public void wish(String name){

            ;;;;1 lakh lines of code
        synchronized(this){
            for(int i=0;i<10;i++){
                SOP("Good Morning");
            }
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                SOP(e)
            }
        }
        ;;;;1 lakh lines of code
    }

    lock concept applicable for Object types and class Types but not for primitives.Hence we cannot pass primitive type as an argument to synchronized block otherwise we will get CTE saying unexpected type 
    found: int
    required: reference

    FAQs.
     ===

     Race condition:
     If a multiple threads are operating simantaneously on same java object then there maybe a chance of data inconsitenacy problem.This is called race condition.
     we can overcome this problem by using synchronized keyword.

     can thread acquire multiple lock?

     Yes,from different objects.
     eg.
     class X{
         public synchronized void m1(){
             -- here thread has lock of x object
             Y y=new Y();
             synchronized(y){
                 --here thread has locks of x and y.

                Z z=new Z();

                synchronized(z){
                    --here thread has the lock of x,y,z.

                }

             }
         }

     }

     what is synchronized statement?
     Interview people created terminology

     The statement present in synchronized method and synchronized block are called synchronized statement.
     

    */
    }
}
