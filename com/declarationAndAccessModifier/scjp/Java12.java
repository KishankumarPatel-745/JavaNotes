package com.declarationAndAccessModifier.scjp;

public class Java12 {
    public static void main(String[] args) {
        /*
        interface method.

        every method present inside interface is always public and abstract whether we are declaring or not.

        eg
        interface Interf{
            void m1();
        }

        public:To make this method availble to every implementation class

        abstract: Implementation class is responsible to provide implementation.


        Hence inside interface the following method declarations are equal.

        void m1()
        public void m1()
        abstract void m1()
        public abstract void m1()

        as every interface method is always public and abstract we cannot declare interface method with the following modifier.

        private, protected, static, final, synchronized, strictfp, native.

        interface variables.

        An interface can contain variables the main purpose of interface variable is to define requirement level constants.

        Every interface variable is always public static final whether we are declaring or not.

        eg.
        interface Interf{
            int x=10;

            public: To make this variable availble to every implementation class.

            static: without existing object also, implementation class can access this variable.

            final: If one implementation class changes value  then remaining implementation class will be affected to restrict this every interface variable is always final.

            Hence within the interface the following variable declarations are equal.
            eg.
            int x=10;
            public int x=10;
            static int x=10;
            final int x=10;
            public static int x=10;
            public final int x=10;
            static final int x=10;
            public static final int x=10;

            above all are equal.

            As every interface variable is always public static final. we cannot declare with the following modifiers.

            private, protected, transient, volatile.


             For interface variables compulsory we should perform initialization at the time of declaration otherwise we will get CTE.

             EG.
             interface Interf{
                 int x;
             }
             CTE: = expected.

             Inside interface which of the following variable declarations are allowed.
             int x; Invalid
             private int x=10; Invalid
             protected int x=10;Invalid
             volatile int x=10; Invalid
             transient int x=10; Invalid
             public static int x=10; valid

             Inside implpementation class we can access interface variable but we cannot modifies values.

             interface Interf{
                 int x=10;
             }

             class Test implements Interf{
                 main(){
                     x=777;
                     sop(x);
                 }
             }
             CTE: Cannot assign a value to final variable x.

             class Test implements Interf{
                 main(){
                     int x=888;
                     sop(x);888
                 }
             }
        }
      
        Interface Naming conflicts.

        Method naming conflicts.
        case01
        If two interfaces contains a method with same signatures and same return type then in the implementation class we have to provide implementation for only one method.

        If two interfaces contain a method with the same name but different argument types then in the implementation class we have to provide implementation for both methods.
        These methods act as overloaded methods.
        eg.
        interface Left{
            public void m1();
        }
        interface Right{
            public void m1(int a);
        }

        class Test implements Left,Right{
            public void m1(){}
            public void m1(int i){}
            //overloaded method.

        }

        If two interfaces contains a method with the same signature but different return type then it is impossible to implement both interfaces simantaneously (if return types are not co-variaent).

        eg.
        interface Left{
            public void m1();
        }
        interface Right{
            public int m1();
        }

        we cannot write any java class which implements both interfaces simantaneously.
        
        Is a java class can implement any number of interfaces simantaneously?

        Yes except a particular case.
        If two interfaces contain a method with the same signature but different type then it is impossible to implement both interfaces simantaneously.


        INTERFACE VARIABLE NAMING CONFLICTS.
        Two interface can contain a variable with the same name and there maybe a change of variable naming conflict, but we can solve this proble by using interface names.

        eg.
        interface Left{
            int x=777;
        }
        interface Right{
            int x=999;
        }
        class Test implements Left,Right{
            main(String[] args){
                //SOP(x); reference to x is ambiguous.

                SOP(Left.x);777
                SOP(Right.x);999
            }
        }


        */
    }
}
