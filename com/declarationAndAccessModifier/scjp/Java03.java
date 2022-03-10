package com.declarationAndAccessModifier.scjp;

public class Java03 {
    public static void main(String[] args) {
        /*
        Explain about System.out.println();

        class Test{
            static String s="java";
        }

        Test.s.length();

        ->Test is class name
        ->s is a static variable present in Test class of the type java.lang.String
        ->length() is a method present in String class

        class System{
            static PrintStream out;

        }

        System.out.println();

        -->System-> is a class present in java.Lang package.
        -->out -> is a static variable in System class of type PrintStream.
        -->println()--> is a method present on the PrintStream class.

        out is a static variable present in System class hence we can access by using class name System.
        But whenever we are writing static import it is not required to use class name and we can access out directly.

        import static java.lang.System.out;
        class Test{
            public static void main(String[] args){
                out.println("Hello");
                out.println("Hi");
            }
        }
        output: Hello
        Hi.

        eg. Ambiguity in Code.
        import static java.lang.Integer.*;
        import static java.lang.Byte.*;

        public class Test{
            public static void main(String[] args){
                sop(MAX_VALUE);
            }
        }
        CTE:reference to MAX_VALUE is ambiguous.

        While resolving static member,compiler will always consider the precedence in the following order.
        1,Current class static member
        2,Explicit Static Import
        3,Implicit Static Import

        eg
        import static java.lang.Integer.MAX_VALUE;---2
        import static java.lang.Byte.*;---3

        public class Test{
            static int MAX_VALUE=999; ---1
            public static void main(String[] args){
                sop(MAX_VALUE);
            }
        }

        output:999
        
        If we comment line 1 then explicit static import will be considered.Hence Integer class max value is considered.

        In this case the output is 2147483647.

        If we comment both lines 1 and 2,then implicit static import will be considered output-->127[Byte class max value].


        NORMAL IMPORT
        1,Explicit import 
        syntax:
        import packageName.className;

        eg.
        import java.util.ArrayList;

        2,Implicit Import 
        syntax:
        import packageName.*;

        eg.
        import java.util.*;

        STATIC IMPORT
        1,explicit static import..
        syntax:
        import static packageName.className.staticMember;

        eg:
        import static java.lang.Math.sqrt;
        import static java.lang.System.out;

        2,Implicit Static Import.
        syntax:
        import static package.clasaName.*;

        import static java.lang.System.*;
        import static java.lang.Math.*;

        To packages contains a class/Interface woth the same name is very rare,Hence ambiguity problem is also very rare in normal import.

        But two classes/Interface contains a variabel/method with same name is very common. Hence ambiguity problem is also very common problem in static import.

        Usage of static import reduces readbility and creates confusion.

        Hence if there is no specific requirement then it is not recommoended to use static import.

        Different between normal import and static import.

        we can use normal import to import class/Interfaces of a particular package.
        Whenever we are writing normal import. it is not required to use fully qualified name and we can use short name directly.

        We can use static import to import static member of a particular class/interface.
        Whenever we are writing static import it is not required to use class name to access static member and we can access directly.

        

        

        */
    }
    
}
