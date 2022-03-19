package com.exceptionHandling.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        Customized Exception Handling by using try-catch.

        It is highly recommanded to handler exception. The code which may rise an exception is called risky code and we have to define that code inside try block, and corresponding handling code we have to define inside catch block

        try{
            risky code
        }
        catch(Exception e){
            Handling code.
        }

        eg1.
        without try-catch.
        class Test{
            public static void main(String[] args){
                SOP("Statement01..");
                SOP(10/0);
                SOP("Statement03");
            }
        }

        o/p RE Arithmatic Exception:/ by zero.
        Abnormal Termination.
        
        with try-catch.
        class Test{
            main(){
                SOP("Statement1");
                try{
                    SOP(10/0);
                }catch(ArithmaticException e){
                    SOP(10/2);
                }
                SOP("Statement03");
            }
        }

        o/p
        statement1
        5
        statement03



        CONTROL FLOW in Try-catch.
        eg,

        try{
            statement01;
            statement02;
            statement03;
        }catch(X e){
            statement04;
        }
        statement05;


        case01
        If there is not exception.
        normal termination
        statement01
        statement02
        statement03
        statement05

        case02
        If an exception raised at statement02 and corresponding catch block matched.
        statement01
        statement04
        statement05

        case03
        If an exception raised at statement02 and corresponding catch block not matched.
        statement01
        abnormal termination.

        case04
        If exception raised at statement04 or statement05 then it is always abnormal termination.
        

        NOTE:
        Within the try block, if anywhere an exception raised then rest of the try block won't be executed even though we handled the exception.

        Hence, within the try block we have to take only ricky code and length of try block should be as less as possible.

        NOTE02
        In addition to try block, there maybe chance of raising an exception inside catch and finally blocks.
        
        NOTE03.
        If any statement which is not part of try block and raises an exception then it is always abnormal termination.


        Method to print Exception Information.

        Throwable class defines the following methods to print exception information.
        1,methodName
        2,printableformat.

        1,printStackTrace():-
        Name of Exception:Description
        Stack Trace

        2,toString():- 
        Name of Exception:Description.

        3,getMessage():-Description.

        class Test{
            main(){
                try{
                    SOP(10/0);
                }
                catch(ArithmaticException e){

                    e.printStackTrace();1
                    SOP(e); or SOP(e.toString());2
                    SOP(e.getMessage());3
                }
            }
        }
        1 output:- java.lang.ArithmaticException: / by zero
        at Test.main()

        2,java.lang.ArithmaticException:/ by zero

        3,/ by zero.

        Internally default exception handler will use printStackTrace() to print stack trace information to the console.

        Try With multiple catch blocks.

        The way of handling an exception is varied from exception to exception.Hence for every exception type it is highly recommanded to take separate catch block.
        Means try with multiple catch block is always possible and recommanded to use.

        eg.
        try{
            Risky code.
        }catch(Exception e){

        }
        Worst practice.

        eg1
        try{
            Risky code
        }
        catch(ArithmaticException e){
            Perform alternative arithmatic operations.

        }
        catch(SQLException e){
            use mySQL DB instead of oracle DB.
        }
        catch(FileNotFoundException e){
            use local file insteadof remote file.

        }
        catch(Exception e){
            Default exception handler.

        }

        Best Practise.


        Loopholes..

        Loophole01
        ----------

        If try with multiple catch blocks present then the order of catch block is very important. we have to take child first and then parent. otherwise we will get CTE.
        saying Exception XXx has already been caught.

        eg01.
        try{
            Risky code
        }
        catch(Exception e){

        }
        catch(ArithmaticException e){
        }
        CTE: exception Java.lang.ArithmaticException has already been caught.



        eg02
        try{
            Risky code
        }
        catch(ArithmaticException e){

        }
        catch(Exception e){

        }


        We cannot declare two catch blocks for the same exception.Otherwise we will get CTE.

        eg03,
        try{
            risky code.
        }
        catch(ArithmaticException e){
            
        }
        catch(ArithmaticException e){

        } 
        CTE:exception java.lang.ArithmaticException has already been caught.
        

       
        */
    }
}
