package com.declarationAndAccessModifier.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        Class Level Modifier.
        whenever we are writing our own classes. we have to provide some information about our class to the JVM.
        like.
        1,Whether this class can be accessible from anywhere or not.
        2,Whether child class creation is possible or not.
        3,Whether Object creation are possible or not.etc

        we can specify this information by using appropriate modifier.

        TOTAL Modifier. 12 
        =====================
        public,private,default,protected.

        final,abstract,static,synchronized

        native,strictfp,transient,volatile.

        The only applicable modifier for top level classes are ...
        ====>>
        1,public 
        2,default 
        3,final
        4,abstract
        5,strictfp

        But for inner classes the applicable modifiers are ...
         1,public 
        2,default 
        3,final
        4,abstract
        5,strictfp
        
        6,private 
        7,protected
        8,static
        =====
        
        eg
        private class Test{
            public stati.....
        }

        CTE: Modifier private not allowed here.

        Access specifier VS Access modifier.

        public,private, protected and default are consider as Specifiers.

        Except this remainings are consider as modifier.
        But this rule is applicable only for old languages like C++ but not for Java.

        IN java, all are considered as modifiers only.

        There is no word like specifiers.

        eg.
        private class Test{

        }
        CTE: modifier private not allowed here.


        1,public classes.

        If a class declared as public then we can access that class from anywhere.

        eg.
        package pack1;
        public class A{
            public void m1(){
                sop("Hello");
            }
        }
        Javac -d . A.java

        package pack2;
        import pack1.A;
        class B{
            public static void main(String[] args){
                A a=new A();
                a.m1()
            }
        }
        java -d . B.java
        java pack2.B
        o/p
        Hello

        ==>If class A is not public then while compiling B class, we will get compile time error saying pack1.A is not public in pack1: cannot be accessed from outside package.

        2,Default classes.

        If class declared as default then we can access that class only within the current package,means from outside package, we cannot access.

        Hence default access is also known as package level access.

        3,final modifier.

        final is a modifier applicable for classes, methods and variable.

        3.1==> final method.

        whatever methods parent has bydefault available to the child through inheritance.
        If the child not satisfied with parent method implementation then child is allowed to redefine that method based on its requirement. This process is called overriding.

        If the parent class method declared as final then we cannot override that method in child class because its implementation is final.

        eg.
        class P{
            public void property(){
                SOP("cash land and stocks");
            }

            public final void merry(){
                SOP("subhlaxmi");
            }
        }

        class C extends P{
            public void merry(){

                SOP("3sha/sunny/jesssica");
            }
        }
        CTE : merry() in C cannot override merry() in P;
        overridden method is final.

        3.2 final class.

        If a class declared as final we cannot extend functionality of that class.
        means we cannot create child class for that class.
        means Inheritance is not possible for final classes.

        eg.
        final class P{

        }
        class C extends P{

        }
        CTE: Cannot inherit from final P.

        NOTE*
        Every method present inside final class is always final bydefault.

        But every variable present inside final class need-not-be final.

        NOTE:
        The main advantage of final keyword is we can achieve security.
        And we can provide unique implementation.
        But, The main disadvantage of final keyword is we are missing several OOPS feacture like missing Inheritance(final classes) and Polymorphism(final methods).

        Hence if there is not specific requirement then it is not recommanded to use final keyword.










         
        */
    }
}
