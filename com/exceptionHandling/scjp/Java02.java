package com.exceptionHandling.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        DEFAULT EXCEPTION HANDLING

        Inside a method, if any exception occurs the method inwhich it is raised is responsible to create an exception object by including the following information.
        1, Name of Exception
        2, Description of exception.
        3,Location at which exception occurs.(Stack Trace).

        After creating exception object, Method handovers that object to the JVM.

        JVM will check whether the method contains any exception handling code or not.If the method doesnot contain that exception handling code then JVM terminates that method abnormally and removes corresponding entry from the stack.

        Then JVM identifies caller method and checks whether caller method contains any handling code or not.
        If the caller method doesnot contain handling code then JVM terminates that caller method abnormally and removes corresponding entry from the stack.

        This process will be continued untill main method.And if the main() also doennot contain handling code then JVM terminates main() also abnormally and remove corresponding entry from the stack.

        Then JVM handover responsibility of exception handling to default exception handler,which is a part of JVM.

        Default exception handler prints exception information in the following formal and terminates programm abnormally.

        Exception in Thread "xxx" name of exception:Description
        Stack trace.

        eg.
        class Test{
            main(){
                doStuff();
            }
            public static void doStaff(){
                doMoreStuff();
            }
            public static void doMoreStaff(){
                SOP(10/0);
            }
        }

        stack trace 
        doMoreStuff()
        -------------
        doStuff()
        -------------
        main()
        -------------


        Exception in thread "main" java.lang.ArithmaticException:division by 0
        at Test.doMoreStuff()
        at Test.doStuff()
        at Test.main()

        eg02
        class Test{
            main(){
                doStuff();
                SOP(10/0);
            }
            public static void doStaff(){
                doMoreStuff();
                SOP("Hi");
            }
            public static void doMoreStaff(){
                SOP("Hello");
            }
        }
        o/p
        Hello
        Hi
        Exception in thread "main" java.lang.ArithmaticException:division by 0
        at Test.main()
        

        NOTE:
        In a program, at least one method terminates abnormally then the programm termination is abnormal termination.
        If all method terminated normally then only programm termination is normal termination.

        EXCEPTION hirarcy.

        Throwable class acts as root for java exception hirarcy.

        Throwable class defines two child classes 
        1, Exception
        2. Error.

        1,Exception.

        Most of the time, exceptions are caused by our program and these are recoverable.
        for example,if our programm requirement is to read data from remote file located at london.
        At runtime if remote file is not availble, then we will get RTE saying FileNotFoundException.
        If FileNotFoundException occurs,we can provide local file and continue rest of the programm normally.

        try{
            read data from remote file locating at london
        }
        catch(FileNotFoundException e){
            use local file and continue rest of the programm normally.

        }

        2,Error
        Most of the time Errors are not caused by our programm and this are due to leak of system resources.
        Errors are non-recoveable.

        eg.
        If OutOfMemoryError occurs being a programmer we cannot do anything and the programm will be terminated abnormally.

        System admin or server admin is responsible to increase heap memory.

        Refer Image for Exception Hirarcy.
        */
    }
}
