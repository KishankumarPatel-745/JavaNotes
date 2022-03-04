package com.operatorAndAssignment.scjp;

public class Java04 {
    public static void main(String[] args) {
        //Short Circuit Operator
        /*
        Thers are exactlt same as bitwise operator except the following differences

        both arguments should be evaluated always,low performance,applicable for both boolean and integral type-->bitwise 

        second argument is optional,high performance,applicable only for boolean but not for integral types-->short

        NOTE:-

        x&&y:- y will be evaluated if x is true. means if x is false then y wont be evaluated.

        x||y:- y will be evaluated if x is false.means if x is true then y wont be evaluated.


        TYPE CAST Operator.
        two type of type casting
        1,implicit type casting
        1,explicit type casting

        int x='a';
        sop(x); /97
        //Internally Compiler we do the type convertion implicitly this is known as implicit type casting.
        eg.
        double d=10; int to double implicit convertion by compiler.
        sop(d);


        Implicit type casting
        1,Compiler is responsible to perform implicit typecasting.

        2,whenever we are assigning smaller datatype to bigger datatype variable implicit type casting will be performed.

        3, it is also known as widening or upcasting.

        4,There is no loss of information in this type casting.

        following are various possible conversion..
        byte-short-int-long-float-double

        char-int-long-float-double

         eg.
        double d=10; int to double implicit convertion by compiler.
        sop(d);

        Explicit TypeCasting.

        eg.
        int x=130;
        byte b=x;
        CTE:possible loss of precision

        byte b=(byte)x; solution.

        1, Programmer is responsible to perform explicit typecasting.

        2, whenever we are assigning bigger datatype variable to smaller datatype values then explicit typecasting will be required.

        3, it is also known as norrowing or downcasting.

        4, There maybe a chance of loss of information.


        The following are various posibility where explict typecasting require.
        double-->float-->long-->int-->

        int x=130;
        byte b=x;
        byte b=(byte)x; //-126

        Wheneven we are assigning bigger datatype values to smaller datatype variable. The most significant bits will be lost. We have to consider LSB(Least Significant Bit).

        eg
        int x=150;
        short s=(short)x;
        sop(s); 150
        byte b=(byte)x;
        sop(b); -106

        If we assign floating point values to the integral type by explicit type casting the digits after the decimal point lost.
        eg.
        double d=130.2321;
        int x=(int)d;
        sop(x); 130
        byte b=(byte)d;
        sop(b); -126


         */
    }
    
}
