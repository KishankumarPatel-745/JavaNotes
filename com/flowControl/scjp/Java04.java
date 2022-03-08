package com.flowControl.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        Iterative Statement:

        While and do-while loop
        1, while
        If we dont know number of iteration in advance then we should go for while loop.

        eg.
        while(re.next()){

        }
        while(e.hasMoreElements()){

        }
        while(itr.hasNext()){

        }

        eg.
        Syntax:
        while(b){
            //Some Action
        }
        b should be boolean type only.

        The augument should be boolean type if we are trying to provide any other type then we will get compile time error.

        eg.
        while(1){
            sop("hello");
        }
        CTE: Compile time error.
        incompatible types 
        found:int 
        required:boolean


        Curly Braces are optional and without curly braces we can take only one statement under while.Which should not be declarative statement.

        eg.
        while(true)
            SOP("Hello");

        While(true);

        while(true)
            int x=10;
        CTE:invalid

        while(true){
            int x=10:
        }
        

        eg.
        1
        while(true){
            sop("Hello");
        }
        sop("Hi");
        CTE:unreachable statement

        2
        while(false){
            sop("Hello");
        }
        sop("Hi");
        CTE: Unreachable statement

        3
        int a=10,b=20;
        while(a<b){
            sop("Hello");
        }
        sop("Hi")
        o/p Hello
        Hello
        -----infinity

        4
        int a=10,b=20;
        while(a>b){
            sop("Hello");
        }
        sop("Hi")
        o/p Hi

        5,
        final int a=10,b=20;
        while(a<b){
            sop("Hello");
        }
        sop("Hi")
        CTE:- Unreachable statement

        6.
        final int a=10,b=20;
        while(a<b){
            sop("Hello");
        }
        sop("Hi")
        CTE: Unreachable statement.

        
        NOTE: Every final variable will be replaced by the value at the compile time only.
        eg.
        final int a=10;
        int b=20;
        sop(a);
        sop(b);

        AFTER COMPILATION
        -------------------------
        final int a=10;
        int b=20;
        sop(10);
        sop(b);

        NOTE02

        If every argument is a final varible(compile time constant) then that operation should be performed at the compile time only.

        final int a=10,b=20;
        int c=20;
        sop(a+b);
        sop(a+c);
        sop(a<b);
        sop(a<c);

        AFTER COMPILATION
        ===================
        final int a=10,b=20;
        int c=20;
        sop(30);
        sop(10+c);
        sop(true);
        sop(10<c);


        do-while loop
        --------------------------

        If we want to execute loop body at least once then we should go for do-while.

        SYNTAX:
        ------
        do{
            //BODY
        }while(b);

        //b should be boolean type.
        //semi-colon is mandatory.
        //curly braces are optional.

        without curly braces,we can take only one statement,which should not be declarative statement.

        eg.
        do 
            sop("Hello");
        while(true);

        eg
        do ;
        while(true);

        eg
        do 
            int x=10;
        while(true);
        CTE: Compile time error
        declarative statement are not allowed.

        do
        while(true);
        CTE.


        Unreachability is also a problem.. so any unreachble statement throws an error.

        eg.
        do{
            sop("Hello");
        }while(true);
        sop("Hi");
        CTE:- Unreachable Statement

        eg.
        do{
            sop("Hello");
        }while(false);
        sop("Hi");

        o/p Hello
        Hi

        eg.
        final int a=10,b=20;
        do{
            sop("Hello");
        }while(a<b);
        sop("Hi");
        CTE: Unreachble statement.


        eg.
        final int a=10,b=20;
        do{
            sop("Hello");
        }while(a>b);
        sop("Hi");
        CTE: Unreachble statement.

        
    



        do{
            sop("Hello");
        }while(true);










        




        
        */
        do while (true) System.out.println("Hello..."); while (false);
    }

    
}
