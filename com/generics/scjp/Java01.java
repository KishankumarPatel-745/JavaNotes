package com.generics.scjp;

public class Java01 {
    public static void main(String[] args) {
        /*
        Generics 01

        Agenda..

        1,
        Introduction.

        2,
        Generics Classes

        3,
        Bounded Types.

        4,Generic Methods and wild-card character(?)

        5, Communication with non-generic code

        6, Conclusions.


        To provide Type-safety and 
        to resolve type casting problems.

        Most Valuable**
        The main objective of Generics are to provide Type Safety and to resolve type casting problems.

        Case01 Type-Safety.

        Arrays are type safe, means we can give the gaurantee for the type of element present inside Array.

        For example,if our programmi requirement is to hold only String type of Objects, we can choose String Array.
        By mistake if we are trying to add any other type of objects. we will get Compile Time Error.

        eg.
        String[] s=new String[10000];
        s[0]="durga";
        s[1]="ravi";
        s[2]=new Integer(10);
        CTE: incompatible types
        found: java.lang.Integer
        required: java.lang.String.

        s[2]="Shiva";

        Hence String array can contains only String type of Objects.
        Due to this, we can give the gaurantee for the type of element present inside Array.

        Hence Arrays are safe to use with respect to Type.
        Means Arrays are type-safe.

        But, Collections are not Type-Safe. Means We cannot give the gaurantee for the type of element present inside collection.

        For example, if our programmic requirement is to hold only string type of objects and we choose ArrayList, by mistake if we are trying to add any other type of object we won't get any compile time error but the programm may fail at runtime.

        eg.
        ArrayList l=new ArrayList();
        l.add("durga");
        l.add("Ravi");
        l.add(new Integer(10));


        String name1=(String)l.get(0);
        String name2=(String)l.get(1);
        String name3=(String)l.get(2);

        RTE: ClassCastException.

        Hence we cannot give the gaurantee for the type of elements present inside collection, due to this collection are not safe to use with respect to Type.

        Means Collections are not type-safe.

        Case02
        TypeCasting

        In the case of Arrays, At the time of retrival, it is not required to perform Type casting because there is a gaurantee for the type of elements present inside Array.

        String[] s=new String[10000];
        s[0]="durga";

        String name1=s[0];
        Type-casting not required.

        But in the case of collection, at the time of retrival compulsory , we should perform type-casting because there is no gaurantee for the type of element present inside collections.

        ArrayList l=new ArrayList();
        l.add("durga");

        String name1=l.get(0);
        CTE incompatible types
        found: java.lang.Object
        required:java.lang.String


        String name2=(String)l.get(0);

        Type casting is mandatory.

        Hence type casting is a bigger headache in collection.

        To overcome above problems of collection, SUN people introduced Generic concept in 1.5 version.

        Hence the main objective of Generics are 
        1,
        To provide type-safety.
        2,
        To resolve type-casting problem.

        For example, To hold only String type of Object, we can create Generic version of ArrayList Object as follows.

        ArrayList<String> l=new ArrayList<String>();

        For this ArrayList, we can add only String type of Objects.
        By mistake if we are trying to add any other type then we will get compile time error.

        l.add("durga");
        l.add("ravi");
        //l.add(new Integer(10));
        CTE:
        l.add("Shiva");

        Continue with file 02
        












        */
    }
    
}
