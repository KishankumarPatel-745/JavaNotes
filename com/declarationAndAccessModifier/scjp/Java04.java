package com.declarationAndAccessModifier.scjp;
/**
 * Java04
 */
public class Java04 {

    public static void main(String[] args) {
        /*
        package statement..
        It is a encapsulation mechanism to group related classes and interfaces into a single unit.

        Which is nothing but package

        eg1- all classes and interfaces,which are required for Database operations are grouped into a single module/package, which is nothing but java.sql package.

        eg02:- All classes and interfaces, which are useful for File IO operation are groupped into a separate package,which is nothing but Java.io package.

        The main advantages of packages are 
        1,To resolve naming conflicts.That is unique ID of our components.

        2,It improves modularity of the application.

        3,It improves maintainibilty of the Application.

        4,It provides security for our component.

        Naming convention for packages.
        There is one universally accepted naming convension.That is to use internet domain name in reverse.
        eg
        com.icicibank.loan.housing.Account

        com.icicibank=> Client's internet domain name in return

        loan:- Module name
        housing:- submodule name
        Account:- className.

        eg
        package com.ds.scjp;
        public class Test{
            public void main(String[] args){
                sop("Package Demo");
            }
        }

        1,javac Test.java
        Generated .class file will be placed in current working directory. CWD-->Test.class

        2,Javac -d . Test.java
        -d:- destination to place generated .class file.

        2, . ->current working directory.

        Generated .class file will be placed in corresponding package structure.
        eg.
        CWD->com->ds->scjp->Test.class

        If the corresponding package structure not already availble, then this command itself will create corresponding package structure.

        As destination, insteadOf . we can take any valid directory name.
        eg.
        javac -d F: Test.java

        IF the specified directory not already availble then we will get CTE:
        eg.
        javac -d Z: test.java
        If z directory not availble then we will get CTE saying directory not found 
        If z directory not availble then we will get CTE saying directory not found z:

        At the time of execution, we have to use fully qualified name.
        eg
        java com.ds.scjp.Test
        o/p package demo

        CONCLUSION 01
        ==================
        In any java source file there can be at most one package statement.That is more than one package statement is not allowed otherwise we will get CTE
        class,interface or enum expected.

        eg.
        package pack1;
        package pack2;CTE
        public class A{}

        CONCLUSION 02
        ====================
        In any Java programm, first non-comment statement should be package statement(if it is availble).
        Otherwise we will get CTE.

        eg.
        import java.util.*;
        package pack1;

        public class Test{

        }
        CTE class,interface or enum expected...

        Java Source file structure 

        The following is valid java source file structure.

        Order is important.
        1:package statement; atmost one
        2:import statement;
        any number
        3:class,interface,enum declaration;
        any number

        NOTE: an empty source file is valid java program.
        Hence the following are valid java source file.
        
        Test.java
        package pack1;
        
        Test.java
        import java.util.*;

        Test.java
        package pack1;
        import java.util.*;


        Test.java
        class Test{

        }

        




        2,


        
        */
    }
}