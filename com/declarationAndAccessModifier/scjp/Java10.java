package com.declarationAndAccessModifier.scjp;

public class Java10 {
    /*
    native modifier.
    ==================
    native is a modifier applicable only for methods.And we cannot apply anywhere else.

    The methods where are implemented in non-java mostly C or C++ are called native methods/foreign method.

    The main objective of native keywords are 
    1,The main objective of native keyword are to improve performance of the system.

    2,To achieve machine level or memory level commnication.

    3,To use already existing non-java code.

    pseudo-code to use native keyword in Java.

    eg.
    class Native{

        static{
            System.loadLibrary("Native library path");
            //1, To load native libraries.
        }
        //2. Declare a native method.

        public native void m1();

    }

    class Client{
        public static void main(String[] args){
            Native n=new Native();
            n.m1(); 3. Invoke a native method.
            -----
            -----
            -----
        }
    }

    For native method,Implementation is already available in old languages like C and C++ and we are not responsible for providing implementation.Hence native method declaration should ends with semicolon.

    public native void m1();Valid

    public native void m1(){}
    CTE: native methods cannot hava a body.

     For native method implementation is already available in old languages but for abstract method implementation should not be available. Hence we cannot declare native method as abstract.Means native-abstract combination is illegal combination for methods.


     we cannot declare native method as strictfp because there is no gaurantee that old languages follow IEEE754 standard. Hence native-strictfp combination is illegal combination for methods.

     The main advantage of native keyword is performance will be improved but the main disadvantage of native keyword is it breaks platform indepandant nature of Java.


     # transient keyword.

     transient is a modifier applicable only for variables.

     we can use transient keyword in serialization context.

     At the time of serialization, if we dont want to save a value of a particular variable to meet security constaints then we should declare the variable as transient.

     At the time of serialization,JVM ignore original value of transient variable and save default value to the file.

     Hence transient means not to serializa.


    username:durga
    transient pwd:kishan123

    at the time of serialization.

    JVM will save 

    username:durga
    pwd:null

    at the time of deserialization.

    username:durga
    pwd:null


    volatile....

    volatile is a modifier applicable only for variables and we cannot apply anywhere else.

    If the value of a variable keep on changing by multiple threads then there maybe a chance of data inconsitency problem.
    We can solve this problem by using volatile modifier.

    If a variable declared as volatile then for every thread JVM will create a separate local copy.

    Every modification performed by that thread will takes place in local copy sothat there is no affects on remaining threads.

    The main advantage of volatile keyword is we can overcome data inconsitancy problem but the main disadvantage of volatile keyword is creating and maintaining a separate copy for every thread increases complexity of programming and creates performance problem hence if there is no specific requirement then it is never recommanded to use volatile keyword and it is almost deprecated keyword.

    final variable means the value never changes.
    Whereas volatile variable means the value keep on changing hence volatile-final is illegal combination for variable.

    SUMMARY IMAGE..Table

    The only applicable modifier for local variable is final.

    The only applicable modifier for constructors are public, private, protected , default.

    The modifier,which are applicable only for method native.

    The modifier which are applicable only for variables volatile and transient.

    The modifier which are applicable for classes but not for interfaces final.

    The modifier which are applicable for classes but not for enum is final and abstract.
    





    */
}

