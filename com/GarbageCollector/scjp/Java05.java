package com.GarbageCollector.scjp;

public class Java05 {
    static Java05 j;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method call ");
        j=this;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Java05 m=new Java05();
        System.out.println(m.hashCode());
        m=null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(j.hashCode());
        j=null;
        System.gc();
        Thread.sleep(3000);
        System.out.println("End of main");


        /*
        Finalize method.. 

        Eventhough Object eligible for GC multiple times but gc calls finalize method only once.

        refer code 
        o/p
        366712642
        Finalize method call
        366712642
        End of main

        In the above programm, even through Object eligible for GC two times but GC calls finalize method only once.


        We cannot expect the exact behaviour of GC. It is varied from JVM to JVM hence for the following question we cannot provide exact answers.

        1,
        When exactly JVM runs GC.

        2,
        In which order,GC identifies eligible objects.

        3,
        In which order,GC destory eligible objects.

        4,
        Whether GC destroys all eligible objects or not.

        5,
        What is algorithm followed by GC.

        etccc.

        Note.
        1, Whenever Programm runs with low memory then JVM runs GC.But we cannot expect exactly at what time.


        2,
        Most of the GC follows standard algorithm "Mark and swipe" algorithm. it doesnot mean every GC follows the some algorithm.

        eg.
        class Test{
            static int count=0;
            main(){
                for(int i=0;i<10;i++){
                    Test t=new Test();
                    t=null;
                }
            }
            public void finalize(){
                SOP("Finalize method called "+ ++count);
            }
        }

        if we keep on increasing this count number(10), at certain point, memory problem will be raised.
        Then JVM runs GC.
        GC calls finalize method on every object separately.
        and destroy that objects.



        Case ...
        Memory Leaks.
        The Objects,which are not use in our programm and which are not eligible for GC.Such type of useless objects are called Memory Leaks.

        In our programm, if memory leaks present then the programm will be terminared by raising OutOfMemoryError.
        Hence if an object no longer required it is highly recommanded to make that object eligible for GC.

        The following are various third party memory management tools to identify memory leaks.

        HP OVO
        HP J Meter
        JProbe
        Patrol
        IBM Tivoli



        
        
        */
    }
}
