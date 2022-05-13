package com.jvmArch.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        Heap Area.

        For every JVM, one heap area is available. Heap area will be created at the time of JVM start-ups.

        Object and corresponding instance variables will be stored in the heap area.

        Every array in java is object only hence arrays also will be stored in the heap area.

        Heap area will be accessed by multiple threads,hence the data stored in heap memory is not thread-safe.

        Heap area need not be continuous.

        Programm to display heap memory statistics.

        A java application can communicate with JVM by using Runtime object.
        Runtime class presents in java.lang package and it is a singleton class.

        we can create Runtime object as follows 
        Runtime r=Runtime.getRuntime();

        Once we got Runtime object, we can call the following methods on that object.

        1, maxMemory();
        It returns number of bytes of max memory allocated to the heap.

        2,totalMemory();
        it returns number of bytes of total memory allocated to the heap.  (Initial memory) 


        3,freeMemory();
        It returns number of bytes of free memory present in the heap.

        eg..
        class HeapDemo{
            main(){
                Runtime r=Runtime.getRuntime();
                SOP("Max Memory:- "+r.maxMemory());

                SOP("Initial Memory:- "+r.totalMemory());

                SOP("Free Memory:- "+r.freeMemory());

                SOP("Consumed memory: "+(r.totalMemory()-r.freeMemory()));

            }
        }
        

        How to set maximum and minimum heap sizes?
        Heap memory is finite memory but based on our requirement, we can set maximum and minimum heap sizes.
        Means we can increase and decrease heap size based on our requirement.

        We can use the following flags with java command.

        -Xmx to set the maximum heap size.(Max memory)

        eg.
        java -Xmx512m HeapDemo
        this command will set maximum heap size as 512 mb.

        -Xms :- we can use this command to set minimum heap size.

        Java -Xms64m HeapDemo.

        To set minimum heap size as 64mb.
        That is totalmemory.

        eg.

        java -Xmx512m -Xms64m HeapDemo
         



        */
    }
    
}
