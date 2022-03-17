package com.OOPS.scjp;

public class Java15 {
    public static void main(String[] args) {
        /*
    
        Prototype of default constructor.

        It is always no-arg constructor.

        The access modifier of default constructure is exactly same as access modifier of class(This rule is applicable only for public and default).
        It contains only one line super() it is a no-arg call to super class constructor.

        programer's code
        1,class Test{

        }

        2,public class Test{

        }

        3,public class Test{
            void Test(){

            }
        }
        4,
        class Test{
            Test(){

            }
        }
        5,
        class Test{
            Test(int i){
                super();
            }
        }

        6,class Test{
            Test(){
                this(10);
            }
            Test(int i){

            }
        }

        compiler's generated code
        1,class Test{
            Test(){
                super();
            }
        }

        2,public class Test{
            public Test(){
                super();
            }
        }

        3,public class Test{
            public Test(){
                super();
            }
            void Test(){

            }
        }

        4,
        class Test{
            Test(){
                super();
            }
        }

        5,
        class Test{
            Test(int i){
                super();
            }
        }

        6,class Test{
            Test(){
                this(10);
            }
            Test(int i){
                super();
            }
        }

        The first line inside every constructor should be either super or this. and if we are not writing anything then compiler will always place super().

        CASE01:
        We can take super or this only in first line of constructor. If we are trying to take anywhere else we will get CTE.

        eg.
        class Test{
            Test(){
                SOP("Constructor");
                super();
            }
        }
        CTE: call to super must be first statement in constructor.

        CASE-2
        Within the constructor we can take either super or this but not both simantaneously.

        eg.
        class Test{
            Test(){
                super();
                this();
            }
        }

        CTE: call to this must be first statement in constructor.

        Case03
        We can use super() or this() only inside constructor. If we are trying to use outside of constructor we will get CTE.

        class Test{
            public void m1(){
                super();
                SOP("Hello");
            }
        }
        CTE:call to super must be first statement in constructor.
        That is we can call a constructor directly from another constructor only.

        SUMMARY OF super and this

        1,
        we can use only in constructor.

        2,only in first line

        3,only one but not both simantaneously.

        super() and this()
        1, 
        These are constructor calls to call super class and current class constructor.

        2,
        we can use only in constructors as first line

        3,
        We can use only once in constructor.






        super and this

        1,
        These are keywords to refer super class and  current class instance member.

        2,
        We can use anywhere except static area.

        3, we can use any number of times.


        class Test{
            main(){
                SOP(super.hashcode());
            }
        }
        CTE: non-static variable cannot be referenced from a static context.

        
         */
    }
}
