package com.collections.scjp;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        if(i1<i2)
            return +1;
        else if(i1>i2)
            return -1;
        else 
            return 0; 
    }
    
}
public class Java09 {
    public static void main(String[] args) {

        TreeSet t=new TreeSet(new MyComparator());
        
        t.add(12);
        t.add(0);
        t.add(19);
        t.add(78);
        t.add(1);
        System.out.println(t);
        /*
        Comparator(I).

        Comparator present in Java.Util package.
        and it defines two method compare() and equals().

        public int compare(Object obj1,Object obj2);

        return -ve if obj1 has to come before obj2.

        return +ve if obj1 has to come after obj2.

        return 0 if obj1 and obj2 are equal.

        2,
        public boolean equals(Object obj);

        Whenever we are implementing Comparator(I) interface compulsory we should provide implementation only for compare method and we are not required to provide implementation for equals() method, because it is already available from Object class through inheritance.

        eg.
        WAP to insert integer object into the TreeSet where the sorting order is Descending Order.

        In TreeSet constructor, if we are not passing comparator object then Internally JVM will call compareTo(), which is meant for default natural sorting order.

        In this case the output is 
        [0,5,10,15,20].

        At line 1 ,if we are passing comparator Object, then JVM will call compare() method,which is meant for customized sorting.
        o/p is [20,15,10,5,0];

        Various possible implementation of compare method.

        public int compare(Object o1,Object o2){
            Integer i1=(Integer)obj1;
            Integer i2=(Integer)obj2;
            return i1.compareTo(i2);

            i left this here end took screen shot.
        }



        
        */
    }
}
