package com.collections.scjp;

public class Java16 {
    public static void main(String[] args) {
        /*
        NavigableSet... 1.6 version enhancement

        As a part of 1.6 version the following 2 concept introduced in Collectio Framework.

        NavigableSet(I)
        NavigableMap(I)

        NavigableSet(I).
        It is a child interface of SortedSet. and it defines several methods for navigation purposes.

        NavigableSet defines the following method.

        floor(e);
        it returns highest element which is <=e

        lower(e);
        it returns highest element which is < e

        ceiling(e);
        it returns lowest element which is >= e

        higher(e);
        it returns lowest element which is > e

        pollFirst()
        remove and return first element 

        pollLast()
        remove and return last element.

        descendingSet()
        it returns NavigableSet in reserve order.

        NavigableMap..(Interface)

        NavigableMap is child interface of SortMap(I).
        It defines several methods for navigable purposes.

        Map(I)<--SortedMap(I)<--NavigableMap<--TreeMap.

        Methods of NavigableMap.

        floorKey(e);
        lowerKey(e);
        ceilingKey(e);
        higherKey(e);
        pollFirstEntry();
        pollLastEntry();
        descendingMap();


        Collections class defines several utility methods for Collection object like sorting, searching, reversing etc.

        Sorting Element of List

        Collections class defines the following to sort method.

        public static void sort(List l);
        To sort based on Default natural sorting order.
        In this case,List should compulsory contains homogeneous and comparable object, otherwise we will get RTE saying ClassCastException.

        List should not contain null otherwise we will get NullPointerException.

        public static void sort(List l,Comparator c);

        To sort based on customized sorting order.

        demo programm for sorting element of the List according to default natural sorting.

        main(){
            ArrayList l=new ArrayList();
            l.add("V");
            l.add("Z");
            l.add("K");
            l.add("N");
            l.add(new Integer(10));//generate CCT when called sort.

            l.add(null); //NPE
            Collections.sort();
            SOP("After Sorting :- ",l);

            
        }


        Demo programm to sort element of List according to customized sorting.

        Collections.sort(l,new MyComparator());


        */
    }
}
