package com.OOPS.scjp;

public class Java11 {
    static int i=10;
    static{
        m1();
        System.out.println("Base static Block");
    }
    public static void main(String[] args) {
        /*
        Static Block..
        static block will be executed at the time of class loading. Hence at the time of class loading,if we want to perform any activity we have to define that inside static block.

        At the time of java class loading the corresponding native library should be loaded. Hence we have to define this activity inside static block.

        eg.
        class Test{
            static{
                System.loadLibrary("Native Library Path.");
            }
        }

        eg2 
        After loading every database driver class we have to register driver class with the driver manager.But inside database driver class, there is a static block to perform this activity and we are not responsible to register explicitly.

        class DbDriver{
            static{
                //Register this driver with DriverManager.
            }
        }

        NOTE: Within a class we can declare any number of static block but all this static block will be executed from top to bottom.

        que01.
        Without writing main() method, is it possible to print some statement to the console?

        Yes by using static block.
        eg.
        class Test{
            static{
                SOP("Hello I can print...");
                System.exit(0);
            }
        }
        output:
        Hello I can print...

        que02. without writing main() and static block, is it possible to print some statement to the console?
        
        Yes, OF course. There are mulitple ways.

        way01
        class Test{
            static int x=m1();
            public static int m1(){
                SOP("Hello, I can print");
                System.exit(0);
                return 10;
            }
        }

        way02
        class Test{
            static Test t=new Test();
            {
                SOP("Hello I can print");
                System.exit(0);
            }
        }

        way03
        class Test{
            static Test t=new Test();
            Test(){
                SOP("Hello I can print");
                System.exit(0);
            }
        }


        NOTE**

        From 1.7 version onwords, main() method is mandatory to start a programm execution hence from 1.7 version onwords, with out writin main() method it is impossible to print some statement to the console.


        Static control flow in  parent to child relationship.

        Whenever we are executing child class the following sequence of event will be executed automatically as a part of static control flow.

        1,
        Identification of static members from parent to child.

        2,
        Execution of static variale assignment and static block from parent to child.

        3,
        Execution of only child class main()method.



        NOTE**

        whenever we are loading child class automatically parent class will be loaded but whenever we are loading parent class child class wont be loaded(Because parent class member by default availble to the child class whereas child class member by default wont availble to the parent.)

         */
        m1();
        System.out.println("Base main");
    }
    public static void m1(){
        System.out.println(j);
    }
    static int j=20;

}

class Derived extends Java11{
    static int x=100;
    static{
        m2();
        System.out.println("Derived first static base child");
    }
    public static void main(String[] args) {
        m2();
        System.out.println("Derived main child");
    }
    public static void m2(){
        System.out.println(y);
    }
    static{
        System.out.println("Derived second static Block");
    }
    static int y=200;

}

/*
output: Derived class execution
0
Base static Block
0
Derived first static base child
Derived second static Block
200
Derived main child
*/

/*
output: run Java11 run
0
Base static Block
20
Base main
*/
