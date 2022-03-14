package com.declarationAndAccessModifier.scjp;
public class Java11 {
    public static void main(String[] args) {
        /*

        Interface Agenda
        1, Introduction
        2, interface declaration and implementation
        3, extends and implements
        4, interface methods
        5, interface variables 
        6, interface naming conflicts
        6.1 method naming conflicts
        6.2 variable naming conflict
        7,marker interface (IMP)
        8,adapter classes
        9,interface,abstract class vs concrete class.
        10,Differences between interfaces and abstract class.
        11,Various Conclusion.



        Introduction.

        what is an interface?.

        DEF01

        Any service requirement specification (SRS) is considered as interface.

        eg01.
        JDBC API acts as requirement specification to develope Database Driver.

        Database Vendor is responsible to implement this JDBC api.

        JDBC API--> SUN People
        Oracle Driver -> oracle defination for JDBC driver.

        mySql Driver:- mySql defination for JDBC api

        eg2.

        Servlet API acts as requirement Specification to develop web server.

        Web server vendor is responsible to develop/implement servlet API.

        Servlet API.:- requirement specified by SUN people.

        Apache Tomcat Server.:- servlet implementation.

        Oracle Weblogic Server :- servlet implementation

        IBM websphere server:- 
        servlet implementation.

        DEF02
        From client point of view an interface define, the set of services what he is accepting. From service provider point of view, an inteface define the set of services what he is offering.Hence any contract between client and service provider is considered as an interface.

        eg.
        Through bank ATM GUI screen bank prople are highlightling the set of services that they are offering. At the same time, the same GUI screen represents the set of services what customer is expecting. Hence this GUI screen acts as contract between customer and bank prople.

        DEF03
        Inside interface every method is always abstract whether we are declaring or not. Hence interface is considered as 100% pure abstract class.

        SUMMARY DEFINATION

        Any service requirement specification or any contract between client and service provider or 100% pure abstract class is nothing but interface.

        eg.
        Whenever we are implementing an interface for every method of that interface we have to provide implementation otherwise we have to declare class as abstract then next level child class is responsible to provide implementation.

        Every interface method is always public and abstract whether we are declaring or not. Hence whenever we are implementing an interface method compulsory we should declare as public otherwise we will get CTE.

        interface Interf{
            void m1();
            void m2();
        }
        abstract class ServiceProvider implements Interf{
            public void m1(){}

        }
        class SubServiceProvider extends  ServiceProvider{
            public void m2(){}
        }

        extends VS implements.

        A class can extends only one class at a time.
        An interface can extend any number of interface simantaneously.

        eg.
        interface A{
            
        }

        interface B{

        }
        interface C extends A,B{

        }

        A class can implements any number of interfaces simantaneously.

       

        A class can extend another class and can implement any number of interfaces simantaneously.
    
        eg
        
        class A extends B implements C,D,E{

        }

        Which of the following is valis?

        A class can extend anu number of classes -Invalid

        A class can implements only one interface -Invalid.

        An interface can extend only one interface at a time.:Invalid

        An interface can implement any number of interfaces simantaneously-Invalid.

        A class can extend another or can implement an interface but not both simantaneously-Invalid

        None of the above:- Valid..

        Consider the following expression.
        for which statement this expression is true.

        X extends Y
        1,Both X and Y should be classes.
        2,Both X and Y should be interfaces.
        3,Both X and Y can be either classes or interfaces.
        4, No Restriction.


        X extends Y,Z
        x,y and z should be interfaces

        X implements Y,Z
        x->class and y,z-->interfaces

        X extends Y implements Z
        x,y -> class and z -> interface

        X implements Y extends Z
        CTE:- because  we have to take extends first followed by interface.
       


         */
        
    }

}
