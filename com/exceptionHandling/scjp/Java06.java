package com.exceptionHandling.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        throw VS throws keyword.

        Sometimes we can create exception object explicitly. We can handover the Exception object to JVM manually for this we have to use throw keyword.

        class Test{
            public static void main(String[] args){
                throw new ArithmaticException("/ by zero");
            }
      }
      throw: handover our created exception object to the JVM manually.

      new ArithmaticException("/ by zero");
      creation of ArithmaticException object explicitly.

      Hence the main objective of throw keyword is to handover our created exception object to the JVM manually.

      Hence the result of following two programm is exactly same.
      eg1.

      class Test{
          main(){
              SOP(10/0);
          }
      }

      Exception in thread "main": java.lang.ArithmaticException
      st Test.main()

      In this case, main() is responsible to create an exception object and handover to the JVM.



      eg2
        class Test{
            public static void main(String[] args){
                throw new ArithmaticException("/ by zero");
            }
      }
      Exception in thread "main": java.lang.ArithmaticException
      st Test.main()

      In this case, programmer creating exception object explicitly and handover to the Jvm manually.


      NOTE: best use of throw keyword is for user defined exception or customized exception.

      CASE01
      throw e;
      IF e refers null then we will get NPE.

      eg01.
      class Test{
          static ArithmaticException=new ArithmaticException();
          main(){
              throw e;
          }
      }

      RE: ArithmaticException

      eg2.
      class Test{
          static ArithmaticException e;
          main(){
              throw e;
          }
      }
      RE: NullPointException.

      CASE02
      After throw statement we are not allowed to write any statement directly otherwise we will get CTE saying unreachable statement.

      eg01
      class Test{
          main(){
              SOP(10/0);
              SOP("Hello");
          }
      }
      RTE:AE



      eg02
      class Test{
          main(){
              throw new ArithmaticException();
              SOP("Hello");
          }
      }
      CTE:unreachable statement.


      CASE03
      We can use throw keyword only for throwable types.
      If we are trying to use for normal java Object. We will get CTE.
      saying 
      CTE: incompatible types 
      found:Test
      required:Java.Lang.Throwable

      eg01
      class Test{
          main(){
              throw new Test();
          }
      }
      CTE: incompatible types 
      found:Test
      required:Java.Lang.Throwable

      eg02
      class Test extends RuntimeException{
          main(){
              throw new Test();

          }
      }
      RTE: Exception in thread "main" Test
      at Test.main()
      









        */
    }
}
