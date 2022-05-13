package com.development.scjp;

public class Java01 {
    public static void main(String[] args) {
        /*
        Development...

        javac 

        we can use javac command to compile a single and group of java source files.

        javac [options] Test.java

        javac  [options] A.java B.java C.java

        javac [options] *.java

        various options 

        -version 
        -d
        -source
        -verbose
        -cp/-classpath

        java command 

        to run a java class file.

        we can use java command to run a single class file.

        java [options] Test A B C


        A
        B
        C is a command line argument.

        various options 

        -version
        -D
        -cp/-classpath
        -ea/-esa/-dsa/-da


        note.
        we can compile any number of source file at a time but we can run only one .class file at time.

        classpath..
        classpath describes the location, where required .class files are available.
        
        java compiler and JVM will use classpath to locate required .class file.

        By default JVM will always searches in current working directory for the required .class file.
        If we set classpath explicitly then JVM will search in our specified classpath location and JVM won't search in CWD.

        ways to set classpath..

        we can set the classpath in the following 3 ways.

        1,
        By using environment variable classpath,
        
        This way of setting classpath is permanent and will be preserve across system restart.

        whenever we are installing a permanent software in our system then this approach is recommanded.

        2,
        At command prompt level by using set command.

        set classpath=c:\durga_classes;

        This way of setting classpath will be preserved only for particular command prompt. once command prompt closes automatically classpath will be lost.

        3,
        At command level by using -cp option.

        Java -cp c:\durga_classes Test;

        This is way of setting classpath will be preserved only for particular command only. once  command execution completes automatically classpath will be lost.

        Among three ways of setting classpath, setting classpath at command level is recommanded.
        Because depandant classes are varied from command to command.

        Once we set the classpath we can run our programm from any location(using -cp command.).

        https://github.com/KishankumarPatel-745/JavaNotes

        Once we set classpath JVM won't search in CWD and it will always search in specified class path location only.

        eg01.

        class Test{
            main(){
                SOP("classpath demo..");
            }
        }

        c:\durga_classes>javac Test.java

        c:\durga_classes>java Test
        o/p classpath demo

        c:\> java Test
        RTE: NoClassDefFoundError:Test

        c:\> java -cp c:\durga_classes Test
        o/p
        classpath demo..

        D:\>java -cp c:\durga_classes Test
        o/p
        classpath demo..

        E:\> java -cp c:\durga_classes Test
        o/p
        classpath demo..

        c:\durga_classes> java -cp E: Test;

        RTE: NoClassDefFoundError:Test.

        c:\durga_classes> java -cp .; E: Test;
        o/p 
        claspath demo..


        eg.

        c: AStudent.class

        public class AStudent{
            public void m1(){
                SOP("i want job immediately.");
            }
        }

        D: ItIdustry.class

        public class ItIndustry{
            main(){
                AStudent a1=new AStudent();
                a1.m1();
                SOP("you will get soon!!");
            }
        }

        c:\>javac AStudent.java
        D:\>javac ItIdustry.java

        CTE :- cannot find symbol
        symbol:class AStudent
        location:class ItIndustry

        D:\> javac -cp c:ItIndustry.java

        D:\> java ItIndustry
        RTE: NoClassDefFoundError:AStudent

        D:\> java -cp c: ItIndustry
        RTE: NoClassDefFoundError:ItIndustry

        D:\> java -cp .;c: ItIndustry

        E:\> java -cp D:;C: ItIndustry



        refer images for example.

        conclusion..
        if any location created because of package statement this location should be resolved by using import statement.
        And base package location, we have to update in classpath.

        Compiler will check only one level depandancy where as JVM will check all level of depandancy.

        In classpath the order of location is important and JVM will always consider from left to right untill required match available.

        eg.

        c: 
        public class Nagavalli{
            main(){
                SOP("c:nagavalli");
            }
        }

        D: 
        public class Nagavalli{
            main(){
                SOP("D:nagavalli");
            }
        }

        E: 
        public class Nagavalli{
            main(){
                SOP("E:nagavalli");
            }
        }

        java -cp D:;C:;E: Nagavalli

        o/p D:Nagavalli

        java -cp E:;C:;D: Nagavalli

        o/p E:Nagavalli
















        */
    }
    
}
