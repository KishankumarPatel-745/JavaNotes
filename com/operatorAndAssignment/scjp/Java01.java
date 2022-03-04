package com.operatorAndAssignment.scjp;

/**
 * Java01
 */
public class Java01 {
    /*
    ----------------------------
    Agenda..
    1,Arithmatic Operator
    2,String concatenation operator
    3,Relational Operators
    4,Equality Operators
    5,instanceof Operator
    6,bitwise opearator
    7,short circuit operators
    8,type cast operator
    9,assignment operators
    10,condition operator
    11,condition operator
    12,new operator
    13,[] operator
    14,operator precendence
    15,Evaluation order of operands
    16,new Vs newInstance()
    17, instanceof Vs isInstance()
    18,ClassNotFoundException VS NoClassDefFoundError.
    ----------------------------

    1,Increment and Decrement Operator.
    x++,++x,x--,--x
    we can apply increment and decrement operator only for variable but not for constant value.
    if we are apply for constant value then we will get Compile Time Error.
    eg.
    int x=10;
    int y=++10;
    sop(y);CTE unexpected type found:value required:variable


    Nesting of increment and decrement operator is not allowed.
    eg
    int x=10;
    int y=++(++x);
    sop(y);CTE unexpected type found:value required:variable


    For final variable, we cannot apply increment and decrement operator.
    final int x=10;
    x++; CTE cannot assign a value to final varible x.
    sop(x);


    we can apply increment/decrement operator for every primitive type except boolean.

    eg 
    int x=10;
    x++;
    sop(x); 11

    char ch='a';
    ch++;
    sop(ch);'b'

    double d=10.5;
    d++;
    sop(d);//11.5

    boolean b=true;
    b++;
    sop(b);//CTE :- operator ++ cannot be applicable to boolean.

    ✔️Difference between b++ and b=b+1;
    If we apply any arithmatic operator between two variables a and b. the result type is always max(int,type of a,type of b);
   

    byte a=10;
    byte b=20;
    byte c=a+b;int CTE possible loss of precision.
    found:int
    required:byte


    byte c=(byte)(a+b);
    sop(c)
    
    max(int,byte,byte)

    eg
    byte b=10;
    b=b+1;
    sop(b);CTE possible loss of precision found:int required:byte

    solved:- b=(byte)(b+1);


    But in the case of increment and decrement operator,type casting will be performed automatically.

    b++ ==> (type of b)(b+1)
    eg.
    byte b=10;
    b++;
    sop(b);11


    ARITHMATIC OPERATOR(+,-,*,/,%)

    If we apply any arithmatic operator between two variable a and b the result type would be max(int,type of a,type of b).

    byte+byte=int
    byte+short=int
    short+short=int
    byte+long=long
    double+long=double
    float+long=float
    char+char=int
    char+double=double

    eg
    sop('a'+'b');195 int type
    sop('a'+0.89);97.89 double type.
    
    Infinity
    In integral arithmatic(byte,short,int,long), there is no way to represent infinity hence if infinity is a result then we will get RE: ArithmaticException in integral arithmatic.
    SOP(10/0);/RE:Arithmatic Exception.
    but in floating point arithmatic(float,double) there is a way to represent infinity. for this Float and Double classes contains the following two constance.
    POSITIVE_INFINITY
    NEGATIVE_INFINITY
    Hence eventhrough result is infinity we wont get any arithmatic exception in floating point arithmatic.

    sop(10/0.0);INFINITY
    sop(-10.0/0);-INFINITY

    sop(0/0);:-RE:ArithmaticException.
    sop(0.0/0);:- RE: NaN

    NaN:- (Not a Number)
    in integral arithmatic(byte,short,int,long) there is no way to represents undefined result,hence the result is undefined we will get RE saying ArithmaticException.

    sop(0/0); RE:ArithmaticException
    But in floating point arithmatic, there is a way to represent undefined result for this float and double classes contain NaN constant.
    Hence If the result is Undefined we wont get any arithmatic Exception in floating point arithmatic.
    sop(0.0/0);NaN
    sop(-0.0/0);NaN


    NOte:-
    For any x value includin NaN the following expression returns false
    sop(10<Float.NaN)  false
    sop(10<=Float.NaN) false
    sop(10>Float.NaN)false
    sop(10>=Float.NaN)false
    sop(10==Float.NaN)false
    sop(Float.NaN==Float.NaN)false

    For any X value including NaN the following expression returns true.
    sop(10!=Float.NaN) true
    sop(Float.NaN!=Float.NaN) true

    ArithmaticException..
    RE. it is a runtime exception but not compile time error.
    it is possible only in integral arithmatic but not in floating point arithmatic.
    The only operator which cause AE are / and %.

















    */
public static void main(String[] args) {
    
}


    
}