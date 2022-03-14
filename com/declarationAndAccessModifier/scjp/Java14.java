package com.declarationAndAccessModifier.scjp;

public class Java14 {
    public static void main(String[] args) {
        /*
        
        Interface VS abstract class VS Concrete class.

        If we dont know anything about implementation just we have requirement specification then we should go for interface.

        eg.
        Servlet(I)

        If we are talking about implementation but not completely(Partial implementation) then we should go for abstract class. (GenericServlet)

        If we are talking about implemetation completely and ready to provide service then we should go for concrete class.
        eg. MyOwnServlet.

        Differences between interface and abstract class.

        interface and abstract class

        if we dont know anything about implementation and just we have requirement specification then we should go for interface.
        (public abstract method always, 100% pure abstract class)

        As every interface methods are always public and abstract. Hence we cannot declare with the following modifier private,protected, final,static ,synchronized ,natice and strictfp.
        Every variable present inside interface is always public,static and final whether we are declaring or not.
        Hence we cannot declare with the following modifier.private protected volatile and transient.
        Compulsory we should perform initialization at the time of declaration otherwise CTE
        cannot declare constructor.

        INside interface we cannot  declare static and instance block.

        If we are talking about implemetation but not complerely (Partial Implementation).then we should go for abstract class.(Every method present inside abstract class need not be public and abstract and we can take concrete method also.).

        There are no restriction on abstract class modifier.
        variable need not be public static final.
        variable has not restriction
        Abstract class variable we are not required to perform initialization.

        Inside abstract class we can declare static and abstract block.
        we can declare constructor.

        CONCLUSIONS===============

        Anyway we cannot create object for abstract class but abstract class can contain constructor what is a need?

        ABstract class constructor will be executed whenever we are creating child class object to perform initialization of child object.

        eg.
        abstract class Parent{
            String name;
            int age;
            100 properties
            Parent(100 props){

            }
        }
        class Child extends Parent{
            int rollNo;
            Child(101 props)d{
                Super(100 props);
                this.rollNo=rollNo;
            }
        }

        Child c=new Child(101 props);
        Child constructor calls Parent constructor for initialization of parent properties. to remove redundant code.

        NOTE: 
        Either directly or Indirectly we cannot create object for abstract class.


        Anyway we cannot create objects for abstract class and interface but abstract class can contain constructor but interface doesnot contain constructor what is the reason?

        The main purpose of constructor is to perform initialization for the instance variable.

        abstract class can contain instance variable which are required for child object. To perform initialization for those instance variable constructor is required for abstract class.
        But every variable present inside interface is always public static final.whether we are declaring or not. and there is no chance of existing instance varible inside interface. Hence constructor concept is not required for interface.


        whenever we are creating child class object , parent object wont be created just parent class constructor will be executed for the child object purpose only.

        eg.
        class P{
            p(){
                SOP(this.hashCode());100
            }
        }
        class C extends P{
            C(){
                SOP(this.hashCode());100
            }
        }
        class Test{
            main(){
                C c=new C();
                SOP(C.hashCode());100
            }
        }

        Inside interface every method is always abstract and we can take only abstract methods in abstract class also.Then what is the difference between interface and abstract class.
        Means is it possible to replace interface with abstract class.

        We can but not good proframming practice.
        This is somthing like recruiting IAS Officer for sweeping activity.

        If everything is abstract then it is highly recommanded to go for interface.

        approach 1

        abstract class x{

        }

        class Test extends x{

        }

        while extending abstract class, it is not possible to extend any other class.
        Hence we are missing inheritance benefit.

        Object creation is costly.eg. Test t=new Test();
        2mins


        app02

        interface x{

        }
        class Test implements x{

        }
        While implementing interface,we can extend someother class hence we wont miss any inheritance benefit.

        In this case, Object creation is not costly 
        eg.
        Test t=new Test();
        2 secs

        
        







        
        */
    }
}
