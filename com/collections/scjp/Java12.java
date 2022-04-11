package com.collections.scjp;

import java.util.HashMap;
import java.util.WeakHashMap;



class Tempt{
    @Override
    public String toString() {
        return "Test";
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method call by GC");
    }
}
public class Java12 {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap h=new WeakHashMap();
        Tempt t=new Tempt();
        h.put(t, "kishan");
        System.out.println(h);
        t=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(h);

        /*
        LinkedHashMap.

        It is the child class of HashMap.
        It is exactly same as hashMap including Method and constructor except the following differences.

        HashMap VS LinkedHashMap.

        1,
        The underlying DataStructure is Hashtable.
        The underlying DataStrcuture is the combination of Hashtable and LinkedList(Hybrid DataStructure).

        2,
        Insertion order is not preserved and it is based on hashcode of keys.
        Insertion order is preserved.

        3,
        Introduced in 1.2 version.
        Introduced in 1,4 version.

        In the above HashMap programm, if we replace HashMap with LinkedHashMap then output is insertation order.

        LinkedHashSet and LinkedHashMap are commonly used for developing cache based applications.

        Difference between == operator and .equals() 

        In general == operator meant for reference comparison(Address comparison).Where as .equals() meant for content comparison.

        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        SOP(i1==i2); false
        SOP(i1.equals(i2)); true

        IdentityHashMap.

        It is exactly same as HashMap(including methods and constructors) except the following difference.

        In the case of normal HashMap, JVM will use .equals() methods to identify duplicates Keys, which is meant for content comparison but in the case of IdentityHashMap.JVM will use == operator to identify duplicate keys, which is meant for reference comaprison(Address Comparison).

        HashMap m=new HashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        m.put(i1,"jinal");
        m.put(i2,"Kishan");
        SOP(m);
        {10=kishan}

        i1 and i2 are duplicate keys because i1.equals(i2) return true.
        If we replace HashMap with IdentityHashMap then i1 and i2 are not deplicate keys.
        because i1==i2 return false.

        In this case the output is {
            10=pawan,
            10=kalyan
        }

        WeakHashMap..
        
        It is exactly same as HashMap except the following difference
        In the case of HashMap,eventhough Object doesn't have any reference it is not eligible for GC, if it is associated with HashMap.
        Means HashMap dominates GarbageCollector.
        But in the case of WeakHashMap, if object doesn't contain any references, it is eligible for GC eventhough object associated with WeakHashMap that is GarbageCollector dominates WeakHashMap.

        eg.
        code refer 

        In the HashMap example,Tempt object is not eligible for GC because it is associate with HashMap.
        in this case, the o/p is.
        {Test=kishan}
        {Test=kishan}   

        In the above programm, if we replace HashMap with WeakHashMap then Tempt object is eligible for GC.
        In this case the o/p is..

        {Test=kishan}
        Finalize method call by GC
        {}

        */
    }
}
