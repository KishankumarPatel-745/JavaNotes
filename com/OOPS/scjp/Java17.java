package com.OOPS.scjp;

public class Java17 {
    /*
    
    For any java class,if we are allowed to create only one object such type of class is called singleton class.

    eg.
    Runtime,ServiceLocator.

    Advantage of singleton class.
    If several people have same requirement then it is not recommaded to create a separate object for every requirement.
    We have to create only one object and we can re-use the same object for similar requirement so that performance and memory utilization will be improved.

    This is the central idea of singleton classes.

    eg.

    Runtime r1=Runtime.getRuntime();
    Runtime r2=Runtime.getRuntime();
    ---
    ---
    Runtime r100=Runtime.getRuntime();

    How to create our own singleton classes?

    We can create our own singleton classes.
    For this we have to use private constructor and private static variable and public factory method.

    Approach01
    class Test{
        private static Test t=new Test();

        private Test(){

        }
        public static Test getTest(){
            return t;
        }
    }

    From outside...
    Test t1=Test.getTest();
    Test t2=Test.getTest();

    ----
    ----
    Test t100=Test.getTest();

    Note: Runtime class is internally implemented by using this approach.

    Approach02
    ==============

    class Test{
        private static Test t=null;
        private Test(){

        }
        public static Test getTest(){
            if (t==null){
                t=new Test();
            }
            return t;
        }
    }

    From outside...
    Test t1=Test.getTest();
    Test t2=Test.getTest();

    ----
    ----
    Test t100=Test.getTest();

    At any point of time, we can create only Test object. Hence Test class is singleton class.
    
    class is not final but we are not allowed to create child classes. How it is possible?

    Declare every constructor as private.

    By declaring every constructor as private we can restrict child class construction.

    class P{
        private P(){

        }
    }

    for above class, it is impossible to create child class.
    */


    
}
