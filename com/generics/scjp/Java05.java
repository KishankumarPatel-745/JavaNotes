package com.generics.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        We can declare type parameter either at class level or at method level.

        Declaring type parameter at class level.

        class Test<T>{
            we can use 'T' within this class based on our requirement.
        }

        Declaring type parameter at method level.

        we  have to declare type parameter just before return type.

        class Test{
            public <T>void m1(T ob){

            }
        }

        we can define bounded types even at method level also.

        public <T> void m1()

        where you can take 

        <T extends Number>
        <T extends Runnable>
        <T extends Number & Runnable>
        <T extends Comparable & Runnable>
        <T extends Number & Comparable & Runnable>

        <T extends Runnable & Number>
        NOT VALID 
        first we have to take class and then interface.

        <T extends Number & Thread>
        NOT VALID.
        we cannot extend more than one class.


        Communication with non-Generic code.

        If we send generic object to non-generic area then it starts behaving like non-generic object.Similarly if we send non-generic object to generic area then it start behaving like Generic Object that's the location in which Object present based on that behaviour will be defined.


        eg.
        class Test{
            main(){
                ArrayList<String> l=new ArrayList<String>();

                l.add("Durga");
                l.add("Ravi");
                l.add(10);
                CTE
                m1(l);
                SOP(l);[durga,Ravi,10,10.5,true];
                l.add(1.02);
                CTE
                //Generic area
            }
            public static void m1(ArrayList l){
                l.add(10);
                l.add(10.8);
                l.add(true);
            //Non-Generic Area
            }
        }

        CONCLUSIONS.

        The main purpose of Generics is to provide type-safety and to solve Typecasting problem.

        Type safety and type casting both are applicable at compile time hence generics concept only applicable only at compile time but not at Runtime.
        At the time of compilation, as last step, Generic syntax will be removed and hence for the JVM Generics syntax won't be available.

        Hence the following declarations are equals.

        ArrayList l=new ArrayList<String>();

        ArrayList l=new ArrayList<Integer>();

        ArrayList l=new ArrayList<Double>();

        ArrayList l=new ArrayList();

        eg
        ArrayList l=new ArrayList<String>();
        l.add(10);
        l.add(10.5);
        l.add(true);
        SOP(l);[10,10.5,true]

        The following declarations are equals.

        ArrayList<String> l=new ArrayList<String>();

        ArrayList<String> l=new ArrayList();

        For this ArrayList Object we can add only String type of Objects.


        class Test{
            public void m1(ArrayList<String> l){
                
            }
            --->m1(ArrayList l)
            public void m1(ArrayList<Integer> l){

            }
            ---->m1(ArrayList l)
        }

        CTE:
        name clash:Both methods having same erasure.

        At compile time Steps.
        1,
        compile code normally by considering  generic syntax.

        2,
        remove the Generic Syntax

        3,
        Compile once again resultant code.
        


        */
    }
}
