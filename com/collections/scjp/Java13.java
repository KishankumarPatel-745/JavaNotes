package com.collections.scjp;

import java.util.Comparator;
import java.util.TreeMap;

public class Java13 {
    public static void main(String[] args) {
        TreeMap t=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1=(Integer)o1;
                Integer i2=(Integer)o2;
                return i2.compareTo(i1);
            }
            
        });
        t.put(100, "kshan");
        t.put(101, "jina");
        t.put(98, "kka");
        t.put(null, "kka");
        System.out.println(t);
        /*
        SortedMap.
        it is child interface of Map.
        If we want to represent a group of key-value pair according to some sorting order of keys, then we should go for SortedMap.

        Sorting is based on the key but not based on value.

        SortedMap defines the following specific Methods.

        1,
        Object firstKey();

        2,
        Object lastKey();

        3,
        SortedMap headMap(Object key);

        4,
        SortedMap tailMap(Object key);

        5,
        SortedMap subMap(Object key1,Object key2);

        6,
        Comparator comparator();

        eg.
        SortedHashMap==>
        101=A
        103=B
        104=C
        105=D
       

        firstKey()==>101
        lastKey()==>136
        headMap(104) ==> {101=A,103=B}
        tailMap(104) ==>{104=C,105=D}
        comparator()=>null

        TreeMap(C)

        The underlying DataStructure is Red-Black tree.

        Insertation order is not preserved and it is based on some sorting order of keys.

        Duplicate keys are not allowed but values can be duplicated.

        If we are depanding on Default Natural Sorting order then keys should be homogeneous and comparable.Otherwise we will get runtime Exception saying ClassCastException.
        If we are defining our own sorting by comparator then keys need not be homogeneous and comparable, we can take heterogeneous non comparable object also.

        Whether we are depanding on default natural sorting order or customized sorting order 
        ,There are no restriction for values , we can take heterogeneous non comparable objects also.


        null acceptance.

        For non-empty TreeMap, if we are trying to insert an entry with the null key then we will get RTE saying NullPointerException.

        For empty TreeMap, as a first entry with null key is allowed but after inserting that entry if we are trying to insert any other entry then we will get RTE saying NullPointerException.

        The above null exceptance rule is applicable until 1.6 version only.From 1.7 version onwords,null is not allowed for Key.

        But for values, we can use null any number of time, there is no restriction whether it is 1.6 version or 1.7 version.

        Constructor.

        TreeMap t=new TreeMap();
        ==> Default natural sorting order.

        TreeMap t=new TreeMap(Comparator c);
        ==>Customized sorting 

        TreeMap t=new TreeMap(Map m);

        TreeMap t=new TreeMap(SortedMap m);






       


        
        */
    }
}
