package com.OOPS.scjp;

public class Java10 {
    static int i=10; //i=0 [RIWO]
    //i=10;[R & W] 
    static{
        m1();
        System.out.println("First static block..");
    }
    public static void main(String[] args) {
        /*
        /STATIC CONTROL FLOW/
        java Java10 run the .class

        Whenever we are executing a java class the following sequence of steps will be executed.
        As a part of static control flow.

        1, Identification of static member from top to bottom.

        2,Execution of static variable assignments and static blocks from top to bottom.

        3,Execution of main method.
=====================
RIWO: Read indirectly write only.

Inside static block, if we are trying to read a variable that read operation is called direct read.
If we are calling a method and within that method if we are trying to read a variabel then it is called indirect read.

eg.
class Test{
    static int i=10;
    static{
        m1();
        SOP(i);--> Direct read
    }
    public static void m1(){
        SOP(i);--> Indirect Read
    }
}

If a variable is just identified by the JVM and Original value not yet assigned then the variable is said to be in read indirectly write only state[RIWO].

If a variable is in RIWO state then we cannot perform direct read but we can perform indirect read.

If we are trying to read directly then we will get compile time error saying Illegal forward reference.

RIWO state(Read only write only)
1.6 Version.

eg1.
class Test{
    static int x=10;
    static{
        SOP(x);
    }
}
o/p 10
RE: NoSuchMethodError:main

eg2
class Test{
    static{
        SOP(x);Direct read
    }
    static int x=10; x=0[RIWO]
}
CTE:illegal forword reference

eg3
class Test{
    static{
        m1();
    }
    public static void m1(){
        SOP(x); indirect read
    }
    static int x=10; x=0[RIWO]
}

o/p
0
RE:NoSuchMethodError:main
 






        
        */
        m1();
        System.out.println("Main Method..");
    }
    public static void m1(){
        System.out.println(j);
    }
    static{
        System.out.println("Second static Block..");
    }

    static int j=20;//j=0[RIWO]; j=20[R&W]
    
}
/*
output..
0
First static block..
Second static Block..
20
Main Method..

*/
