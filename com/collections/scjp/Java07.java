package com.collections.scjp;

import java.util.HashSet;

public class Java07 {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("A");
        h.add("D");
        h.add("S");
        h.add(null);
        System.out.println(h.add("A"));
        System.out.println(h);
        /*
        Set(Interface).

        Collection<--Set(I)<-HashSet<-LinkedHashSet

        Set<--SortedSet(I)<--NavigableSet(I)<--TreeSet

        Set is child interface of Collection.
        If we want to represent a group of individual object as a single entity, where duplicates are not allowed and insertion order not preserved.

        Set interface doesn't contain any new method and we have to use only collection interface methods.


        HashSet(C):

        The underlying data structure is hashtable.
        Duplicate Objects are not allowed.
        Insertation order is not preserved and it is based on Hashcode of Objects.

        null insertation is possible (only once).
        Heterogeneous Objects are allowed.
        Implement Serializable  and Cloneable but not RandomAccess interface.

        HashSet is best choice if our frequent operation is search operation.

        Note.
        In HashSet duplicates are not allowed.If we are trying to insert duplicates then we won't get any compileTime or Runtime error.

        And add method simple returns false.
        eg.
        HashSet h=new HashSet();
        SOP(h.add("A")); true
        SOP(h.add("A")); false

        Constructor.

        HashSet h=new HashSet();

        Creates an empty HashSet object with the default initial capacity 16 and default fill ratio 0.75.


        HashSet h =new HashSet(int initialCapacity);

        Creates an empty HashSet Object with specified initial capacity, and default fill ratio is 0.75.

        HashSet h=new HashSet(int initialCapacity,float fillRatio);

        HashSet h=new Hashset(Collection c);

        Creates an equivalent HashSet for the given Collection.

        This constructor meant for interconversion between Collection Object.

        Fill Ratio or Load Factor.

        After filling howmuch ratio a new HashSet object will be created, This ratio is called fill ratio/load factor.

        For example fill ratio 0.75 means after filling 75 percent ratio, a new HashSet Object will be created.

        code refer 

        LinkedHashSet(C).

        It is the child class of HashSet.
        It is exactly same as HashSet including constructor and methods.
        Except the following differences.

        HashSet and LinkedHashSet.

        The underlying DS is Hashtable.
        The underlying DS is combination of LinkedList and Hashtable.

        Insertion order is not preserved.
        Insertion order is preserved.

        Introduced in 1.2 version.
        Introduced in 1.4 version.

        In the above programm, if we replace Hashset with the LinkedHashSet then the output has mentained the insertation order.
        That is insertion order preserved.

        In general, we can use LinkedHashSet to develop cache based application where duplicates are not allowed and insertion order preserved.

        SortSet(Interface).

        It is child interface of Set(I).

        If we want to represent a group of individual objects according to some sorting order without duplicates then we should go for SortedSet(I).

        SortedSet interface defines the following specific methods.

        1,
        Object first();
        returns first element of the SortedSet.

        2,
        Object last();
         returns last element of the SortedSet.

        3,
        SortedSet headSet(Object obj);

        return SortedSet whose elements are less than obj.


        4,
        SortedSet tailSet(Object obj);

        returns SortedSet whose elements are >= obj.

        5,
        SortedSet subSet(Object obj1,Object obj2);
            return SortedSet whose elements are >= obj1 and < obj2.

        6,
        Comparator comparator();
         returns Comparator object that describes underlying sorting technique.
         If we are using default natural sorting order then we will get null.

         Note.
         The default nature sorting order for numbers is ascending order.
         and for String Object, alphabetical is the default sorting order.

         SortedSet=>[100,101,104,106,110,115,120]

         1, first()==>100
         2, last()==> 120
         3, headSet(106)==> [100,101,104]

         4, tailSet(106) ==> [106,110,115,120]

         5, subSet(101,115)==> [101,104,106,110]

         6, comparator();
         






        
        */
    }
}
