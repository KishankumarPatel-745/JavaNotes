package com.OOPS.scjp;

public class Java08 {
    public static void main(String[] args) {
        /*
        coupling and cohesion..
        The degree of depandency between the component is called coupling.

        If depandency is more then it is considered as tightly coupling and if depandancy is less then it is considered as loosely coupling.

        eg.
        class A{
            static int i=B.j;
        }
        class B{
            static int j=C.k;
        }
        class C{
            static int k=D.m1();
        }
        class D{
            public static int m1(){
                return 10;
            }
        }
        The above components are said to be tightly coupled with each other.
        Because depandence is more.

        Tightly coupleing is not a good programming practise because it has several serious disadvantages.

        Without affecting remaining component we cannot modify any component hence enhancement become difficult.

        It supresses reusability.
        It reduces maintainability of the application.
        Hence we have to maintain depandance between component as less as possible.means loosely coupleing is a good programming practice.


        Cohesion.
        for every component a clear well-defined functionality is defined then that component is said to be high cohesion.

        High cohesion is always good programming practise because it has several advantages.
        1,without affecting remaining component we can modify any component.
        Hence Enhansement will become easy.

        2,It promotes reusability of the code(where ever validation is required we can reuse the same validate servlet without rewriting).
        It improves maintainibility of the application.

        NOTE:
        loose coupling and high cohesion are good programming practises.


        OBJECT TYPE CASTING.

        We can use parent reference to hold child object.
        eg.
        Object o=new String("Kishan");

        we can use interface reference to hold implemented class object.
        Runnable r=new Thread();

        A b=(C)d;
        A: class/interface name
        b: name of the reference varible
        C: class/interface mane
        d:referece variable name.

        Mantra01.(Compile time checking 01)
        The type of 'd' and 'c' must have some relation.
        Either child to parent or parent to child or same type, otherwise we will get Compile Time Error saying inconvertible types
        found: d type 
        required: c

        eg.
        Object o=new String("Kishan");
        StringBuffer sb=(StringBuffer)o;

        eg2
        String s=new String("Kishan");
        StringBuffer sb=(StringBuffer)s;

        CTE:Inconvertible types
        found: java.lang.String
        required: java.lang.StringBuffer.

        Mantra02(Compiler Time checking 02)

        C must be either same or derived type of A otherwise we will get compile time error saying 
        Incompatible types
        found:C
        required:A

        eg.
        Object o=new String("Kishan");
        StringBuffer sb=(StringBuffer)o; Valid .

        eg2

        Object o=new String("Kishan");
        StringBuffer sb=(String)o; Invalid .

        CTE:incompatible types
        found: java.lang.String
        required: java.lang.StringBuffer.

        Mantra 03(Runtime checking)
        Runtime object type of 'd' must be either same or derived type of C otherwise we will get runtime exception saying ClassCastException.

        eg01.
        Object o =new String("Kishan");
        StringBuffer sb=(StrinfBuffer)o;

        RTE:ClassCastException: 
        Java.lang.String cannot be cast to Java.lang.StringBuffer.


        eg02

        Object o =new String("Kishan");
        Object o1=(String)o;


        Example based on this mantraes.
        left

        */
    }
}
