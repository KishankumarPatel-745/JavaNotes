package com.GarbageCollector.scjp;

import java.util.Date;

public class Java03 {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        
        System.out.println("The TotalMemory:- "+r.totalMemory());
        System.out.println("The Freememory:- "+r.freeMemory());
        for(int i=0;i<10000;i++){
            Date d=new Date();
            d=null;
        }
        r.gc();
        System.out.println("The Freememory after GC request :- "+r.freeMemory());
        
        /*
        The methods for requesting JVM to run GC.

        The ways for requesting JVM to run GC.

        Once we made an object eligible for GC. It maynot be destroy immediately by GC.
        
        Whenever JVM runs GC then only the Object will be destroy, but when exactly JVM runs GC. We cannot expect it is varied from JVM to JVM.

        Instead of waiting untill JVM runs GC we can request JVM to run GC programmtically but whether JVM accept our request or not. There is no gaurantee but most of the time JVM accept our request.

        The following are two ways for requesting JVM to run GC.

        By using System class.
        
        System class contain a static method gc() for this purpose.

        System.gc();

        By using Runtime class.

        Runtime class.
        Java Application can communicate with JVM by using Runtime Object.

        Runtime class present in java.lang package and it is a singleton class.

        we can create Runtime Object by using Runtime.getRuntime() method.

        Runtime r=Runtime.getRuntime();
        Once we got Runtime Object we can call the following methods on that Object.

        1,
        totalMemory();
        It returns number of bytes of total memory present in the heap. That is Heap Size.

        2,
        freeMemory();
        It returns number of bytes of free memory present in the Heap.

        3,
        gc();
        for requesting JVM to run GC.


        programm.

        gc method present in System class is a Static method whereas gc() present in Runtime class is instance method.

        Question.

        Which of the following is valid way to requesting JVM to run GC.

        1. System.gc(); valid
        2. Runtime.gc(); not valid
        3. (new Runtime()).gc(); notvalid
        4. Runtime.getRuntime().gc();  valid.

        NOte.
        It is convient to use System class gc() when compared with Runtime class gc().
        With respect to performance it is highly recommanded to use Runtime gc() when compared with System class gc() because Systme class gc() internally calls Runtime class gc().

        class System{
            public static void gc(){
                Runtime.getRuntime().gc();
            }
        }


        



        
        
        */
    }
}
