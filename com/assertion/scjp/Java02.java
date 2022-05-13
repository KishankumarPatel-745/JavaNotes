package com.assertion.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        Assert Statement...

        Types of assert statement..

        there are two types of assert statement.

        1, simple version 
        2, Augmented version.

        1, simple version.

        class Test{
            main(){
                int x=10;
                --
                --
                --
                --
                SOP(x);

            }
        }

        syntax.

        assert(b);
        b should be boolean type, if b is true then our assumption satisfied and hence rest of the programm will be executed noramlly.
        If b is false then our assumption fails that is somewhere somthing goes wrong and the programm will be terminated abnormally by raising assertion error.

        Once we got the assertion error, we can analize the code and fix the problem..

        class Test {
            main(){
                int x=10;
                ---
                ---
                ---
                assert(x>10);
                ---
                ---
                SOP(x);

            }
        }

        javac Test.java 

        java Test 
        10

        java -ea Test
        RTE: AssertionError
        
        By default Assert statement won't be executed because Assertion are disable by default.

        But we can enable assertion by using -ea option.


        Augmented Version..
        we can augment some description in assertion error by using augmented assertion.

        Syntax..

        assert(b):e;

        b should be boolean type.
        e can be any type but mostly we can take string type.

        eg.

        class Test{
            main(){
                int x=10;
                ;;;;;;;;;;;;;
                assert(x>10):"Here x value should be > 10 but it is not "
                ;;;;;;;;;;;
                SOP(x)''
            }
        }

        javac Test.java

        java Test
        10

        java -ea Test
        RTE: AssertionError:Here x value should be > 10 but it is not.

        Conclusion..

        assert(b):e;
        e will be executed if first argument is false, that is if the first argument is true then second argument won't be evaluated.


        eg.
        class Test{
            main(){
                int x=10;
                --
                --
                assert(x==10):++x;
                --
                --
                SOP(x);
            }
        }

        javac Test.java

        java Test
        o/p 10

        java -ea Test 
        o/p 10

        conclusion 01

        assert(b):e;
        for the second argument,we can take method call but void return type method call is not allowed otherwise we will get CTE.

        eg.
        class Test{
            main(){
                int x=10;
                --
                --
                assert(x>10):m1();
                --
                --
                SOP(x);
            }
            public static int m1(){
                return 888;
            }

        }

        javac Test.java
        java Test
        o/p 10

        java -ea Test
        AssertionError: 888


        if m1() return type is void then we will get compile time error saying void type not allowed here.
        
        Among two version of assertion, it is recommanded to use augmented version of assertion.
        it is provide more information for debugging.

        */
    }
    
}
