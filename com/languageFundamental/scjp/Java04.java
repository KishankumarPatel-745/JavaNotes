package com.languageFundamental.scjp;
public class Java04 {
    public static void main(String[] args) {
        /*
        Literals..:- any constant value, which can be assigned to the varible, is called literal.
        eg int x=10; 10 is a Integral literal.

        Integral Literals:
        for integral datatypes:- (bype,short,int,long) we can specify literal values in the following ways.

        Decimal Literal:base10(0-9)
        eg.: int x=10; decimal Form.

        Octal Literal:base8(0-7)
        eg:- literal value should be prefix with 0.
        eg: int x= 010; octal form

        HexaDecimal Form:base16(0-9 a-f)
        for extra digit(a-f), we can use both lower and upper case character.
        this is one of very few areas, where Java is not case sensitive.
        the literal should be prefixed with 0X or 0x..
        eg int x= 0X10;

        This are only possible way to specify literal value for integral Datatypes..
        By Default, every integral literal is of int type, but we can specify explicitly as a long type by suffixed with l or L.

        int x=10;
        long l=10l;
        int x=10l; CTE Loss of precision found: long required:int.


        There is no direct way to specify byte and short literal expllicitly but indirectly we can specify. when we are assigning integral literal to the byte variable and the value is within the range of byte then compiler treats it automatically byte literal, similarly short literal also..

        eg
        byte b =10;
        byte b=127;
        byre b=128; CTE Possible Loss of Precision found:int required:byte

        Floating Point Literal..
        by Default every floating point literal is of double type, hence we cannot assign directly to the float variable.
        But we can specify floating point literal as a float type by suffixed with the f of F.
        eg. float f=123.21; CTE possible Loss of Presicion

        float f=123.21f;
        double d=123.21;

        We can specify explicitly Floating point literal to the Double type by suffixed with d or D.

        of course this convention is not required.
        double d =123.2121D;
        float f=123.23d; CTE Possible Loss of Presicion.

        we can specify floating point literal only in decimal form and we cannot specify in octal and hexadecimal forms.

        double d=123.21;
        double d=0123.21; decimal not octal lit.

        double d=0x13.21;CTE: malformed floating point literal



        we can assign integral literal directly to floating point variable and that integral literal can be specified either in decimal, But not in octal or hexadecimal form.

        eg.
        double d=0786; it is a decimal value not a octal.

        double d =0xFace; working because 0xFACE is a integral literal. 

        double d=0xFace.0: malformed floating point literal 

        
        we cannot assign floating point literal to integral types.
        eg.
        double d =10;

        int x=10.0; CTE possible loss of presicion.

        we can specify floating point literal even in exponential form(scitific notation)
        eg.
        double d=1.2e3;  1.2*10^3 valid
        float f=1.2e4f;

        boolean Literals:-- true or false.

        The only allowed values for boolean datatype are true/false.

        boolean b=true;

        boolean b=0; CTE incompatible types:
        
        boolean b=True; CTE cannot find symbol

        boolean b="true"; CTE incompatible types.

        int x =0;
        while(x){
            sopln(x)
        }
        CTE: incompatible types found:int
        required:boolean


       


        */

        int x=10; //decimal
        int xy=010; //octal
        int xz=0x10; //hexa
        System.out.println(x+".."+"--"+xy+"--"+xz);
        //but jvm prints in decimal form..
        

    }
}
