package com.operatorAndAssignment.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        Assignment Operator..
        int x=10; simple assignment
        
        chain assignment
        int a,b,c,d;
        a=b=c=d=20;
        Correct....

        We cannot perform chained Assignment directly at the time of declaration.
        eg.
        int a=b=c=d=10;CTE cannot find symbol varible b location:class test

        int b,c,d;
        int a=b=c=d=20;Valid


        Compound Assignment Operator.
        Sometime Assignment operator mixed with someother operator such type of assignment operators are called compound assignment operator.
        eg.
        int a=10;
        a+=20;
        sop(a);//30

        the following are all possible compound assignment operators in JAVA.
        +=,-+,*=./=,%=
        &=,|=,^=
        >>=,>>>=,<<=
        
        In the case of compound assignment 
        internal type casting will be performed automatically.
        eg.
        byte b=10;
        b=b+1;
        sop(b);CTE possible loss of precision.

        byte b=10;
        b++; or b+=1;
        sop(b);
        internal type casting will be performed automatically.


        Conditional Operator(?:)

        a++; ++a; unary operator.
        a+b; binary operator.
        a>b?'a':'b'; ternary operator.

        The only possible ternory operator in Java is conditional operator.

        syntax:
        int x=(10<20)?30:40;
        sop(x);

        we can perform nesting of conditional operator also.
        int x=(10>20)?30:((40>50)?60:70);
        sop(x);//70

        new Operator.
        To create an object.
        we can use new operator to create object.
        eg.
        Test t=new Test();

        NOte..
        After creating a object, construstor will be executed to perform initialization of an object.
        hence constructor is not for creation of an object.it is for initialization of an object.

        in java, we have only new keyword but not delete keyword, because destruction of an useless object is responsibility of an garbage collector.

        [] Operator..
        we can use this operator to declare and create arrays.
        eg
        int[] x=new int[10];


        Test t=new Test();


        
        */
    }
    
}
