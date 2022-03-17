package com.OOPS.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        Overridding Concept..

        Whatever methods parent has bydefault available to the child through inheritance. If child class not satisfied with the parent class implementation then child is allowed to redefine that method based on its requirement. This process is called overridding.

        The parent class method,which is overridden is called overridden method.

        And the child class method,which is overridding is called overridding method.

        class P{
            public void  property(){
                SOP("CASH/LAND/GOLD");
            }
            public void marry(){
                SOP("Manpreet/Kaur");
            }
            //Overridden
        }
        class C extends P{
            public void marry(){
                SOP("3sha/4me/9tara");
            }
            //overriding
        }
        class Test{
            main(){
                P p=new P();
                p.marry();//parent method

                C c=new C();
                c.marry();//child method

                P p1=new C();
                p1.marry();//child method

            }
        }
    
        **In overriding method resolution always takes care by JVM based on runtime objects.
        Hence Overriding is also considered as runtime polymorphism or dynamic polumorphism or late binding.

        Rules for overriding.
        In overriding method names and argument types must be matched means method signature must be same.

        In overriding return type must be same but this rule is applicable until 1.4 Version only.
        From 1.5 Version onwards, we can take co-variant return types.
        According to this child class method return type need not be same as Parent method return type.its child type also allowed.

        eg.
        class P{
            public Object m1(){
                return null;
            }
        }
        class C extend P{
            public String m1(){
                return null;
            }
        }

        It is invalid in 1.4 version from 1.5 version onwards it is valid.


        Parent class method return type.
        Object
        Number
        String not alloed with Object return type

        double not alloed co-varient type is not applicable to the primitives type.
        
        child  class method return type.
        Object/String/StringBuffer
        Number/Integer/etc.
        Object

        int
    //////////////////////

    Parent class private method is not available to the child.Hence overriding concept not applicable for private method.

    Based on our requirement,we can define exactly same private method in child class.It is valid but not overriding.

    We cannot override parent class final method in child classes. If we are trying to override we will get CTE.

    eg.
    class P{
        public final void m1(){

        }
    }
    class C extends P{
        public void m1(){

        }
    }
    eg. m1() in C cannot override m1() in P;
    overridden method  is final.


    Parent class abstract method we should override in child class to provide implementation.

    eg.
    abstract class P{
        public abstract void m1();
    }

    class C extends P{
        public void m1(){

        }
    }

    We can override non-abstract method as abstract.

    class P{
        public void m1(){

        }
    }
    abstract class C extends P{
        public abstract void m1(){};
    }
    The main advantage of this approach is we can stop the availbility of Parent method implementation to the next level child classes.

    In overriding the following modifier wont keep any restriction
    synchronized, native, strictfp, abstract

    non-final --> final allowed
    final --> non-final not allowed


    While overriding we cannot reduce scope of access modifier but we can increase the scope.

    eg.
    class P{
        public void m1(){

        }
    }
    class C extends p{
        void m1(){}
    }
    CTE: m1() in C cannot override m1() in P; attempting to assign weaker access privileges: was public.


    private < default < protected < public.

    




        
        */
    }
    
}
