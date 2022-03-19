package com.exceptionHandling.scjp;

public class Java08 {
    public static void main(String[] args) {
        /*

        Exception Handling Keyword summary

        try: To maintain risky code.

        catch:- to maintain exception handling code.

        finally: to maintain cleanup code

        throw:- to handover our created exception object to the JVM manually.

        throws:- to delegate responsibility of exception handling  to the caller.

        Various Possible Compile Time Error in Exception Handling.

        1, Unreported exception xxx: must be caught or declared to be thrown.

        2, Exception xxx has already been caught.

        3,Exception xxx is never thrown in body of corresponding try statement.
        
        4,unreachable statement

        5, incompatible types
        found:Test
        required: Java.lang.Throwable.

        6,try without catch or finally.

        7,catch without try.

        8,finally without try.

        **Customized or user-defined exception.

        Sometime to meet programmic requirement we can define our own exception. Such type of exceptions are called customized or user defined exceptions.
        eg
        TooYoungException
        TooOldException.
        InSufficientFundException.
        etc.

        every exception is a java class.

        class TooYoungException extends RuntimeException{
            TooYoungException(String s){
                super(s);
            }
        }
        class TooOldException extends RuntimeException{
            TooOldException(String s){
                super(s);
                //To make description availble to default exception handler.
            }
        }

        above is a defining an exception.

        class CustExceptionDemo{
            main(){
                int age=Integer.parseInt(args[0]);
                if(age>60){
                    throw new TooYoungException("Pls wait some more time definitely you will get best match");

                }else if(age<18){
                    throw new TooOldException("your age is already crossed marriage age and no change of getting marriage.");
                }else{
                    SOP("you will get the match soon.");
                }
            }
        }


        NOTE:
        Throw keyword is best suitable for user-defined or customized exception.BUt not for predefined exceptions.

        It is highly recommoanded to define customized exception as unchecked.Means we have to extend RuntimeException but not Exceptions.








        
        */
    }
}
