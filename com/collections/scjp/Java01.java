package com.collections.scjp;

/**
 * Java01
 */
public class Java01 {

    public static void main(String[] args) {
        /*
        Collections.
        An array is an indexed collection of fixed number of homogeneous data elements.

        The main advantage of arrays is we can represent multiple values by using Single Variable.
        So that readbility of the code will be improved.

        Limitations of array.

        1, 
        Arrays are fixed in size that is once we creates an array there is no chance of increaseing or decreasing the size based on our requirement due to this to use arrays concept compulsory we should know the size in advance, which may not possible always.


        2,
        Array can hold only homogeneous datatype elements

        eg.
        Student[] s=new Student[10000];
        s[0]=new Student(); valid
        s[1]=new Customer(); CTE

        CTE:incompatible types
        found:Customer
        required: Student.

        We can solve this problem by using Object type arrays.

        Object[] a=new Object[10000];
        a[0]=new Student(); valid
        a[1]=new Customer();valid

        Arrays concept is not implemented based on some standard data structure and hence readymade method support is not available.
        For every requirement, we have to write the code explicitly, which increases complexity of programming.

        To overcome above problems of arrays,we should go for Collections concept.

        Collections are growable in nature that is based on our requirement we can increase or decrease the size.

        Collection can hold both homogeneous and heterogeneous objects/elements.

        Every collection class is implemented based on some standard Data Structure,hence for every requirement readymade method support is available.

        Being a programmer, we are responsible to use those method and we are not responsible to implement those methods.


        Difference between arrays and collections.

        1,
        Arrays are fixed in size.means once we creates an array we cannot increase or decrease the size based on our requirement.

        Collections are growable in nature means based on our requirement we can increase or decrease the size.

        2,
        With respect to memory, arrays are not recommoanded to use.
        With respect to memory, Collections are recommoanded to use.

        3,
        With respect to performance,arrays are recommanded to use.

        With respect to performance,Collections are not recommanded to use.

        4,
        Arrays can hold only homogeneous datatype elements.

        Collections can hold both homogeneous and heterogeneous elements.

        5,
        There is no underlying data structure for arrays,hence readymade method support is not available.
        For every requirement,we have to write the code explicitly, which increase the conplexity of programming.

        Every collection class is implemented based on some standard data structure and hence for every requirement readymade method support is available.being a programmer, we can use this method directly and we are not responsible to implement those methods.

        6,
        Arrays can hold both primitives and Objects.

        Collections can hold only object type but not primitive.

        If we want to represent a group of individual object as a single entity then we should go for collections.

        Collection Framework.
        it contains several classes and interfaces,which can be used to represent a group of individual object as a single entity.

        java ---> C++ terminology

        Collection --> Container
        Collection Framework --> Standard Template Library(STL)

        9 key interfaces of collection frameworks.
        








        */
    }
}