package com.declarationAndAccessModifier.scjp;

class A{
	
    public static void main(String[] args) {
        System.out.println("A class MAIN:A");
    }
}

class B{
	
    public static void main(String[] args) {
        System.out.println("B class MAIN:B");
    }
}

class C{
	
}


class Java01 {
    public static void main(String[] args) {
        /*
        1, Java Source File Structure 
        2, Class level modifier 
        3, Member level moddifier 
        4, Interfaces.

        TOTAL: 20H

        1, Java Source File Structure.

        - A java programm can contain any number of classes,but at most one class can be declared as public.
        -If there is a public class then name of the programm and name of the public class must be matched otherwise we will get compiler time error.

        eg
        class A{
            
        }
        class B{

        }
        class C{

        }

        1,
        if there is no public class then we can use any name and there are no restriction.

        eg.
        A.java, B.java, C.java and kishan.java... any name you could give.

        2,
        If class B is public then name of the program should be B.java, otherwise we will get CTE:- saying class B is public,should be declared in a file named B.java.

        3,
        IF class B and C declared as public and name of the programm is B.java. Then we will get CTE saying class C is public, should be declared in a file named C.java.




        


        */
        
        System.out.println("Java01 MAIN:");
    }
    
    /*
 
    Java A
    o/p:- A class Main:A

    Java B
    o/p:- B class Main:B

    Java C
    o/p:-NoSuchMethodError:main or required to define main() method

    Java Java01
    o/p:- Java01 Main

    java kishan
    o/p: Could not find or load main class com.declarationAndAccessModifier.scjp.kishan


    CONCLUSION:
    whenever we are compiling a java programm, for every class present in the programm. A separate .class file generated for every class preseent in the Java file.
    
    we can compile a java programm(Java source file), but we can run a java .class file.

    whenever we are executing a java class the corresponding class main method will be executed. If the class doesnot contain main() method then we will get runtime exception saying NoSuchMethodError:main

    If the corresponding .class file not avalible then we will get runtime exception saying NoClassDefFoundError.

    it is not recommanded to declare multiple classes in a single source file.

    It is highly recommanded to declare one class per source file. And name of the programm,we have to keep same as class name. The main advantage of this approach is readability and maintainibilty of the code will be improved.

    IMPORT Statement..

    eg.
    class Test{
        public static void main(String[] args){
            ArrayList l=new ArrayList();


            CTE: Cannot find Symbol
            symbol: class ArrayList
            location:class Test
        }
    }

    we can solve this problem by using fully qualify name.

    java.util.ArrayList l=new java.util.ArrayList();

    java.util.ArrayList is a fully qualified name.

    The problem with usage of fully qualified name everytime is it increases length of the code and reduces readability.

    we can solve this problem by using import statement.

    whenever we are writing import statement. it is not required to use fully qualified name everytime.
    we can use short name directly.

    eg
    import java.util.ArrayList;
    class Test{
        public static void main(String[] args){
            ArrayList l=new ArrayList();

        }
    }
    here ArrayList as a short name.

    hence import statement acts as typing shortcut.
    

    */
}

