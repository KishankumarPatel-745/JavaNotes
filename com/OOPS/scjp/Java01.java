package com.OOPS.scjp;

public class Java01 {
    /*
    1,Data Hiding
    2,Abstraction
    3,Encapsulation
    4,Tightly encasulated class
   
    5,IS-A Relationship
    6,HAS-A Relationship
    7,method signature
    8,overloading *
    9,overriding *
    10,Static control flow. *
    11,Instance control flow. *
    12,constructors
    13, coupling
    14, cohesion
    15,Type-casting.


    1, Data Hiding.

    Outside person cannot access our internal data directly or our internal data should not go out directly.
    This OOP feacture is nothing but Data Hiding.
    After validation or authantication outside person can access our internal data.
    eg.
    After providing proper username and password, we can able to access our gmail data.

    eg.
    Eventhough we are valid customer of the bank we can able to access our account information and we cannot access others account information.

    By declaring data member(Variable) as private we can achieve data hiding.

    eg.
    public class Account{
        private double balance;

        public double getBalance(){
            //perform validation
            return balance;
        }
    }

    The main advantage of data hiding is security.
    it is highly recommanded to declare data member as private.

    Abstraction.
    Hiding internal implementation and just highlight the set of services we are offering, is a concept of abstraction.

    eg.
    ATM GUI screen.
    -withdraw
    -deposit
    -check balance
    -mini statement   etc..

    Throug bank ATM GUI screen, bank people are highlighting the set of service what they are offering,without highlighting internal implementation.

    The main advantages of abstraction are
    1, we can achieve security because we are not highlighting our internal implemantation.

    2,Without affecting outside person, we can able to perform any type of changes in our internal system.Hence enhancement will become easy.

    3,Improve maintainability of the application.

    4,It improves easyness to use our system.

    BY using interfaces and abstract classes, we can implement abstraction.


    Encapsulation.
    The process of binding data and corresponding methods into a single unit is nothing but incapsulation.

    eg.
    class Student{
        //data members 
        //methods (behavious)
    }

    binding data and behavious.
    eg every java class is an eg of encapsulation.

    If any component follows data hiding and abstraction such type of component is said to be encapsulated component.

    Encapsulation is equal to data hiding plus abstractation.

    eg.

    GUI SCREEN
    Balance Enquiry Button
    Update Balance Button

    public class Account{
        private double balance;
        public double getBalance(){
            //validation
            return balance 
        }
        public void setBalance(){
            //Validation
            this.balance=balance;

        }
    }

    The main advantage of encapsulation are 
    we can achieve security.

    Enhancement will become easy.

    It improves maintainibility of the application.

    The main advantage of encapsulation is we can achieve security but the main disadvantage of encapsulation is it increases length of the code and slowes down execution.

    Tightly encapsulated class.
    A class is said to be tightly encapsulated if every variable declared as private.
    Whether class contains corresponding getter or setter or not and whether this methods are declared as public or not.These things we are not required to check.

    eg.
    public class Account{
        private double balance;
        public double getBalance(){
            return balance;
            
        }
    }
    which of the following class tightly encapsulated.

    class A{
        private int x=10;   
    } tightly

    class B extends A{
         int x=10;   
    } not tightly

    class C extends A{
        private int z=10;   
    } tightly



    NOTE
    IF the parent class is not tightly encapsulated then no child class is tightly encapsulated.
    eg2

    class A{
        int x=10;
    } not tightly

    class B extends A{
        private int y=10;
    } not tightly

    class C extends B{
        private int z=10;
    } not tightly

    */
    
}
