package com.OOPS.scjp;

public class Java09 {
    public static void main(String[] args) {
        /*
        Strictly Speaking through type casting, we arenot creating any new Object.

        For the existing object, we are providing another type of reference variable.Means we are performing type casting but not object casting.

        String s=new String("Kishan");
        Object o=(Object)s;

        OR
        Object o=new String("Kishan");

        eg02

        Integer i=new Integer(10);
        Number n=(Number)i;// Number n=new Integer(10);
        Object o=(Object)n;
        Object o=new Integer(10);
        SOP(i==n);//true
        SOP(o==n);//true


        all three references are referring to the same object.


        Note:
        A <--- B <--- C

        C c=new C();
        (B)C ==> B b=new C();
        (A)((B)C) ==> A a=new C();

        eg02

        P-->m1(){}

        child  C->m2(){}

        C c=new C();
        c.m1(); Valid call
        c.m2(); Valid call

        ((P)c).m1(); Valid call
        P p=new c();
        p.m1();

        ((P)c).m2(); InValid call
        p.m2();
        Reason:
        Parent reference can be used to hold child object but by using that reference we cannot call child specific methods and we can call only the method availble in Parent class.

        eg03

        A<--B<--C
        m1() methods is overridden in child class.

        A class=> 
        m1(){
            SOP("A");
        }

        B class=> 
        m1(){
            SOP("B");
        }

        C class=> 
        m1(){
            SOP("C");
        }

        C c=new C();
        c.m1(); //c
        ((B)c).m1(); //c
        ((A)((B)c)).m1(); //c

        It is overriding and method resolution is always based on runtime object.

        If we take every method static in above example then we got the answer like.Because it is a method hiding and compiler resolve method depands on reference type.

        C c=new C();
        c.m1(); //C
        ((B)c).m1(); //B
        ((A)((B)c)).m1(); //A

        It is method hiding and method resolution is always based on reference type.

        eg04
        A(int x=777) <-- B(int x=888) <-- C(int x=999)

        C c=new C();
        c.x; //999
        ((B)c).x; //888
        ((A)((B)c)).x; //777

        Variable resolution is always based on reference type but not based on runtime object.
        
        


        
        */
    }
}
