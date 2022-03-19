package com.exceptionHandling.scjp;

public class Java07 {
    public static void main(String[] args) {
        /*
        Throws.

        In our programm,if there is a possibility of raising checked exception then compulsory we should handle that checked exception otherwise we will get CTE saying
        unreported exception xxx; must be caught or declared to be thrown.

        eg.

        import java.io.*;
        class Test{
            main(){
                Printwriter pw=new Printwriter("abc.txt");
                pw.println("Hello");
            }
        }
        CTE unreported Exception java.io.FileNotFoundException;
        must be caught or declared to be thrown.

        eg2.
        class Test{
            public static void main(String[] args){
                Thread.sleep(10000);

            }
        }
        CTE unreported exception Java.Lang.InterruptedException;
        must be caught or declared to be thrown.

        We can handle this CTE by using following two ways.
        1, By using try-catch
        2, By using throws keyword.

        1, By using try-catch block.
        class Test{
            main(){
                try{
                    Thread.sleep(10000);
                }catch(InterruptedException e){

                }
            }
        }

        2,By using throws keyword.

        We can use throws keyword to delegrate responsibility of exception handling to the caller(It maybe another method or JVM).
        Then caller method is responsible to handle that exception.
        eg.
        class Test{
            public static void main(String[] args) throws InteruptedException{
                Thread.sleep(1000);
            }
        }
        
        throws keyword required only for checked exceptions and usage of throws keyword for unchecked exception, there is no use/no impact.

        Throws keyword required only to convience compiler and usage of throws keyword doesnot prevent abnormal termination of the programm.

        class Test{
            main() throws InterruptedException{
                doStuff();
            }
            public static void doStuff() throws InterruptedException{
                doMoreStuff();
            }
            public static void doMoreStuff() throws InterruptedException{
                Thread.sleep(10000);
            }
        }

        In the above programm, If we remove at least one throw statement then code won't compile.

        throws clause.

        1,
        We can use to delegate the responsibility of exception handling to the caller(it maybe method or JVM).

        2,
        It is required only for checked exception and usage of throws keyword for unchecked exceptions there is no impact.

        3,
        it is required only to convience the compiler and usage of throws doesnot prevent abnormal termination of programm.

        CASE01

        We can use throws keyword for method and constructor but not for classes.

        eg.
        class level not valid.
        class Test throws exception{
            Test() throws exception {

            }
            public void m1() throws exception{

            }

        }

        CASE02
        We can use throws keyword only for throwable types.
        If we are trying to use for normal java classes then we will get CTE.
        saying incompatible type.

        class Test{
            public void m1() throws Test{

            }
        }
        CTE: incompitable types
        found:Test
        required:Java.Lang.Throwable

        class Test extends RuntimeException{
            public void m1() throws Test{

            }
        }

        CASE03
        class Test{
            main(){
                throw new Exception();//checked
            }
        }
        CTE:unreported exception java.Lang.Exception must be caught or declared to be thrown


        class Test{
            main(){
                throw new Erro();//Unchecked
            }
        }
        RTE: Exception in thread "main" Java.Lang.Error
        at Test.main()

        CASE04

        Within the try block, if there is no chance of raising an exception then we cannot write catch block for that exception otherwise we will get CTE saying Exception xxx is never thrown in body of corrspondin try statement.


        But this rule is appplicable only for fully checked exceptions.

        eg1.
        class Test{
            main(){
                try{
                    SOP("Hello");
                }catch(ArithmaticException e){
                    //unchecked
                }
            }
        }
        o/p Hello

        eg2.
        class Test{
            main(){
                try{
                    SOP("Hello");
                }catch(Exception e){
                    //Partially checked
                }
            }
        }
        o/p Hello

        eg3.
        class Test{
            main(){
                try{
                    SOP("Hello");
                }catch(Error e){
                    //unchecked
                }
            }
        }
        o/p Hello

        eg4.
        class Test{
            main(){
                try{
                    SOP("Hello");
                }catch(IOException e){
                    //Fully Checked
                }
            }
        }
        CTE exception java.io.IOException is never thrown in body of correspomding try statement

        eg5.
        class Test{
            main(){
                try{
                    SOP("Hello");
                }catch(InterruptedException e){
                    //Fully Checked
                }
            }
        }
        CTE exception java.lang.InterruptedException is never thrown in body of correspomding try statement









        */
    }
}
