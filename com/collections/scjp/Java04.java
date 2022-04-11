package com.collections.scjp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Java04 {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        LinkedList l2=new LinkedList();
        System.out.println(l1 instanceof Serializable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l1 instanceof RandomAccess);
        System.out.println(l2 instanceof RandomAccess);
        /* 
        Usually we can use collection to hold and tranfer objects from one location to another location(Container).
        To provide support for this requirement every collection class by default implement serializable and cloneable interfaces.

        Arraylist and Vector classes implements RandomAccess interface.So that any random element, we can access with the same speed.

        RandomAccess (Interface)

        RandomAccess interface present in Java.util package and it doenn't contain any methods. It is a marker interface.
        Where required ability will be provided automatically by the JVM.

        ArrayList is a best choice if our frequent operation is retrival operation(because ArrayList implements RandomAccess Interface.
        ).

        ArrayList is a worst choice if our frequent operation is insertion/deletion in the middle.

        Differences between ArrayList And Vector.

        every method present in the ArrayList is Non-Synchronized.

        Every method present in the Vector is synchronized.

        At a time,multiple threads are allow to operate on ArrayList object and hence it is not Thread-safe.
        At a time, once one thread is allowed to operate on Vector object and hence it is Thread-safe.

        Relatively performance is high.because threads are not required to wait on ArrayList Object.
        Relatively perfommance is low,because Threads are required to wait to operate on Vector Object.
        
        introduced in 1.2 Version, and it is non-legacy.
        introduced in 1.0 Version, and it is legacy.

        How to get synchronized version of ArrayList Object.

        By default,ArrayList is non-synchronized but we can get synchronized Version of ArrayList Object by using synchronizedList() method of Collections class.
        
        Public static List synchronizedList(List l);

        eg.
        ArrayList l=new Arraylist();

        List l1=Collections.synchronizedList(l);

        l1 is synchronized.
        l is non-synchronized.

        Similarly we can get synchronized version of Set and Map object by using the following methods of Collections class.

        public static Set synchronizedSet(Set s);

        public static Map synchronizedMap(Map m);

        LinkedList

        The underlying data structure is double linkedList.
        Insertation order is preserved.
        Duplicate object are allowed.
        Heterogeneous objects are allowed.
        null insertion is possible.
        LinkedList implements Serializable and Cloneable interfaces but not RandomAccess.

        LinkedList is best choice if our frequant operation is insertation and deletion in the middle.
        LinkedList is worst Choice if our frequant operation is retrieval operations.

        Constructor.

        LinkedList l=new LinkedList();
        Creates an empty LinkedList object.

        LinkedList l=new LinkedList(Collection c);
        Creates an equivalent LinkedList Object for given Collection.

        LinkedList class specific methods.Usaually we can use LinkedList to develop Stack and Queues.

        To provide support for this requirement, LinkedList class defines the following specific methods.

        Void addFirst(Object o);
        Void addLast(Object o);

        Object getFirst();
        Object getLast();

        Object removeFirst();
        Object removeLast();


        LinkedList democode.





        
         
        */
    }
    
}
