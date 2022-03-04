package com.operatorAndAssignment.scjp;
public class Java07 {
    public static void main(String[] args) {
        /*
        1,new and newInstance()
        2,instanceof and isInstance()
        3, ClassNotFoundException and NoClassDefFound.

        1. new and newInstance()

        ==> new:- new operator
        we can use new operator to create an object if we know class name at the begining.
        eg.
        Test t=new Test();
        Student s=new Student();
        Customer c=new Customer();

        newInstance() is a method present in Class class. We can use newInstance method to create object, if we dont know className at the begining and it is availble dynamically at runtime.

        eg.
        class Student{

        }
        class Customer{

        }
        class Test{
            public static void main(String[] args){
                Object o=Class.forName(args[0]).newInstance();
                sop("Object created for:- ",o.getClass().getName());
            }

        }

        at CMD:
        Java Test Student :-o/p Object created for:- Student
        Java Test Customer :- o/p
        Object created for:- Customer
        Java Test java.lang.String
        Object created for:- java.lang.String

        Test t =new Test()

        In the case of new operator, based on our requirement we can invoke any constructor.
        eg.
        Test t=new Test();
        Test t1=new Test(10);
        Test t2=new Test("Kishan");

        But newInstance() method internally calls no-arg constructor. Hence to use newInstance() method compulsory corresponding class should contain no-arg constructor, otherwise we will get runtime exception saying InstantiationException.

        While using new Operator at runtime if the corresponding .class file is not availble.Then we will get RTE saying NoClasDefFoundError:Test

        eg
        Test t=new Test();
        at runtime if Test .class file is not availble then we will get RTE NoClassDefFoundError:Test

        While using newInstance() method at runtime if the corresponding .class file is not availble then we will get RTE: saying ClassNotFoundException.

        eg.
        Object o=Class.forName(args[0]).newInstance();

        Java Test Test2212
        RTE: ClassNotFoundException:Test123

        At runtime, Test2212 class file is not avalible for programm then we will get runtime exception saying ClassNotFoundException:Test2212


        Differences between new and newInstance()

        new-- Operator in Java

        newInstance--it is a method present in Java.Lang.Class

        new-- we can use new operator to create object if we know className at the beginning.

        newInstance()--we can use this method to create object if we dont know class name at the beginning and it is availble dynamically at runtime.

        new--To use new operator class not required to contain no-arg constructor.

        newInstance()-- To use newInstance method compulsory class should contain no-args constructor.
        Otherwise we will get RTE saying InstantiationException.

        new-- At runtime if .class file is not availble then we will get RTE NoClassDefFoundError
        which is unchecked.

        newInstance()-->At runtime if corresponding .class file is not availble then we will get RTE: ClassNotFoundException.
        Which is checked.

        Different between ClassNotFoundException and NoClassDefFoundError.

        Test t =new Test();
        
        For hardcoded class names, at runtime if the corresponding .class file is not availble then we will get RTE saying NoClassDefFoundError, which is unchecked.

        Test t=new Test()
        at Runtime if Test.class file is not availble then we will get RTE saying NoClassDefFoundError:Test

        For dynamically provided class names at runtime if the corresponding .class file is not availble, then we will get RTE saying ClassNotFoundException, which is checked exception.
        eg
        Object o=Class.forName(args[0]).newInstance();

        At Runtime, if student .class file not availble then we will get RuntimeException saying
        ClassNotFoundException:Student 
        eg.
        Java Test Student
        RTE: ClassNotFoundException:Student

        instanceof and isInstance():-
        instanceof is an operator in Java.
        we can use instanceof to check whether the given object is of particular type or not and we know the type at the beginning.

        eg.
        Thread t=new Threat();
        sop(t instanceof Runnable);
        sop(t instanceof Object);
        
        isInstance is a method present in Java.Lang.Class we can use isInstance method to check whether the given object is of particular type or not and we dont know the type at the beginning and it is availble dynamically at runtime.
        eg.
        class Test{
            public static void main(String[] args){
                Threat t=new Thread();
                sop(Class.forName(args[0]).isInstance(t));
            }
        }
        eg.
        Java Test Runnable
        o/p true
        Java Test String
        o/p false

        isInstance() is method equavalent of instanceof operator.
        























        */
        
    }
}
