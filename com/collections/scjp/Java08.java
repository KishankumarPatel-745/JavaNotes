package com.collections.scjp;

public class Java08 {
    public static void main(String[] args) {
        /*
        NavigableSet(I). 1.6 enhancement, will cover later.


        TreeSet.

        The underlying DataStructure is balanced Tree.

        Duplicate Objects are not allowed.
        Insertation Order not preserved.
        Heterogeneous Objects are not allowed, otherwise we will get RTE saying ClassCastException.

        null insertation is possible only once.

        Implements Serializable,Cloneable and but not RandomAccess.

        All Object will be inserted based on some Sorting order.
        It may be default natural sorting order or customized sorting order.

        Constructor.

        1,
        TreeSet t=new TreeSet();
        ==> Create an empty TreeSet Object,where the element will be inserted according to default natural sorting order.

        2,
        TreeSet t=new TreeSet(Comparator c);

        Creates an empty TreeSet Object where the element will be inserted according to customized sorting order specified by Comparator Object.

        3,
        TreeSet t=new TreeSet(Collection c);


        4,
        TreeSet t=new TreeSet(SortedSet s);

        TreeSet demo01.
        main(){
            TreeSet t=new TreeSet();
            t.add("A");
            t.add("a");
            t.add("B");
            t.add("L");
            t.add("J");
            t.add("A"); not inserted duplicate
            t.add(10);//ClassCastException 
            t.add(null); NullPointerException.
            SOP(t);[A,B,J,L,a]

        }

        null exceptance.

        For non-empty TreeSet if we are trying to insert null then we will get NullPointerException.

        For empty TreeSet, as a first element null is allowed.But after inserting that null if we are trying to insert any other then we will get Runtime exception saying NullPointerException.

         NOte*
         Until 1.6 version, null is allowed as a first element to the empty TreeSet but from 1.7 version onwords, null is not allowed even as a first element.Means null such type of story not applicable for TreeSet from 1.7 version onwords.

         Demo02
         main(){
             TreeSet t=new TreeSet();
             t.add(new StringBuffer("A"));
             t.add(new StringBuffer("Z"));
            
             t.add(new StringBuffer("p"));
             sop(t);
             CTE: ClassCastException.

         }

         If we are depanding on default Natural Sorting Order then compulsory the object should be Homogeneous and Comparable, otherwise we will get RTE saying ClassCastException.

         An object is said to be Comparable if Corresponding class implements Comparable interface.
         String class and all wrapper classes already implements Comparable interface but StringBuffer class doesn't implement Comparable interface.
         Hence we got ClassCastException in above Example.

         Comparable Interface.
         It is present in Java.Lang Package.
         And it contains only one method compareTo().
        
         public int compareTo(Object obj);

         obj1.compareTo(obj2);
         return -ve if obj1 has to come before obj2.
         return +ve if obj1 has to come after obj2.
         return 0 if obj1 and obj2 are equal.

         eg,
         main(){
             SOP("A".compareTo("X")); -ve
             SOP("X".compareTo("A"));+ve
             SOP("A".compareTo("A"));
             0
             SOP("A".compareTo(null));
             RTE:NullPointerException.
         }


         If we are depending on default natural sorting order,while adding object into the TreeSet, JVM will call compareTo() methods.
         
         eg.
         TreeSet t=new TreeSet();
         t.add("K");
         t.add("Z"); "Z".compareTo("K") +ve
         t.add("A"); "A".compareTo("K") -ve
         t.add("A"); "A".compareTo("K") -ve
         "A".compareTo("A"); 0

         SOP(t);[A,K,Z] balanced tree.

         obj1.compareTo(obj2);

         obj1--> the object,which is to be inserted

         obj2-->the object which is already inserted.

         NOte..
         If default natural sorting order not available or if we are not satisfied with default natural sorting order then we can go for customized sorting by using Comparator.

         Comparable meant for default natural sorting order.
         Whereas comparator meant for customized sorting order.
         
         



        
        */
    }
}
