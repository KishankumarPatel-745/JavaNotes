package com.javaLangpackage.scjp;

public class Java08 {
    public static void main(String[] args) {
        /*
        Wrapper classes..

        The main objective of wrapper classes are 
        1,
        To wrap primitive into Object form, so that we can handle primitive also just like Objects.
        
        2,
        To define several utility methods, which are requied for the primitives.

        Constructor.

        ALmost all wrapper classes contains two constructor 
        
        one can take corresponding primitive as an argument and the other can take String as argument.


        eg01
        Integer I=new Integer(10);
        Integer I=new Integer("10");

        eg02
        Double d=new Double(10.3);
        Double d=new Double("10.3");

        If String argument not representing a number then we will get RTE.
        saying 
        NumberFormatException 

        Integer i=new Integer("ten");
        RTE: NumberFormatException.

        Image Table for Wrapper Class and its corresponding constructor arguments

        Float class contains three constructor with float,double and string argument.

        eg,
        Float f=new Float(10.5f);
        Float f=new Float("10.5f");
        Float f=new Float(10.5);
        Float f=new Float("10.5");

        Character class contains only one constructor,which can take char argument.

        eg.
        Character ch=new Character('a'); valid

        Character ch=new Character("a"); Invalid

        Boolean class contains two constructor. One can take primitive as an argument and the other can take string argument.

        If we pass boolean primitive as an argument the only allowed values are true and false.Where case is important and content is also important.

        eg.

        Boolean b=new Boolean(true); valid
        Boolean b=new Boolean(false); valid

        Boolean b=new Boolean(True); invalid

        Boolean b=new Boolean(durga); invalid..

        Boolean x=new Boolean("yes");
        Boolean y=new Boolean("no");
        SOP(x.equals(y));true

        If we are passing String Type as an argument then case and content both are not important.
        If the content is case insensetive String of true then it is trited as true otherwise trited as false.

        eg.
        Boolean b=new Boolean("true"); true
        Boolean b=new Boolean("True"); true
        Boolean b=new Boolean("TRUE"); true
        Boolean b=new Boolean("malaika"); false
        Boolean b=new Boolean("mallika"); false
        Boolean b=new Boolean("jaria"); false

        In all wrapper classes,toString() is overridden to return content directly.


        In all wrapper classes, .equals() method is overridden for content comparison.

        Utility Methods.

        1,
        valueOf();

        2,
        XXXValue();

        3,
        parseXxx();

        4,
        toString();

        
        valueOf() method

        We can use valueOf() methods to create Wrapper Object for the given primitive or String.
        
        form01.
        Every Wrapper class except Character class contains a static valueOf() method to create Wrapper object for the given String.

        public static wrapper valueOf(String s);

        Integer i=Integer.valueOf("10");

        Double i=Double.valueOf("10.5");

        Boolean i=Boolean.valueOf("durga");

        form02.

        Every integral type wrapper class(Byte,Short,Integer,Long) contains the following valueOf() method to create wrapper Object for the given specified redix String.

        public static wrapper valueOf(String s,int radix);

        eg.
        Integer i=Integer.valueOf("100",2);
        SOP(i);//4
        
        Integer i=Integer("101",4);
        SOP(i);//17

        The allowed range of radix is : 2 to 36.

        form03.

        Every wrapper class including character class contains a static value of method to create wrapper object for the given primitive.

        public static wrapper valueOf(primitive p);

        eg.
        Integer i=Integer.valueOf(10);
        Character ch=Character.valueOf('a');
        Boolean b=Boolean.valueOf(true);


        primitive/String --->valueOf--> wrapper object.


        xxxValue() method.

        We can use xxxValue() methods to get primitive for the given wrapper Object.

        Every Number type wrapper class(Byte,Short,Integer,Float,Long,Double) contains the following 6 method to get primitive for the given wrapper Object.


        public byte byteValue();
        public short shortValue();
        public int intValue();
        public long longValue();
        public float floatValue();
        public double doubleValue();

        eg.
        Integer i=new Integer(130);
        SOP(i.byteValue()); -126
        SOP(i.shortValue()); 130
        SOP(i.intValue()); 130
        SOP(i.longValue()); 130
        SOP(i.floatValue()); 130.0
        SOP(i.doubleValue()); 130.0

        charValue();

        Character class contains charValue() to get the char primitive for the given Character Object.

        public char charValue();

        Character ch=new Character('s');
        char c=ch.charValue();
        SOP(c); 's'

        booleanValue() method

        Boolean class contains booleanValue() to get the boolean primitive for the given object.

        public boolean booleanValue();

        eg.
        Boolean b=Boolean.valueOf("durga");
        boolean b=b.booleanValue();
        SOP(b);//false

        In total 38 (6*6+1+1) xxxValue() are possible.

        Wrapper Object-->xxxValue( )-->primitive type.

        







        
        */
    }
}
