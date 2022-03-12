package com.declarationAndAccessModifier.scjp;
/**
 * Java07
 */
public class Java07 {

    public static void main(String[] args) {
        /*
        strictfp (strict floating point)
        1, came 1.2v
        2, we can declare strictfp for classes and methods.
        But not for variables.

        usually the result of floating point arithmatic is varied from platform to platform. 
        If we want platform indepandent result for floating point arithmatic then we should go for strictfp modifier.

        strictfp method....

        IF a method declared as strictfp all floating point calculation in that method has to follow IEEE754 standand.

        So that we will get platform independent result.

        abstract modifier never talks about implementation where as strictfp method always talk about implementation hence strictfp and abstract combination is illegal for methods.

        strictfp class 
        If class declared as strictfp then every floating point calculatation present in concret method has to follow IEEE754 standard so that we will get platform independent results.

        We can declare abstract strictfp combination for classes.means abstract strictfp combination is legal for classes but illegal for method.

        eg.
        abstract strictfp class Test{

        }//Valid

        eg1.
        abstract strictfp void m1(){}
        //Illegal combination of modifies ...

        Member modifier..


    Member or Varible Level Modifiers.

    1, public member.

    If a member declared as public then we can access that member from anywhere.
    But corresponding class should be visible.means before checking member visibility we have to check class visibility.

    eg.
    package pack1;
    class A{
        public void m1(){
            SOP("A class method");
        }
    }
    javac -d . A.java

    package pack2;
    import pack1.A;
    class B{
        public static void main(String[] args){
            A a=new A();
            a.m1()
        }
    }
    java -d . B.java
    CTE: pack1.A is not public in pack1; cannot be accessed from outside package.

    In the above example eventhough m1() is public we cannot access from outside package because corresponding class A is not public. means if both class and method are public then only we can access a method from outside package.

    default members 
    If a member declared as default then we can access that member only within the current package.
    From outside of the package, we cannot access.
    Hence default access is also known as package level access.

    private member.
    If a member is private then we can access that member only within the class. means outside of the class we cannot access.

    abstract method should be availble to the child classes to provide implementation.
    whereas private method are not availble to the child classes hence private-abstract combination is illegal for methods.


    protected member.(The most misunderstood modifier in Java)

    If a member declared as protected then we can access that member anywhere within the current package but only in child classes of outside package.

    protected =<default> + kids.

    We can access protected member within the current package anywhere either by using parent reference or child reference.
    But we can access protected member in outside package only in child classes. and we should use child reference only. means parent reference cannot be used to access protected member from outside package.

    eg.1
    package pack1;
    public class A{
        protected void m1(){
            SOP("The most misunderstood modifier");
        }
    }
    class B extends A{
        public static void main(String[] args){
            A a=new A();
            a.m1();
            B b=new B();
            b.m1()
            A a1=new B()
            a1.m1()
        }
    }

    eg2
    package pack2;
    import pack1.A;
    class C extends A{
        Public static void main(String[] args){
            A a=new A();
            a.m1();CTE
            C c=new C();
            c.m1();
            A a1=new C()
            a1.m1();m1() has protected access in pack1.A
        }
    }


    We can access protected member from outside package only in child classes and we should use that child class reference only. 
    From D class, if we want to access we should use D class reference only.

    eg.
    package pack2;
    import pack1.A;
    class c extends A{

    }
    class D extends C{
        public static void main(String[] args){
            A a =new A();
            a.m1();Invalid

            C c =new C();
            c.m1();Invalid

            D d =new D();
            d.m1();Valid

            A a1 =new C();
            a1.m1();Invalid

            A a2 =new D();
            a2.m1();Invalid

            A c1 =new D();
            c1.m1();Invalid
            
        }
    }
    CTE: m1() has protected access in pack1.A


    SUMMARY TABLE 
    private 
    protected 
    public 
    default

    The most restricted modifier is a private and the most accessible modifier is public.

    private < default < protected < public

    recommanded modifier for data member is private.
    But recommanded modifier method is public.







        


        */
    }
}