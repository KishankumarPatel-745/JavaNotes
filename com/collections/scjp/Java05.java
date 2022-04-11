package com.collections.scjp;

import java.util.Enumeration;
import java.util.Vector;

public class Java05 {
    public static void main(String[] args) {
        Vector v=new Vector();
        for (int i = 0; i < 11; i++) {
            v.addElement(i);
        }
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            Integer i=(Integer)e.nextElement();
            if (i%2==0){
                System.err.println(i);
            }
        }

        /*
        Differences between ArrayList and LinkedList.

        ArrayList is best choice if our frequant operation is retrival operation.

        LinkedList is the best choice if our frequant operation is insertation and deletion in middle.
        
        ArrayList is worst choice if our frequant operation is insertion and deletion in middle, because internally several shift operations are performed.

        LinkedList is worst choice id our frequent operation is retrival operation.

        In ArrayList, The element will be stored in consequative  memory location.
        Hence retrival operation will become easy.

        In LinkedList, The element won't be stored in cosequtive memory location and hence retrival operation will become difficult.

        Vector.
        The underlying Data Structure is resizable array or Growable array.
        Insertion order is preserved.
        Duplicates are allowed.
        Heterogeneous objects are allowed.
        null insertation is possible.
        It implements serializable,cloneable and ReadomAccess Interfaces.
        Every method present in Vector is synchronized and hence Vector object is Thread-Safe.

        Vector v=new Vector();
        Create an empty Vector objects with default initialCapacity 10.
        Once Vector reaches its max capacity then a new Vector Object will be created with new capacity = current capacity *2;
        
        Vector v=new Vector(int initialCapacity);

        Creates an empty Vector Object with specified initialCapacity.

        Vector v=new Vector(int initialCapacity, int increamentalCapacity);

        Vector v=new Vector(Collection c);

        Creates an equivalent Vector Object with given collection.
        This constructor meant for interconversion between Collection Objects.

        Vector specific method.

        To add objects 
        add(Object o); --- collection
        add(int index,Object o); --- List
        addElement(Object o) --- Vector..

        To remove Objects.

        remove(Object o);-- collection
        removeElement(Object o); ---Vector

        remove(int index); --List
        removeElementAt(int index);-- Vector

        clear(); ---collection
        removeAllElements()-- vector.

        to get objects.

        Object get(int index); ---List
        Object elementAt(int index); --Vector.

        Object firstElement(); --Vector

        Object lastElement(); --Vector

        int size();
        int capacity();
        Enumeration elements();

        eg.
        main(){
            Vector v=new Vector();
            SOP(v.capacity());/10
            for(int i=0;i<=10;i++){
                v.addElement();
            }
            SOP(v.capacity());//10
            v.addElement("A");
            SOP(v.capacity());//20
            SOP(v);
        }

        Stack------

        It is the child class of Vector. It is a specially designed class for Last in First Out Order.(LIFO).

        constructor.

        Stack s=new Stack();

        Methods.

        Object push(Object o);
        to insert an object into the stack.

        Object pop();
        to remove and return top of the stack.

        Object peek();
        to return top of the stack without removal.

        boolean empty();
        return true if the stack is empty.

        int search(Object o);
         return offset if the element is availble otherwise returns -1.

        
         The 3 cursors of Java.
         If we want to get Object one by one from the collection then we should go for cursor.

         There are three types of cursor availble in java.
         1, Enumeration
         2, Iterator
         3, ListIterator.


         Enumeration.
         We can use enumeration to get Objects one by one from legacy Collection Object.

         We can create Enumeration object by using elements method of Vector class.

         eg.
         public Enumeration elements();

         eg.
         Enumeration e =v.elements();

         v is Vector Object.

         method.

         public boolean hasMoreElements();

         public Object nextElement();
         

         refer code



        */
    }
}
