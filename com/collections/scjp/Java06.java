package com.collections.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        Iterator..
        Limitation of Enumeration(1.0 Version)

        1,
        We can apply Enumeratino concept only for legacy classes. and it is not a universal cursor.

        2,
        By using Enumeration, we can get only read access and we cannot perform remove operation.

        3,
        To overcome above limitations, we should go for Iterator.


        Iterator(I).

        we can apply Iterator concept for any collection Object and hence it is universal cursor.

        BY using Iterator, we can perform both read and remove operations.

        we can create Iterator Object by using iterator() method of collection interface.

        public Iterator iterator();

        eg.
        Iterator itr=c.iterator();
        c is any collection Object.


        Iterator..Methods

        public boolean hasNext();

        public Object next();
        
        public void remove();

        Limitation of Iterator.

        1,
        By using Enumeration and Iterator, we can always move only towards forward direction and we cannot move towards backward direction.
        This are single direction cursor but not bi-directional cursor.

        2,
        By using Iterator, we can perform only read and remove operation and we cannot perform replacement and addition of new Objects.
        To overcome above limitation we should go for ListIterator(I).

        ListIterator(I).

        By using ListIterator, we can move either to the forward direction or to the backward direction.
        Hence it is bi-directional cursor.

        BY using ListIterator, we can perform replacement and addition of new Objects in addition to read and remove operation.
        

        public ListIterator listIterator();

        We can create ListIterator by using listIterator method of List(I).

        eg.
        ListIterator lte=l.listIterator();

        l is any list Object.

        Methods.

        ListIterator is child interface of Iterator.
        Hence all methods present in Iterator bydefault available to the ListIterator.

        Method of ListIterator.

        ListIterator defines the following 9 methods.

        1, forward operation
        public boolean hasNext();
        public Object next();
        public int nextIndex();

        2, backward operation
        public boolean hasPrevious();
        public Object previous();
        public int previousIndex();

        3, extra operations
        public void remove();
        public void add(Object o);
        public void set(Object o);

        List example.

        The Most powerful cursor is List Iterator but its limitation is it is applicable only for List Objects.


        Comparison table of Three cursor.

        Refer Image.


        Internal Implementation of cursor.

        main(){
            Vector v=new Vector();
            Enumeratation e=v.elements();
            Iterator itr=v.iterator();
            ListIterator litr=v.listIterator();
            SOP(e.getClass().getName());
            SOP(itr.getClass().getName());
            SOP(litr.getClass().getName());
        }

        o/p
        Java.util.Vector$1
        Java.util.Vector$Itr
        Java.util.Vector$ListItr







    


        
        */
    }
}
