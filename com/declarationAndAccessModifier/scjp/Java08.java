package com.declarationAndAccessModifier.scjp;

public class Java08 {
    public static void main(String[] args) {
        /*
        final variable.

        final instance variable.
        If the value of a variable is varied from Object to Object such type of variable are called instance variable.

        For every object, a separate copy of instance variable will be created.

        For instance variable,we are not required to perform initaialization explicitly JVM will always provide the default values.

        If the instance variable declared as final then compulsory we have to perform the initialization explicitl whether we are using or not. and JVM wont provide default value.

        eg.
        class Test{
            int x;
            main(){
                Test t=new Test();
                SOP(t.x);/0
            }
        }

        eg.
        class Test{
            final int x;
        }

        RULE01
        for final instance variable, compulsory we should perform initialization before constructor completion.

        That is the following are various places for initialization.

        1,at the time of declaration
        eg.
        class Test{
            final int x=10;
        }
        
        2 Inside instance block
        class Test{
            final int x;
            {
                x=10;
            }
        }
        
        3 Inside constructor
        class Test{
            final int x;
            Test(){
                x=10;
            }
        }
        There are the only possible places to perform the initialization for final instance variable.
        If we are trying to perform the initialization anywhere alse then we will get CTE.

        class Test{
            final int x;
            public void m1(){
                x=10;
            }
        }
        CTE: cannot assign a value to final variable x.


        static modifier ..
        If the value of a variable is not varied from Object to Object such type of variable is not recommanded to declare as instance variable.
        We have to declare those variables at class level by using static modifier.

        In the case of instance variable, a separate copy will be created.BUt in the case of static variable. A single copy will be created at class level and shared by every object of that class.

        For statuc variable, It is not required to perform initialization explicitly JVM will provide default value.
        eg.
        class Test{
            static int x;
            public static void main(String[] args){
                sop(x);
            }
        }

        if the static variable declared sa final then compulsory we should perform initialization explicitly ,otherwise we will get CTE.
        and JVM wont provide any default values.
        eg.
        class Test{
            final static int x;
        }
        CTE: variablr x might not have been initialized.
        
        Rule: For final static variable compulsory we should perform initialization before class loading completion.
        means the following are various places for this.

        1, At the time of declaration.
        class Test{
            final static int x=10;
        }

        2 Inside static block
        class Test{
            final static int x;
            static{
                x=10;
            }
        }

        These are the only possible places to perform initialtation for final static variables. IF we are trying to perform initalization anywhere else then we will get CTE

        class Test{
            final static int x;
            public void m1(){
                x=10;
            }
        }
        CTE:cannot assign ..

        final local variable.

        sometimes to meet temporary requirement of the programmer we have to declare variable inside a method,block or constructor such type of variable are called local variable/Temporary variable/ stack variable/ Automatic variable.

        For local variable,JVM wont provide any default value compulsory we should perform initialization explicitly before using that local variable means if we are not using then it is not required to perform initialization for local variable.

        eg.
        class Test{
            main(){
                int x;
                sop("hello");
            }
        }
        o/p:- hello

        class Test{
            main(){
                int x;
                sop(x);
            }
        }
        CTE: variable x might not have been initialized.

        The only applicable modifier for local variale is final.By mistake if we are trying yo apply any other modifier then we will get CTE.
        eg.
        class Test{
            main(){
                public int x=10;
                private int x=10;
                protected int x=10;
                static int x=10;
                transient int x=10;
                volatile int x=10;

                //In all above cases,CTE Illegal start of expression.

                final int x=10;//VALID
            }
        }

        If we are not declaring any modifier then bydefault it is default but this rule is applicable only for instance and static variable but not for local variables.

        formal parameters :
        formal parameter of a method simply acts as local variables of that method.Hence formal parameter can be declared as final.

        If a formal parameter declared as final then within a method we cannot perform reassignment.

        eg.
        class Test{
            main(){
                m1(10,20);
            }
            public static void m1(final int x,int y){
                x=100; CTE cannot assign a value to final variable x.
                y=10;
            }
        }
        */
    }
}
