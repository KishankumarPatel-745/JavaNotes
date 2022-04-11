package com.collections.scjp;

public class Java18 {
    public static void main(String[] args) {
        /*
        Arrays class is an utility class to define several utility methods for Arrays.

        Arrays class defines the following sort methods to sort the elements of primitives and object type arrays.

        public static void sort(primitive[] p);
        --> To sort according to natural sorting order.

        public static void sort(Object[] o);
        To sort according to natural sorting order.

        public static void sort(Object[] o, Comparator c);

        To sort according to customized Sorting order.


        We can sort primitive array only based on default natural sorting order,where as we can sort Object arrays either based on default natural sorting order or based on customized sorting order.

        Searching the element of array.

        Arrays class define the following binarySearch method.

        public static int binarySearch(primitive[] p,primitive target);

        public static int binarySearch(Object[] a,Object target);

        public static int binarySearch(Object[] a, Object target,Comparator c);


        Note.
        All rules of Arrays class's binarySearch() is exactly same as Collections class's binarySearch().

        Conversion of Array to List.

        public static List asList(Object[] a); 

        Strictly Speaking this method won't create an independent List Object, for the existing array, we are getting List View.

        eg.
        String s={"A","Z","B"};
        List l=Arrays.asList(s);

        s and l refers to same Object.

        By using array refer if we perform any change automatially this change will be reflected to the List.

        Similarly by using List reference if we perform any change.That change will be reflected automatically to the Array.

        By using List reference, we cannot perform any operation, which varies the size,otherwise we will get RTE saying UnsupportedOperationException.

        eg.
        l.add("M"); RTE
        l.remove(1); RTE
        l.set(1,"N"); valid

        By using List reference, we are not allowed to replace with Heterogeneous Object otherwise we will get RTE ArrayStoreException.

        eg.
        l.set(1,new Integer(10));
        RTE:ArrayStoreException.




        
        */
    }
}
