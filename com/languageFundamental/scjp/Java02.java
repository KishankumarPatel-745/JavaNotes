package com.languageFundamental.scjp;
public class Java02 {
    public static void main(String[] args) {
        //DataType.. :- without type you cannot declare a single variable in Java..

        //Strongly Typed programming Language :- every varible and expression has some type.. each and every datatype is clearly defined. every assignment should be checked by compiler for type compatibility..


        /*
        is Java pure Object Oriented language??
        No, it is not.. because several OOps feacture are not satisfied by JAVA like Operator Overloading, Multiple Inheritance,Etc..

        Moreover we are depanding on primitives datatypes, which are non objects..

        Primitive Datatypes.. 8
        Numeric type :- about Number ..--> Integral(byte,short,int,long), Floating Points(float,double)
        Non-Numeric type:- char,boolean..

        -----------
        except boolean and char, remaining datatypes are considered as signed datatypes. because we can represent both positive and negative number.


        1) byte:- 
        size 1 Byte(8 bits).
        MAX= 127
        Min= -128
        Range= -128 to 127.
        in MSB(most significant bit):- 0 - positive and 1 - negative..
        negative number represented in 2's compliment form.
        Application:- byte is best choice if we want to handle data in term of stream either from the file or from the network..
        file supported form or network supported form is a byte.

        2) short :- 
        size:- 2 bytes (16 bits) rarely used datatype.
        Range:- 2E-15 to 2E15 - 1..(-32768 to 32767).
        Application:-short DT is best for 16bit processor like 8085, but this processors are completed outdated hence short also outdated datatype..

        3) int :-
        The most commanly used Datatype is int..
        size:- 4Bytes (32 bits).
        [-2147483648 to 2147483647]

        4)long:-
        Sometime int may not enough to hold big value then we should go for long time.
        eg:- distance between earth and sun..
        eg:- number of character in a big file may exceed the int range hence the return type of length method (File class) is long.
        SI
        SI
        Size:- 8 Bytes (64 bits)
        Range:- -2E63 to 2E63-1

      
        All the above datatype(byte,short,int,long) meant for representing Integral Values. if we want to represent floating point value then we should go for floating point datatypes..

        Floating Point Datatypes.
        float and double

        5)float:- 
        5 to 6 decimal point accuracy
        single precision
        size:- 4 Bytes
        range:- 3.4e38 to 3.4e38
       

        6)double:- 
        14 to 15 decimal point accuracy
        double precision
        size:- 8 Bytes.
        range:-  -1.7e38 to 1.7e38


        7)boolean 
        size:- not applicable (virtual Machine dependent)
        Range :- N.A (alloed values are true and false.)

        






        






        */ 
        byte b=10;
       System.out.println(b);

    }
}
