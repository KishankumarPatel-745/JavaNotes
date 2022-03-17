package com.OOPS.scjp;

public class Java16 {
    public static void main(String[] args) {
        /*
        Overloaded Constructor

        Within a class, we can declare multiple constructor and all this constructor having same name but different type of argument.
        Hence all this construtors are considered as overloaded constructor hence overloading concept are applicable for constructor.

        eg.
        class Test{
            Test(){
                this(10);
                SOP("No-arg");
            }
            Test(int i){
                this(10.2);
                SOP("Int-arg");
            }
            Test(double d){
                SOP("double-arg");
            }

            main(){
                Test t=new Test();
                //double-arg
                //int-arg
                //no-arg

                Test t2=new Test(10);
                //double-arg
                //int-arg
            }
        }



        For constructor inheritance and overriding concepts are not applicable but overloading concept is applicable.

        Every class in java including abstract class can contain constructor but interface cannot contain constructor.

        eg
        class Test{
            Test(){

            }
        } VALID
        
        abstract class Test(){
            Test(){

            }
        } VALID

        interface Test{
            Test(){

            }
        } INVALID

        CASE01
        Recursive method calls are runtime exception saying StackOverFlowError.
        But in our programm, if there is a chance of recursive method invocation then the code won't compile and we will get Compile time error.

        eg1
        class Test{
            public static void m1(){
                m2();
            }
            public static void m2(){
                m1();
            }
            main(){
                m1();
                SOP("Hello");
            }

            RTE:StackOverflowError.
            similarly.

            eg2
            class Test{
                Test(){
                    this(10);
                }
                Test(int i){
                    this();
                }
                main(){
                    SOP("Hello");
                }
            }

            CTE: Recursive Constructor Invocation.
        }


        CASE02
        eg1
        class P{

        }
        class C extends P{

        } Valid

        eg2
        class P{
            P(){}

        }
        class C extends P{

        } Valid

        eg3
        class P{
            P(int i){

            }

        }
        class C extends P{

        } Invalid

        cannot find symbol
        symbol:constructor P()
        location: class P

        Note01
        If parent class contain any argument constructor then while writing child classes we have to take special care with respect to constructor.

        Note02
        Whenever we are writing any argument constructor it is highly recommanded to write no-arg constructor also.

        CASE03
        eg01
        class P{
            P() throws IOException{

            }
        }
        class C extends P{

        }
        CTE: Unreported exception java.io.IOException in default constructor.

        eg.
        class P{
            P() throws IOException{

            }
        }
        class C extends P{
            C() throws IOException{
                super();
            }
        } valid
        If parent class constructor throws any checked exception compulsory the child class constructor should throw the same ckecked exception or its parent otherwise the code won't compile.


        Which of the following is valid?

        The main purpose of constructor is to initialize an object.

        The name of the constructor need to be same as Class name.

        Return type concept is not applicable for constructor.
        
        */
    }
    
}
