package com.languageFundamental.scjp;

public class Java13 {
    public static void main(String[] args) {
        /*
        Command Line Argument and main() method
        Whether class contains main methods or not and whether main method is declared according to requirement or not this things wont be checked by compiler.

        At runtime JVM is responsible to check these things. IF JVM unable to find main method then we will get RunTime Exception NoSuchMethodError:main

        javac Test.java
        java Test
        RE:NoSuchMethodError.

        At runtime JVM always searches for the main method with the following prototype.

        public static void main(String[] args);

        public:- to call by JVM from anywhere.

        static:- without existing object also JVM has to call this method.

        void:- main() method wont return anything to JVM.

        main:- This is the name which is configured inside JVM.

        String[] args:- command-line argument.

        The above syntax is vry strict and if we perform any change we will get the RE:NoSuchMethodError:main()

        Eventhough above syntax is very strict the following changes are acceptable.

        1,Instead of public static, we can take static public. means the order of modifier can be changed. 

        2, we can declare String array in any acceptable form.
        eg.
        main(String[] args)
        main(String []args)
        main(String args[])

        3,Instead of args, we can take any valid java identifier.
        main(String[] args)

        4,we can replace String array with var-arg parameter.
        main(String... args)

        5,we can declare main() method with the following modifier.
        final,
        synchronized,
        strictfp.

        eg
        static final synchronized strictfp public void main(String[] args){
            sop("Valid Main Method");
        }

        Case01:
        Overloading of the main method is possible but JVM is always call String[] args main method only.

        The other Overloaded method we have to call explicitly.
        like normal method call.

        class Test{
            public static void main(String[] args){
                sop("String[]");
            }
            public static void main(int[] args){
                sop("int[]");
            }
        }
        o/p:- String[]

        Case02:
        Inheritance Concept applicable for main() method. Hence  child class doesnot contain main() then parent class main method will be executed.

        class p{
            public static void main(String[] args){
                sopen("parent main");
            }
        }

        class c extends p{

        }

        Java p
        o/p parent main
        Java c
        o/p parent main

        Case03

        It seems below overridding applicable for main() method but it is not overriding but it is method hiding..

        Note:
        For main() method,Inheritance and Overloading concepts are applicable but overriding concept is not applicable.
        instead of overridding , method hidding is applicable.


        class p {
            public static void main(String[] args){
                sopen("parent main");
            }
        }

        class c extends p {
            public static void main(String[] args){
                sopen("child main");
            }

        }

        Java p
        o/p parent main
        Java c
        o/p child main

        */
    }
}
