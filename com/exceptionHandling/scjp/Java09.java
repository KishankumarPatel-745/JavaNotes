package com.exceptionHandling.scjp;

public class Java09 {
    public static void main(String[] args) {
        /*
        TOP 10 Exceptions 

        Based on the person,who is rising an exception, all exceptions are divided into two categaries.
        JVM exception and Programmtic exception.

        JVM Exception:- The exception which are raised automatically by JVM whenever a particular event occurs are called JVM Exceptions.

        eg.
        ArithmaticException
        NullPointerException
        etc.

        Programmatic Exception:
        The exception which are raised explicitly either by programmer or by API developer to indicate that something goes wrong are called programatic exceptions.
        eg.
        TooOldException
        IllegalArgumentException
        etc.

        10 commonly occur exceptions.

        1,ArrayIndexOutOfBoundException

        It is a child class of runtime exception and hence it is unchecked.

        raised automatically by JVM, whenever we are trying to access array element with out of range index.


        eg.
        int[] x=new int [4];
        SOP(x[0]); 0
        SOP(x[10]);RTE:ArrayIndexOutOfBoundException
       

        2,NullPointerException

        It is the child class of Runtime Exception hence it is unchecked.

        Raised automatically by JVM, whenever we are trying to perform any operation on null.

        String s=null;
        SOP(s.length());
        RTE:NullPointerException.

        3,ClassCastException

        It is the child class of Runtime exception and hence it is unchecked.

        Raised automatically by JVM whenever we are trying to type cast parent object  to child type.

        eg.
        String s=new String("Kishan");
        Object o=(Object)s;
        Valid

        Object o=new Object();
        String s=(String)o;
        RTE:ClassCastException

        Internal object is child object.
        Object o=new String("Kisan");
        String s=(String)o;

        4,StackOverflowError

        It is a child class of Error.Hence it is Unchecked.

        Raised automatically by JVM,whenever we are trying to perform recursive method call.

        eg.
        class Test{
            public static void m1(){
                m2();
            }
            public static void m2(){
                m1();
            }
            public static void main(String[] args){
                m1();
            }
        }
        RTE: StackOverflowError.

        5,NoClassDefFoundError

        It is a child class of error and hence it is unchecked.

        Raised automatically by JVM, Whenever JVM unable to find required .class file.
        eg.
        java Test
    
        If a Test .class file is not availble then we will get RuntimeException saying NoClassDefFoundError:Test

        6,ExceptionInInitializerError.

        It is the child class of Error. Hence it is unchecked.

        Raised automatically By JVM,If any exception occurs while executing static variable assignment and static blocks.

        eg.
        class Test{
            static int x=10/0;
        }
        RTE: ExceptionInInitializerError caused by java.lang.ArithmaticException: / by 
        RTE: ExceptionInInitializerError caused by java.lang.ArithmaticException: / by zero

        eg1.
        class Test{
            static{
                String s=null;
                SOP(s.length());
            }
        }
        ExceptionInInitializerError caused by :Java.Lang.NullPointerException.
        
       


        */
    }
}
