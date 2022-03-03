package com.languageFundamental.scjp;

public class Java11 {
    public static void main(String[] args) {
        /*
        Local Variable:
        Sometime to meet temparory requirement of the programmer, we can declare variable inside a method/Block/constructor. Such type of variables are called local variable/Temparory Variable/Stack Variable/Automatic Variables.

        Local Variable will be stored inside a stack memory.

        Local Variable will be created,while executing the block in which we declared it. Once block execution completed automatically local variable will be destroyed.Hence the scope of local varible is block inwhich we declared it.

        Scope of local variable is bit dangerous.

        For local variable,JVM wont provide default values, compulsory we should perform initialization explicitly before using that variable, that is if we are not using then it is not required to perform initialization.

        It is not recommanded to perform initialization for local variables inside Logical Blocks because there is not gaurantee for execution of this blocks always at runtime.

        It is highly recommanded to perform initialization at the time of declaration at least with default values.

        The Only applicable modifier for local variable is final.
        by mistake if you are trying to apply any other modifier then we will get compile time error.

        class Test{
            public static void main(string[] args){
                public int x=10;
                private int x=10;
                protected int x=10;
                static int x=10;
                transient int x=10;
                volatile int x=10;
                //CTE: illegal start of expression. in all above cases.

                final int x=10;Valid

            }
        }

        If we are not declaring with any modifier then bydefault it is default modifier but this rule is applicable only for instance and static variable but not for local variable.


        Local Variable Conclusion..

        For instance and static variable, JVM will provide the default value and we are not required to perform initialization explicitly. But for local variable JVM wont provide default values compulsory we should perform initialization explicitly before using that variable.

        Instance and Static Variable can be accessed by multiple threats simantaneously, hence this are not thread-safe.But in the case of local variables for every thread, a separete copy will be created hence local variables are thread-safe.


        Types_Of_Varible ---> is thread-safe?

        instance variable--> no thread-safe
        static variable--> no thread-safe
        local variable--> yes thread-safe

        Every variable in Java should be either instance/static/local.
        Every variable in Java should be either primitive or reference.
        Hence various possible combinations of varible in java are:-
        instance-primitive
        instance-reference
        static-primitive
        static-reference
        local-primitive
        local-reference

        Uninitialized Array :
        class Test{
            int[] x;
            public static void main
            (String[] args){
                Test t=new Test();
                sop(t.x);
                sop(t.x[0]);RE:NPE
            }
        }

        Instance level Array
        1, int[] x;
        sop(obj.x); null
        sop(obj.x[0]); Re:NPE

        2, int[] x=new int[3];
        sop(obj.x);[I@32f1121
        sop(obj.x[0]);0

        Static Level Array
        1,static int[] x;
        sop(x); null
        sop(x[0]); RE:NPE

        2,static int[] x= new int[3];
        sop(x);[I231f12
        sop(x[0]);0

        Local Level Array
        CTE :-variable x might not been initialized.

        int[] x= new int[3];
        sop(x);[I231f12
        sop(x[0]);0
        Once we creates an array every array element bydefault initialized with default value in respective of whether it is instance/static/local array.


        
        JVM wont provide the default value.
        
        */
        // int x;
        // System.out.println(x);//Variable x might not have been initialized.

    }
}
