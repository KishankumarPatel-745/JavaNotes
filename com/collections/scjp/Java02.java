package com.collections.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        9 key interfaces of Collections Framework.

        1, Collection
        2, List
        3, Set
        4, SortedSet
        5, NavigableSet
        6, Queue
        7, Map
        8, SortedMap
        9, NavigableMap.

        Collection(I)

        1,
        If we want to represent a group of individual object as a single entity then we should go for collection.

        Collection interface defines the most common method,which are applicable for any collection Object.

        In general collection, interface is considered as root interface of collection framework.

        There is no concrete class,which implements Collection interface directly.
        
        What is a different between Collection and Collections?

        Difference between Collection and Collections?
        
        Collection is an interface.
        If we want to represent a group of individual object as a single entity then we should go for Collection.

        Collections is an utility class, present in Java.Util package.
        To define several utility methods for Collection Objects(like sorting,searching etc).

        List(I)
        It is a child interface of Collection.
        If we want to represent a group of individual objects as a single entity, where duplicates are allowed and insertation order must be preserved then we should go for List(I).


        Collection(I)-->List(I)-->ArrayList,LinkedList,Vector-->Stack 1.0V Legacy Classes.

        In 1.2 Version,Vector and Stack classes are re-engineered to implement List Interface.

        Set(I).
        It is a child interface of Collection.
        If we want to represent a group of individual Object as a single entity, where duplicates are not allowed and insertation order not required.Then we should go for Set(I).

        Collection(I)<--Set(I)<--HashSet<--LinkedHashSet

        SortedSet(I).
        It is the child interface of Set(I).
        If we want to represent a group of individual Object as a single entity, where duplicates are not allowed and all Objects should be inserted according to some sorting Order then we should go for SortedSet.
        
        NavigableSet(I).

        It is a child interface of SortedSet. It contains several methods for navigation purposes.

        Collection(I)<-- Set(I) <-- SortedSet(I) <-- NavigableSet(I)<-- TreeSet.

        Differences between List and Set.

        List VS Set.

        1, Duplicates are allowed 
        In set,Duplicates are not allowed.

        2,
        Insertion order is preserved.
        In set, Insertion order is not preserved.

        Queue(I) interface.

        It is a child interface of collection, if we want to represent a group of individual Object prior to processing then we should go for Queue.

        Usually Queue follows First in first out order but based on our requirement we can implement out own priority order also.
        eg.

        Before sending a mail, all mailIDs we have to store in some Data Structure.
        In which order, we added mailIDs in the same order only.mail should be delieved.

        For this requirement queue is best choice.

        Queue<-- PriorityQueue
        Queue<-- BlockingQueue<-- PriorityBlockingQueue
                     <--LinkedBlockingQueue

        All the above interfaces(Collection,List,Set,SortedSet,NavigableSet,Queue) meant for representing a group of individual objects.

        If we want to represent a group of object as key-value pairs then we should go for Map(I).
     

        Map(I) interface.

        Map(I) is not child interface of Collection(I).

        IF we want to represent a group of objects as Key-Value pairs then we should go for Map(I).


        key---Value
        Roll_number--Student_Name

        101--Durga
        102--Ravi

        Both key-value are objects only.Duplicate keys are not allowed but values can be duplicated.

        Map Image refer,

        SortedMap(I)

        It is a child interface of Map(I).
        If we want to represent a group of Key-Value Pairs according to some sorting order of keys, then we should go for SortedMap(I).

        In sortedMap, the sorting should be based on key but not based on value.

        NavigableMap(I):
        It is a child interface of SortedMap(I).
        It define several methods for navigation purposes.
        
        TreeMap is the only implemented class.

        The following are legacy characters present in Collection framework.

        Enumeration(I)
        Dictionary(AC)
        Vector(C)
        Stack(C)
        Hashtable(C)
        Properties(C)

        RFfer the image ...
        for whole Collection concept.
        








        
        
        */
    }
}
