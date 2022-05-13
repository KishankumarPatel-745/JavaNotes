package com.assertion.scjp;
public class Java01 {
    public static void main(String[] args) {
        /*
        Asseration..
        1,
        Introduction.

        very common way of debugging is usage of SOP statement, but problem with SOP is after fixing a bug, compulsory we have to delete SOP statements, otherwise this SOPs will be executed at runtime for every request , which creates performance problem and distrubs server logs.

        To overcome this problem,SUN people introduced assertion concept in 1.4 version.

        The main advantage of assertion when compared with SOPs is , after fixing the bug, we are not required to remove assert statement because they won't be executed by default at runtime.

        Based on our requirement, we can enable and disable assertion and by default assertions are disables.

        Hence the main objective of assertion is to perform debugging.

        Usually we can perform debugging in development and test environment but not in production environment, hence Assertion concept applicable for development and test environment but not for production.


        2,
        Assert as keyword and identifier.

        assert keyword introduced in 1.4 version, hence from 1.4 version onwords, we cannot use assert as an identifier otherwise we will get CTE.

        code..

        class Test{
            main(){
                int assert=10;
                SOP(assert);
            }
        }

        javac Test.java

        CTE: as of release 1.4 assert is a keyword and may not be used as an identifier.(use -source 1.3 of lower to use assert as an identifier).

        javac -source 1.3 Test.java

        compile fine but with warnings.

        java Test 
        o/p 10.


        ques.

        javac -source 1.2 Test.java
        valid

        javac -source 1.3 Test.java
        valid

        javac -source 1.4 Test.java
        Invalid

        javac -source 1.5 Test.java
        Invalid

        Note..

        if we are using assert as identifier and if we are trying to compile according to old version (1.3 or lower ) then the code compiles file but with warning.

        we can compile a java programm according to a particular version by using -source option.


        
        
        */
    }
    
}
