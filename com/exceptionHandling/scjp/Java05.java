package com.exceptionHandling.scjp;
/**
 * Java05
 */
public class Java05 {

    public static void main(String[] args) {
        /*
        final:
        final is a modifier applicable for classes,methods and varibles.
        IF a class declared as final then we cannot extends that class, means we cannot create child class for that class.
        Means inheritance is not possible for final classes.

        If a method is final then we cannot override that method in the child class.

        If a variable declared as final then we cannot perform reassignment for that variable.

        2,finally.
        finally is a block always associated with try-catch to maintain clean-up code.

        try{
            risky code
        }
        catch(Exception e){
            Handling code
        }
        finally{
            cleanup code
        }

        The specially of finally block is it will be executed always irrespective of whether exception is raised or not, and whether handled or not handled.

        finalize()
        finalize() is a method always invoked by Garbage Collector just before destroying an object to perform clean-up activies.

        Once finalize() method completes immediately GC can destroy that object.

       NOTE:
       finally block is responsible to perform clean-up activity related to try block.Means whatever resources we have opened as a part of try block will be closed inside finally block.

       Whereas finalize() is responsible to perform clean-up activies related to object.Means whatever resources associated with object will be deallocated before destroying an object by using finalize().


       Various possible combinations of try-catch finally.

    
       In try-catch-finally order is important.
       Whenever we are writing try compulsory we should write either catch or finally otherwise we will get compile-time-error.
       That'is try without catch or finally is invalid.

       Whenever we are writing catch block compulsory try block must be required means catch without try is invalid.
       Whenever we are writing finally block compulsory we have to write try block. means finally without try is invalid.

       Inside try-catch-finally block we can declare try-catch and finally blocks.Nesting of try-catch-finally is allowed.
       
       For try-catch-finally block curly braces are mandatory.

       1,
       try{
           
       }
       catch(X e){

       } Valid

       2,
       try{
           
       }
       catch(X e){

       } 
       catch(Y e){
           
       } Valid

       3
       try{
           
       }
       catch(X e){

       } 
       catch(X e){
           
       } Invalid
       CTE: exception X has already been caught.

       4,
       try{
           
       }
       catch(X e){

       }finally{

       } valid

       5,
       try{

       }finally{

       } valid

       6,
       try{

       }catch(X e){

       }try{

       }catch(Y e){
           
       } valid

       7,
       try{

       }catch(X e){

       }try{

       }finally{

       }valid

       8,
       try{

       }
       CTE:try without catch or finally.

       9,
       catch(X e){

       }CTE catch without try

       10,finally{

       }
       CTE:finally without try

       11,
       try{

       }finally{

       }catch(X e){

       }CTE:catch without try

       12,
       try{

       }
       SOP("Hello");
       catch(X e){

       }
       CTE01:try without catch or finally.
       CTE02:catch without try.

       13,
       try{

       }catch(X e){

       }
       SOP("Hello");
       catch(Y e){

       }
       CTE: catch without try.

       14,
       try{

       }catch(X e){

       }
       SOP("Hello");
       finally{

       }
       CTE:finally without try

       15,
       try{
           try{

           }catch(X e){

           }

       }catch(X e){

       } valid

       16,
       try{
           try{

           }
       }catch(X e){

       }
       CTE: try without catch or finally.

       17,
       try{
           try{

           }finally{

           }
       }Catch(X e){

       } valid

       18,try{

       }catch(X e){
           try{

           }finally{

           }
       } valid

       19,try{

       }catch(X e){
           finally{

           }
       }
       CTE:finally without try.

       20,
       try{

       }catch(X e){

       }finally{
           try{

           }catch(X e){

           }
       } valid

       21,
       try{
           
       }catch(X e){

       } finally{
           finally{

           }
       }
       CTE:finally without try.

       22,
       try{

       }catch(X e){

       }finally{

       }finally{
           
       }
       CTE:finally without try.

       23,
       try
         SOP("try");
       catch(X e){
           SOP("catch");
       }finally{

       } Invalid

        24,
       try
         SOP("try");
       catch(X e)
           SOP("catch");
       finally{

       } Invalid

       25,
       try{
           SOP("try");
       } 
       catch(X e){
           SOP("catch");
       }finally
            SOP("Finallu"); 
            
        Invalid






        */
    }
}