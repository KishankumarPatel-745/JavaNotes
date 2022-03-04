package com.operatorAndAssignment.scjp;

/**
 * Java06
 */
public class Java06 {
    public static void main(String[] args) {
        /*
        Operator Precedence.
        1,Unary Operator
        [],x++,x--
        ++x,--x,~,!
        new,<type>

        2,Arithmetic Operators
        *,/,%
        +,-

        3,shift operator
        >>,>>>,<<

        4,comparison operator,
        <,<=,>,>=,instanceof

        5,equality operators,
        ==,!=

        6,Bitwise Operators,
        & bitwise and 
        ^ bitwise X-OR
        | bitwise or

        7,short circuit operators
        && logical AND
        || Logical Or
        
        8,conditional operator
        ? :

        9,Assignment Operators
        =,+=,-=,*=....

        Evaluation Order of Java Operand:

        In Java, we have only operator precedence but not oparand precedence. Before applying any operator all operand will be evaluated from left to right.
        eg.
        class Test{
            public static void main(String[] args){
                sop(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6))
            }
            public static int m1(int i){
                sop(i);
                return i;
            }
        }
        output
        1
        2
        3
        4
        5
        6
        32


        
        */
    }

    
}