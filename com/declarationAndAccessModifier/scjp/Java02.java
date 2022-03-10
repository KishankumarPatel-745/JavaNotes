package com.declarationAndAccessModifier.scjp;

import static java.lang.Math.*;
public class Java02 {
    public static void main(String[] args) {
        /*
        TYPES OF Import statement
        1,Explicit class import 
        2,Implicit class import 

        There are two types of imports statement.
        1,Explicit class import 
        2,Implicit class import 

        1,Explicit class import
        ==========================
        eg.
        import java.util.ArrayList;

        It is hightly recommanded to use explicit class import,because it improves the readiblity of the code.
        Best suitble for Hi-Tech city where reabability is important.

        Implicit class import 
        eg.
        import java.util.*;

        Not recommanded to use because it reduces readbility of the code.

        Best suitable for amripate where typing is important.

        Which of the following import statement are meaningful.

        import java.util.ArrayList; //Valid

        import java.util.ArrayList.*; //Invalid

        import java.util.*; //Valid

        import java.util; //Invalid

        CASE03
        Consider the following code, 

        class myObject extends java.rmi.UnicastRemoteObject{

        }
        The above code compiles fine eventhrough, we are not writing import statement because we used fully qualified name.

        Note:- whenever we are using fully qualified name. It is not required to write import statement, similarly we are writing import statement it is not required to use fully qualified name.

        Case 04:
        
        eg.
        import java.util.*;
        import java.sql.*;
        class Test{
            public static void main(String[] args){
                Date d=new Date();
            }
        }
        CTE:reference to Date is ambiguous.

        NOTE:even in the case of List also,we may get same ambiguaty problem.

        Because it is availble in both util and awt packages.

       CASE:05
       While resolving className,compiler will always give the precedence in the following order.
       1,Explicit Class Import
       2,Classes present in CWD.(default package).
       3,Implicit Class Import.

       eg.
       import java.util.Date;
       import java.sql.*;
       class Test{
           public static void main(String[] args){
               Date d=new Date();
               System.out.println(d.getClass().getName());
           }
       }

       In the above example,util package date got considered.

       CASE06
       Whenever we are importing a java package,all classes and interfaces present in that package bydefault available,But not sub-package classes.

       If we want to use sub-package class, compulsory we should write import statement untill sub-package level.

       Eg.
       java->util->regex->Pattern

       To use Pattern class in our programm, we have to use above import statement.

       CASE07   

       All classes and interfaces present in the following packages or by default available for every Java Programm.Hence we are not required to write import statement.
       1,java.lang package
       2,Default Package (Current Working Directory)

       CASE08
       Import statement is totally compile time related concept. IF more number of import then more will be the compile time,but there is no affect on execution time(RUNTIME).

       CASE09
       Difference between C language #include and java language import statement.

       In case of C language #include all input/output header file will be loaded at the begining only
       At translation time. Hence it is static include.

       But in the case of Java import statement no .class file will be loaded at the begining.
       Whenever we are using a particular class then only corresponding .class file will be loaded.
       These is like dynamic include or Load on demand or Load on fly.

      ==> 1.5 Version New Feactures.
       1,for-each loop
       2,var-arg methods
       3,Autoboxing and         Autounboxing
       4, Generics
       5, co-carient return types
       6, Queue
       7, Annotation
       8, enum
       9,static import.


       STATIC IMPORT..
       ->Introduced in 1.5 version.
       ->According to SUN, usage of static import reduces length of the code and improves readbility.
       ->But according to worldwide programming export(like us), usage of static import creates confusion and reduces readibilty.
       Hence, if there is not specific requirement, then it is not recommanded to use static import.


       What is Static Import?

       usually we can access static member by using class name, but whenever we are writing static import we can access static members directly without class name.

       eg : without static import
       sop(Math.sqrt(4));
       sop(Math.max(10,20));
       sop(Math.random());

       eg:with static import 

       import static java.lang.Math.sqrt;
       import statuc java.lang.Math.*;

       sop(sqrt(4));
       sop(max(12,21));
       sop(random());

        
        */
        System.out.println(sqrt(16));
        System.out.println(max(231,21));
        System.out.println(random());
    }
}
