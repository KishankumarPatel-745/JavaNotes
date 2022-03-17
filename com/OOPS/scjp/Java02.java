package com.OOPS.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        IS-A relationship.
        Inheritance concept.
        Reusability.

        It is also known as inheritance.
        The main advantage of IS-A relationship is code reusability.

        By using extends keyword we can implement IS-A relationship.

        class P{
            public void m1(){
                SOP("Parent");
            }
        }

        class C extends P{
            public void m2(){
                SOP("child");
            }
        }

        class Test{
            main(String[] args){
                1, P p=new P();
                p.m1();
                p.m2();
                CTE: cannot find symbol
                symbol:method m2()
                location:class P

                2, C c=new C();
                c.m1();
                c.m2();

                3.P p1=new C();
                p1.m1();
                p1.m2();
                CTE: cannot find symbol
                symbol:method m2()
                location:class P

                4. C c1=new P();
                incompatible types 
                found:P
                required: C

                CONCLUSIONS..

                Whatever methods parent has bydefault available to the child.Hence on the child reference we can call both parent and child class methods.

                eg.
                whatever methods child has bydefault not availble to the parent.
                Hence on the parent reference we cannot call child specific methods.

                Parent reference can be used to hold child object.
                But by using that reference we cannot call child specific methods.

                But we can call method present in parent class.

                Parent reference can be used to hold child object but child reference cannot be used to hold parent object.


                
            }
        }

        without inheritance.
        class Vloan{
            300 methods
        }
        class Hloan{
            300 methods
        }
        class Ploan{
            300 methods
        }

        With Inheritance
        class Loan{
            250 methods
        }

        class Vloan extends Loan{
            50 specific methods
        }
        class Ploan extends Loan{
            50 specific methods
        }
        class Hloan extends Loan{
            50 specific methods
        }


        The most common method,which are applicable for any type of child, we have to define in parent class.

        The specific methods,which are applicable for a particular child we have to define in child class.

        Total Java API is implemented on inheritance concept.

        The most common method,which are appplicable for any java object are defined in Object class.
        Hence every class in java is the child class of Object either directly or indirectly.
        So that Object class method bydefault available in every java class without rewriting.
        Hence Object class acts as root for all java classes.

        Throwable class defines the most common methods for every exception and error classes. Hence this class acts as root for java exception hierarcy.

        class A extends B,C{

        }

        multiple inheritance.
        A java class cannot extends more than one class at a time.
        Hence Java wont provide support for multiple inheritance in classes.

        eg.
        class A extends B,C{

        }

        NOTE:
        If our class doesnot extends any other class then only our class is direct child class of object.
        eg.
        class A{

        }
        object-->A

        If our class extends any other class then our class is indirect child class of Object.

        class A extends B{

        }
        Object-->B-->A
        multilevel inheritance.

        NOTE:-
        Either directly or indirectly Java wont provide support for inheritance with respect to classes.

        WHY?
        Why java wont provide support for multiple inheritance.

        There maybe a chance of ambiguity problem. Hence Java wont provide support for multiple inheritance.

        P1-> m1()-->C
        p2-> m1()-->C
        c.m1();
        Ambiguity problem

        But interface can extends any number of interfaces simantaneously. Hence Java provide support for multiple inheritance with respect to interfaces.

        interface A{
            
        }
        interface B{

        }
        interface C extends A,B{

        }

        WHY ambiguity problem wont be there in interfaces?

        PI1->m1()-->CI->implementation class
        PI2->m1()-->CI-> implementation class

        Even though multiple method declarations are available but implementation is unique.Hence there is no chance of ambiguity problem of interfaces.

        NOTE:
        strictly speaking through interfaces we wont get any inheritance. 


        Cyclic inheritance.
        Is not allowed in java.
        Ofcource it is not required 
        eg1
        class A extends A{

        }
        cyclic inheritance involved A

        eg2
        class A extends B{
            
        }
        class B extends A{

        }

        cyclic inheritance involved A










        */
    }
}
