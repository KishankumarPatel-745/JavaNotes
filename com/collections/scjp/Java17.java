package com.collections.scjp;

import java.util.ArrayList;

import java.util.Collections;

public class Java17 {
    public static void main(String[] args) throws Exception{
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(Collections.binarySearch(l,"Z"));
        System.out.println(Collections.binarySearch(l, "J"));
        Collections.reverse(l);
        System.out.println(l);

        /*
        Searching from List.

        Collections class defines the following binarySearch().

        public static int binarySearch(List l,Object target).

        If the List is sorted according to default natural sorting order then we have to use this method.

        public static int binarySearch(List l,Object target,Comparator c);

        we have to use this method if the list is sorted according to customized sorting order.

        CONCLUSION.

        1,
        The above search method internally will use binarySearch algorithm.

        2,
        Successful search returns index.
        Unsuccessful search returns insertion point.

        Insertion point is the location where we can place target element in the sort list.

        Before calling binary search method, compulsory list should be sorted otherwise we will get unpredictable results.

        If the List is sorted according to comparator then at the time of Search operation also we have to pass same comparator object otherwise we will get unpreditable result.

        For the List of n element, in the case of binary search method,

        1.Successful search result range: 0 to n-1.

        2. Unsuccessful result range. 
        -(n+1) to -1.

        3. Total result range: -(n+1) to n-1.

        eg.
        for 3 elements
        -1 -2 -3 -4 
        A K Z
        0 1 2

        successful result range: 0 to 2.
        Unsuccessful result range:-4 to -1
        Total result range: -4 to 2.

        Reverving elements of List.

        Collection class defines the following reverse method to reverse elements of List.

        public static void reverse(List l);


        reverse() VS reverseOrder()

        We can use reverse method to reverse order of elements of List.
        Whereas, reverseOrder() to get reverse comparator

        eg
        Comparator c1=Collections.reverseOrder(Comparator c);

        c1:- Descending Order
        c: ascending order.
        


        
        */
    }
}
