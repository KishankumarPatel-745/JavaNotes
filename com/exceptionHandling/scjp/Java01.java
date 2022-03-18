package com.exceptionHandling.scjp;

/**
 * Java01
 */
public class Java01 {

    public static void main(String[] args) {
        /*
        Exception handling agenda.
        1,Introduction

        2,Runtime stack mechanism

        3,Default exception handling in java

        4,Exception Hierarchy

        5,Customized exceptino handling by using try catch

        6,control flow in try catch

        7,Methods to print exception information

        8,try with multiple catch blocks

        9,finally block

        10, difference between final,finally,finalize.

        11,control flow in try-catch-finally.

        12, control flow in nested try-catch-finally.

        13,various possible combinations of try catch finally

        14, throw keyword

        15,throws keyword

        16,Exception handling keywords summary

        17,Various possible compile time errors in exception handling.

        18, customized or user defined exceptions

        19,Top-10 exceptions

        20, 1.7 version enhancements

        20.1 try with resources.

        20.2 multi catch blocks

        ##Introduction
        An unexpected,unwanted event that disturbs normal flow of the programm is called exception.
        eg
        TypePunctureException
        SleepingException
        FileNotFoundException.
        etc

        It is highly recommmned to handle exception and the main objective of exception handling is gressful termination of the programm.

        Exception handling doesnot mean repairing an exception. We have to provide alternative way to continue rest of the programm normally is the concept of exception handling.

        eg.
        Our programming requirement is to read the file locating at london.at runtime if london file is not availble our programm should not be terminated abnormally. We have to provide some local file to continue rest of the programm normally.
        This way of defining alternative is nothing but exception handling.

        try{
            read data from remote file locating at london
        }
        catch(FileNotFoundException e){
            use local file and continue rest of the programm normally.

        }

        RUNTIME STACK MECHANISM
        ------------------------
        For every thread,JVM will create a runtime stack.
        Every method call performed by thread will be stored in the corresponding stack.

        Each entry in the stack is call activation record/stack frame.

        After completing every method call, the corresponding entry from the stack will be removed.

        After completing all method call, The stack will become empty and the empty stack will be destroyed by JVM just before terminating the thread.
        eg.
        class Test{
            main(){
                doStaff();
            }
            public static void doStuff(){
                doMoreStuff();
            }
            public static void doMoreStuff(){
                SOP("Hello");
            }
        }

        runtime stack for main Thread.

        main()=>doStuff()=>doMoreStaff().





        */
    }
}