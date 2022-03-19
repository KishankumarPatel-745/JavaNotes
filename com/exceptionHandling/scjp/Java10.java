package com.exceptionHandling.scjp;

public class Java10 {
    public static void main(String[] args) {
        /*
        Top 10 exception.

        7, IllegalArgumentException.

        It is a child class of RuntimeException and Hence it is unchecked.

        Raised explicitly either by programmer or by API developer to indicate that a method has been invoked with IllegalArgument.
        eg.
        the valid range of thread priority is 1 to 10.
        If we are trying to set the priority with any other value then we will get RuntimeException saying IllegalArgumentException.

        eg.
        Thread t=new Thread();
        t.setPriority(7);
        t.setPriority(16);RTE:IllegalArgumentException

        8,NumberFormatException.

        It is a direct child class of IllegalArgumentException. which is the child class of RuntimeException and hence it is unchecked.
         
        Raised Explictly either by programmer or by API developer to indicate that we are trying to convert String to Number and the string is not properly formatted.

        eg. 
        int i=Integer.parceInt("10");
        int i =Integer.parseInt("ten");
        RTE:NumberFormateException.

        9,IllegalStateException.

        It is a child class of Runtime Exception hence it is unchecked.

        Raised Explicitly either by programmer or by API developer to indicate that a method has been invoked at wrong time.

        After starting of a Thread,we are not allowed to restart the same thread once again. Otherwise we will get RuntimeException saying IllegalThreadStateException.

        eg.
        Thread t=new Thread();
        t.start();

        ---
        ---
        t.start();
        RTE: IllegalThreadStateException.

        10,AssertionError

        It is a child class of Error and Hence it is unchecked.

        Raised explictly by the programmer and API developer to indicate that Assert statement fails.

        eg.
        assert(x>10);
        if x is not greater than 10 then we will get RTE saying AssertionError.

        1,ArrayIndexOutOfBoundsException
        2,
        NullPointerException
        3,
        ClassCastException
        4,
        StackOverflowError
        5,
        NoClassDefFoundError
        6,
        ExceptionInInitializerError

        The above six exception are raised by the JVM and Hence there are JVM Exceptions.

        7,IllegalArgumentException
        8,NumberFormatException
        9,IllegalStateException
        10,AssertionError

        The above four exceptions are raised explicitly either by programmer or by API developer  and hence there are programatic exceptions.



        1.7 VERSION ENHANCEMENT WITH RESPECT TO EXCEPTION HANDLING.

        1, try with resources
        2, multi-catch block

        As a part of 1.7Version the following two concepts are introduced.
        1, try with resources
        2, multi-catch block

        1,try with resources.

        Until 1.6Version,it is highly recommended to write finally block to close resources which are opened as a part of try block.

        eg.
        bufferReader br=null;
        try{
            br=new BR(new FR("input.txt"));
            //use br based on our requirement
        }catch(IOException e){
            //Handling code
        }finally{
            if(br != null){
                br.close();
            }
        }

        The problem in this approach are 
        1, compulsory programmer is required to close resources inside finally block.
        It increases complexity of programming.
        We have to write finally block compulsory and hence it increases length of the code and reduces readibility.
        To overcome above problems, SUN prople introduced try with resources in 1.7 version.
        The main advantage of try with resoruces is whatever resources we have opened as a part of try block will be closed automatically once control reaches end of try block either noramlly or abnormally.
        Hence we are not required to close explicitly so that complexity of programming will be reduce.

        We are not required to write finally block so that length of code will be reduced and readibility will be improved.

        try(BufferedReader br=new BR(new FR("input.txt"))){
            //use br based on our requirement

            //br will be closed automatically once control reaches end of try block either  normally or abnormally and we are not responsible to close explicitly.

        }catch(IOException e){
            //Handling Code
        }

        CONCLUTION about new syntax..

        we can declare multiple resources but this resources should be separated with semicolon.

        try(R1;R2;R3){
            ----
            ----
        }

        eg
        try(FileWriter fw=new FileWriter("output.txt");FR fr=new FR("input.txt")){

        }

        ALL resources should be autocloseable resources.
        A resources said to be autocloseable if corresponding class implements java.lang.AutoCloseable interface.
        
        All IO related resources,DB related resources and network related resources are already implemented AutoCloseable interface.

        Being a programmer we are not required to do anything. Just we should aware the point.

        AutoCloseable interface came in 1.7 version and it contains only one method close();.

        public void close().

        All resource reference variables are implicitly final.Hence within the try block, we cannot perform reassignment otherwise we will get CTE.

        eg.
        import java.io.*;
        class TryWithResources{
            main(){
                try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))){
                    br=new BR(new FR("output.txt"));
                }
            }
        }
        CTE:Error: auto-closeble resource br may not be assigned.

        Until 1.6 version try should be associated with either catch or finally but from 1.7version onword we can take only try with resource without catch or finally.

        try(R){

        } valid.

        SUMMARY.
        The main advantage of try with resources is we are not required to write finally block explicitly.
        Because we are not required to close resources explicitly.
        Hence 1.6 version finally block is just like Hero but from 1.7 version onword,it is a dummy and becomes zero.

        multi catch block.
        Until 1.6 version, eventhough multiple different exception having same handling code for every exception type we have to write a separate catch block. It increases length of the code and reduces readibility.

        eg.

        try{
            ---
            ---
        }catch(ArithmaticException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            SOP(e.getMessage());
        }catch(InterruptedException e){
            SOP(e.getMessage());
        }

        To overcome this problem,SUN people introduced multi-catch block in 1.7 version. According to this, we can write a single catch block that can handle multiple different type of exception.

        eg.
        try{
            --
            --
        }catch(ArithmaticException|IOException e){
            e.printStackTrace();
        }catch(NullPointerException|InterruptedException e){
            SOP(e.getMessage());
        }

        The main advantage of this approach is length of the code will be reduced and readbility will be improved.

        eg.
        import java.io.*;
        class MultiCatchBlock{
            main(){
                try{
                    SOP(10/0);
                    String s=null;
                    SOP(s.length());
                }catch(ArithmaticException|NullPointerException e){
                    SOP(e);
                }
            }
        }
        In the above example,whether raised exception is either ArithmaticException or NullPointerException, the same catch block can listen.

        In multi catch block, There should not be any relation between exception type either child to parent, parent to child or same type.
        Otherwise we will get CTE.

        try{
            ----
            ----

        }catch(ArithmaticException|Exception e){
            e.printStackTrace();
        }
        CTE. Alternatives in a multi-catch statement cannot be related by subclassing.
        

        Exception Propagations.

        Inside a method,if an exception raised and if we are not handling that exception then exception object will be propagated to caller then caller method is responsible to handler exception.

        This process is called exception propagation.


        IMP.
        Rethrowing exception.

        We can use this approach to convert one exception type to another exception type.
        eg.

        try{
            SOP(10/0);
        }catch(ArithmaticException e){
            throw new NullPointerException();
        }






        
        */
    }
}
