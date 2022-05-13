package com.assertion.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        AssertionError.

        eg.
        class One {
            main(){
                int assert=10;
                SOP(assert);
            }
        }

        class Two{
            main(){
                int x=10;
                assert(x>10);
            }
        }

        1,
        javac -source 1.3 One.java

        compiles fine but with warning

        2,
        javac -source 1.4 One.java

        CTE.

        3,
        javac -source 1.3 Two.java
        CTE

        4,
        javac -source 1.4 Two.java
        compiles file without warning.


        eg.
        class Test{
            main(){
                boolean assertOn=false;
                assert(assertOn):assertOn=true;

                if(assertOn){
                    SOP("assertOn");
                }
            }
        }

        if assertions are not enabled?

        no o/p

        if assertions are enabled?

        RTE: AssertionError:true



        AssertionError..

        It is a child class of Error and Hence it is unchecked.

        If Assert statement fails(Means argument is false). Then we will get AssertionError.

        Even though, it is legal to catch assertion error but it is not a good programming practise.

        try{
            asser(false);
        }catch{
            SOP("i am stupid, because i am catching AssertionError");
        }
        

        In case of web APPLICATION , if we run java programm in debug mode automatically assert statement is executed.
        
        */
    }
}
