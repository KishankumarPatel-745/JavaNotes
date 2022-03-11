package com.declarationAndAccessModifier.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        ==>abstract modifier.
        abstract is a modifier applicable for classes and methods, but not for variable.

        Abstract method.

        Even though we dont know about implementation still we can declare a method with abstract modifier. means for abstract method, only declaration is availble but not implementation.

        Hence abstract method declaration should ends with semicolon.

        public abstract void m1(); VALID
        public abstract void m1(){}; INVALID


        child class is responsible to provide implementation for parent class abstract method.

        eg
        abstract class Vehicle{
            public abstract int getNoOfWheel();
        }

        class Bus extends Vehicle{
            public int getNoOfWheel(){
                return 7;
            }
        }
        class Auto extends Vehicle{
            public int getNoOfWheel(){
                return 3;
            }
        }

        By declaring abstract method in the parent class, we can provide guideline to the child classes,such that which method, child has to implement.

        abstract method never talks about implementation. If any modifier talks about implementation, then it forms illegal combination with abstract modifier.

        The following are various illegal combination of modifiers for methods with respect to abstract.

        illegal variation.
        abstract->final
        abstract->native
        abstract->synchronized
        abstract->static
        abstract->private
        abstract->strictfp
        
        eg
        abstract final void m1();
        CTE: illegal combination of modifiers abstract and final.

        abstract class==>

        for any java class, if we are not allow to create an object because of partial implementation, such type pf class we have to declare with abstract modifier.

        means for abstract classes, instantiation is not possible.

        eg
        abstract class Test{
            public static void main(String[] args){
                Test t =new Test();
            }

        }

        CTE: Test is abstract; cannot be instantiated.
        
        abstract class VS abstract methods.

        --> If a class contains at least one abstract method then compulsory, we should declare class as abstract,otherwise we will get compile time error.
        Reason:- If a class contain at least one abstract method then implementation is not complete. Hence it is not recommanded to create an object. To restrict object instantiation,compulsory we should declare class as abstract


        -->Even though class doesnot contain any abstract method. still we can declare class as abstract if we dont want object instantion.
        means abstract class can contain zero number of abstract method also.
        
        eg.
        HttpServlet class is abstract but it doesnot contain any abstract method.

        eg2:Every adeptor class is recommanded to declare as abstract but it doesnot contain any abstract method.

        eg1
        class P{
            public void m1();
        }
        CTE missing method body or declare abstract.

        eg2
        class P{
            public abstract void m1(){}
        }
        CTE abstract method cannot have a body.

        eg3
        class P{
            public abstract void m1();
        }
        CTE
        P is not abstract and doesnot override abstract method m1() in P.

        eg4.
        If we are extending abstract class then for every method of parent class, we should provide implementation otherwise we have to declare child class as an abstract class. In This case, next level child class have to provide implementation.

        abstract class P{
            public abstract void m1();
            public abstract void m2();
        }
        class C extends P{
            public void m1(){}
        }
        CTE:C is not abstract and doesnot override abstract method m2() in P.

        final VS abstract.

        abstract method compulsory we should override in child class to provide implementation whereas we cannot override final methods hence final->abstract combination is illegal combination for methods.

        for final classes,we cannot create child class whereas for abstract classes, we should provide implementation for abstract method.Hence final-abstract combination is illegal for class level also.

        abstract class can contain final methods whereas final cannot contain abstract methods.

        eg.
        abstract class Test{
            public final void m1(){}
        }
        Valid but reverse is not possible.


        final class Test{
            public abstract void m1();
        }
        Invalid

        It is highly recommanded to use abstract modifier because it promote several OOPS feacture like Inheritance and Polymorphism.
        







        */
    }
}
