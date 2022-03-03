package com.languageFundamental.scjp;
public class Java05 {
    public static void main(String[] args) {
        /*
        char literal:-

        we can specify the char literal in singal quotes.
        eg. char ch ='a';

        eg char ch ="a"; CTE imcompatible types found:java.lang.string required:char.

        eg char ch ='ab'; CTE1 unclosed char literal;
        CTE2 unclosed char literal
        CTE3 not a statement.

        'a'=97; corresponding integer.
        0 to 65535

        we can specify char literal with integral literal, which represent unicode value of character and that integral literal can be specified in decimal,octal and hexadecimal form, but allowed range is 0 to 65535.

        char ch =97;
        sop(ch);
        char ch=0XFace;
        char ch=0777;
        char ch=65535;
        char ch=65536; CTE:- possible loss of precision found int required char.


        we can represent char literal in unicode representation which is nothing but '\uFFFF'
        4 digit Hexadecimal Number.
        char ch='\u0061'
        //unicode representation '\u0061'

        every escape character is a valid char literal.

        char ch='\n';
        char ch='\t';
        char ch='\m'; CTE: illegal escape Character

        in Java * Escape Character And Discription 

        \n- new Line
        \t- Horizontal Tab
        \r- carriage return
        \b- back space
        \f- form feed
        \'- single quote
        \"- double quote
        \\- backlash


        String Literal:
        :- any sequence of characters within double quotes treated as string literal.

        String s="durga";


        1.7 Version enhancement with respect to Literals..

        Binary literal :-
        for integral Datatype, until 1.6V we can specify literal values in the following ways
        decimal,octal, hexadecimal form, but 1.7V onwards, we can specify litaral value even in binary form also.

        binary: 0/1
        literal value should be prefixed with 0b or 0B

        int x=0B111
        sop(x)

        Usage of underscore symbol in numeric literal:
         From 1.7V onwards, we can use underscore symbol between numeric literal.
         eg.
         double d=123456.789;
         double d=1_23_456.789;
         double d=123_456.789;

         advantage :- readability got improved.

         at the time of compilation, this underscore symbol will be removed automatically.
         Hence after compilation, the above line will become.

         double d=123456.789;

         we can use more than one underscore symbol also between digits.
         eg.
         double d=1__23__4_5.469;
         double d=1__2___3__4_5.46__9;


         we can underscore symbol only between the digits if we are using anywhere else we will get compile time error.

         eg
         double d=_12_2.456; CTE
         double d=12_2_.456; CTE
         double d=_12_2.456_; CTE

        left to right assignment is always true..

        byte-->short-->int-->long-->float-->double.


        char-->int-->long-->float-->double.

        8B long value, we can assign to 4B float variable because both are following different memory representation

        eg
        float f=10l;
        sop(f)// output 10.0

        














        */ 
        char ch='\u0062';
        System.out.println(ch);


    }
}
