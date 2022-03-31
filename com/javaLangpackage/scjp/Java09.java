package com.javaLangpackage.scjp;

public class Java09 {
    /*
    parseXxx() methods.

    We can use parseXxx method to convert String to primitive.

    form01.
    Every wrapper class except character class contains the following parceXxx() method.
    To find primitive for the given String Object.

    public static primitive parseXxx(String s);

    eg.
    int i=Integer.parseInt("10");
    double d=Double.parseDouble("10.5");
    boolean b=Boolean.parseBoolean("true");

    form02

    Every integral type wrapper class(Byte,Short,Integer,Long) contains the following parseXxx() method to convert specified radix string to primitive.

    public static primitive parseXxx(String s,int radix);

    The allowed range of radix is : 2 to 36

    eg.
    int i=Integer.parseInt("1111",2);
    SOP(i);//15

    String to primitive ==> parseXxx() method.

    toString() method.

    We can use toString() to convert wrapper Object or primitive to String.

    form01

    Every wrapper class contains the following toString() to convert wrapper Object to String.
    Public String toString();

    It is the overridding version of Object class toString() method.

    Whereever we are trying to print wrapper Object reference internally this toString() will be called.

    eg.
    Integer i=new Integer(10);
    String s=I.toString();
    SOP(s);//10
    SOp(i);//10

    form02

    Every wrapper class including Character class contains the following static toString() to convert primitive to String.

    public static String toString(primitive p);

    eg.

    String s=Integer.toString(10);
    String s=Boolean.toString(true);
    String s=Character.toString('a');

    Form 03

    public static String toString(primitive p,int radix);

    only availble in Integer and Long class.

    to convert primitive to specified radix string.

    The allowed range of radix is 2 to 36;

    eg.
    String s=Integer.toString(15,2); "1111"


    form 04

    toXxxString() methods.

    Integer and Long classes contain the followinf toXxxString().

    public static String toBinaryString(primitive p);

    public static String toOctalString(primitive p);

    public static String toHexString(primitive p);

    eg.
    String s=Integer.toBinaryString(10);
    SOP(s); 1010

    String s=Integer.toOctalString(10);
    SOP(s); 12

    String s=Integer.toHexString(10);
    SOP(s); a

    to convert wrapper object/Primitive to String ==>toString() method.


    Dancing between String,Wrapper Object and primitive.


    REFER Image.


    Partial Hierarchy of Java.Lang Package.

    Refer Image.

    Conclusion.

    The wrapper classes,which are not child class of Number are Boolean and Character.

    The wrapper classes,which are not direct child class of Object are Byte,Short,Integer,Long,Float,Double.

    String, StringBuffer and StringBuilder and all wrapper classes are final classes.

    In addition to String Object,all wrapper class object also immutable.

    Sometimes Void class is also considered as Wrapper class.

    Void class.

    It is a final class and it is a direct child of Object.

    It doesn't contain any methods and it contains only one variable.

    Void.TYPE

    In general, we can use Void class in reflection to check whether the method return type is void or not.

    eg.
    if(getMethod("m1").getReturnType()==Void.TYPE){

    }

    Void is the class representation of void keyword in Java.
    

    */
}
