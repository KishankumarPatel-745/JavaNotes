package com.collections.scjp;

import java.util.Comparator;
import java.util.TreeSet;

// class MyComparator implements Comparator{
//     @Override
//     public int compare(Object o1, Object o2) {
//         String s1=o1.toString();
//         String s2=o2.toString();
//         return s1.compareTo(s2);
//         //or -s1.compareTo(s2);
//     }
// }
class Employee implements Comparable{
    int eno;
    String name;
    Employee(int eNumber,String name){
        eno=eNumber;
        this.name=name;
    }
    @Override
    public String toString() {
        return name+"---"+eno;
    }
    @Override
    public int compareTo(Object o) {
        int eno01=this.eno;
        Employee e=(Employee)o;
        int eno02=e.eno;
        if(eno01<eno02){
            return -1;
        }else if(eno01>eno02){
            return +1;
        }else{
            return 0;
        }

    }
}
public class Java10 {
    public static void main(String[] args) {
        // TreeSet t=new TreeSet(new MyComparator());
        TreeSet t=new TreeSet();

        t.add(new Employee(102,"kishan"));
        t.add(new Employee(103,"akash"));
        t.add(new Employee(104,"aaki"));
        t.add(new Employee(105,"jinal"));
       
        System.out.println(t);
        /*
        WAP to insert String Objects into the TreeSet where all elements should be inserted according to reverse of alphabetical order.

        WAp to insert StringBuffer objects into the TreeSet where the sorting order is alphanetical order.

        If we are depanding on default natural sorting order compulsory the object should be homogeneous and comparable otherwise we will get RTE saying ClassCastException.
        If we are defining our own sorting by comparator then Objects need not be comparable and homogeneous, means we can add heterogeneous non-comparable objects also.


        WAP to insert String and StringBuffer Object in the TreeSet where sorting order is increasing length order.
        If two objects having same length then consider alphabetical order.

        Comparable Vs Comparator.

        For predefined comparable classes, default natural sorting order already available. If we are not satisfied with that default natural sorting order then we can define our own sorting by using comparator.

        For predefined non-comparable classes like StringBuffer default natural sorting order not already available, we can define our own sorting by using comparator.

        For our own classes like Employee, The person, who is writing that class is responsible to define default natural sorting order by implementing comparable interface.
        The person, who is using our class if he is not satisfied with the default natural sorting order then he can define his own sorting by using comparator.

        Refer Image..

        refer code 

        Comparison of Comparable and Comparator.

        it is meant for Default Natural Sorting Order.

        It is meant for Customized Sorting Order.

        Present in Java.Lang package.
        Present in Java.Util package.

        It define only one method compareTo().
        It defines two method compare and equals().

        String and all Wrapper classes implement the comparable interface.

        The only implemented classes of Comparator are Collector and RuleBasedCollector.

        Comparison Table of Set implemented classes.

        HashSet--LinkedHashSet--TreeSet

        refer a image would be good.
        
        for empty TreeSet as a first element null is allowed but this rule is applicable until 1.6 version only.But from 1.7 version onwards null is not allowed even as a first element.
        
        
        */
    }
}
