package com.generics.scjp;

public class Java03 {
    public static void main(String[] args) {
        /*
        Bounded types.

        We can bound the type parameter for a particular range by using extends keyword.
        Such types are called bounded types.
        eg.
        class Test<T>
        {

        }
        As a type parameter, we can pass any type and there are no restrictions.Hence it is unbounded type.

        eg.
        Test<Integer> t1=new Test<Integer>();

        Test<String> s1=new Test<String>();

        Syntax for bounded Type.

        class Test<T extends X>{

        }

        X can be either class or interface.
        If X is a class then as a Type parameter, we can pass either X type of child classes.

        If X is an interface then as a Type parameter we can pass either X type or its Implementation classes.

        eg1
        class Test<T extends Number>{
            ----
            -----
        }

        Test<Integer> t1=new Test<Integer>(); valid

        Test<String> t2=new Test<String>(); Not valid 

        CTE:Type parameter Java.lang.String is not within its bound.

        eg2

        class Test<T entends Runnable>{
            Test<Runnable> t=new Test<Runnable>();
            Test<Thread> t=new Test<Thread>();

            Test<Integer> t=new Test<Integer>();
            CTE: Type parameter Java.Lang.Integer is not within its bound.

            We can define bounded types even in combinations also.

            Eg,
            class Test<T extends Number&Runnable>{

            }
            As a type parameter, we can take anything,which should be child class of Number and should implements Runnable interface.

            1,
            class Test<T extends Runnable & Comparable> valid

            2,
            class Test<T extends Number & Runnable &Comparable> valid.

            3,
            class Test<T extends Runnable & Number>; Invalid 
            because  we have to take class first followed by interface next.

            4,
            class Test<T extends Number & Thread>
            Invalid 

            because  we cannot extend more than one class simantaneously.


            Note..
            Conclusion.
            we can define bounded types only by using extends keyword and we cannot use implements and super keywords,but we can replace implements keyword purpose with extends keyword.


            class Test<T extends Number>{

            } valid

            class Test<T implements Runnable>{

            } Invalid

            class Test<T extends Runnable>{

            } Valid

            class Test<T super String>{

            } Invalid.

            2.
            As a type parameter 'T', we can take any java identifier but it is convention to use T.

            class Test<T>{

            } valid

            class Test<x>{

            } valid

            class Test<A>{

            } valid

            class Test<durga>{

            } valid


            3,
            Based on our requirement, we can declare any number of Type parameter and all these Type parameter should be separated with comma.

            eg.
            class Test<A,B>{

            } valid

            class Test<X,Y,Z>{

            } valid

            class HashMap<K,V>{

            } valid

            eg,
            HashMap<Integer,String> h=new HashMap<Integer,String>();
            





        }


        
        */
    }
}
