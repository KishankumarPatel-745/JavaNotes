package com.collections.scjp;

import java.util.ArrayList;

/**
 * Test
 */
class Test {

    
}
public class Java03 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add('A');
        l.add(10);
        l.add('A');
        l.add(null);
        l.add(new Test());
        System.out.println(l);
        l.remove(4);
        System.out.println(l);
        l.add(2,"kishan");
        l.add("ram");
        System.out.println(l);


        /*
        If we want to represent a group of individual object as a single entity then we should go for collection.

        Collection interface defines the most common methods, which are applicable for any collection object

        Collection Interface method.

        boolean add(Object o);

        boolean addAll(Colletion c);

        boolean remove(Object o);

        boolean removeAll(Collection c);

        boolean retainAll(Collection c); => to remove all objects except those present in c.

        void clear();

        boolean contains(Object o);

        boolean containAll(Collection c);

        boolean isEmpty();

        int size();

        Object[] toArray();

        Iterator iterator();

        There is no concrete class,which implement Collection Interface Directly.


        List(I)

        List is child interface of collection, if we want to represent a group of individual object as a single entity, where duplicates are allowed and insertion order must be preserved.
        Then we should go for List(I).

        We can preserve insertion order via index.
        And we can diffentiate duplicate objects by using index.
        Hence Index will play very important rule in List.

        List(I)
        defines the following specific methods.

        void add(int index,Object o);

        boolean addAll(int index,Collection c);

        Object get(int index);

        Object remove(int index);

        Object set(int index, Object new);
        To replace the element present at specified index with provided Object and returns old object.

        int indexOf(Object o)
         returns index of first occurence of 'o'

        int lastIndexOf(Object o)

        ListIterator listIterator();

        Collection(I)
        List(I)
        ArrayList
        LinkedList
        Vector<--Stack
        
        ArrayList.
        1,
        The underlying data structure is resizable array or growable array.

        2,
        Duplicates are allowed

        3,
        Insertion order is preserved.

        4,
        Heterogeneous objects are allowed.
        Except Treeset and TreeMap, everywhere heterogeneous objects are allowed.

        5,
        null insertion is possible.


        Constructors.

        1,
        ArrayList l=new ArrayList();

        Creates an empty arrayList Object with Default Initial Capacity 10.
        Once ArrayList reaches its max capacity then a new ArrayList Object will be created with new Capacity = current capacity *3/2+1;

        2,
        ArrayList l=new ArrayList(int initialCapacity);

        Creates an empty arrayList Object with specified initial capacity.

        3,
        ArrayList l=new ArrayList(Collection c);

        Creates an equivalent ArrayList Object for the given collection.

        code for ArrayList...






        */
    }
    
}
