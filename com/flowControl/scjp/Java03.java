package com.flowControl.scjp;

public class Java03 {
    public static void main(String[] args) {
        /*
        If several options are availble then it is not recommanded to use nested if-else, because it reduces readability. To handle this requirement we should go for switch statement.

        syntax:

        switch(x){
            case 1:
                action-1;
                break;
            case 2:
                action-2;
                break;
                .....
                .....
            case n:
                action-n;
                break;
            default:
                default action;
        }


        Loopholes...
        allowed types for x 
        The allowed argument types for the switch statements are byte,short,char,int until 1.4 version.
        But from 1.5V onwards corresponding wrapper classes and Enum also allowed.

        from 1.7 Version onwards,String type also allowed.

        allowed values.

        byte,short,char,int

        Byte,Short,Character,Interger, Enum.

        String.

        2, curly braces are mandatory except switch everywhere curly braces are optional.

        3, Both case and default are optional,means an empty switch statement is valid Java statement.
        eg
        switch(x){

        }
        Valid Java Statement.

        4, Inside switch, every statement should be under some case or default. that is independent statements are not allowed inside switch otherwise we will get compile time error.
        eg.
        int x=10;
        switch(x){
            sop("Hello");
        }

        5,Every case label should be compile time constant,means constant expression.
        eg.
        int x=10;
        int y=20;
        switch(x){
            case 10:
                sop(10);
                break;

            case y:
                SOP(20);
                break;
            
            CTE:constant expression required.
        }
        if we declare y as final then we wont get any compile time error.

        6,
        Both switch argument and case label can be expressions but case label should be constant expression.
        eg.
        int x=10;
        switch(x+1){
            case 10:
                sop("10");
                break;
            case 10+20+20:
                sop("60");
        }

        7,Every case label should be in the range of switch argument type, otherwise we will get compile time error.
        eg.
        byte b=10;
        switch(b){
            case 10:
            case 100:
            case 1000:
        }
        CTE: Possible loss of precision.
        found:int
        required:byte

        eg01.
        byte b=10;
        //Converted into int 
        //max(int,type of a,type of b)
        switch(b+1){
            case 10:
            case 100:
            case 1000:
        }
        Valid

        eg.
        byte b=10;

        8,Duplicate case labels are not allowed.Otherwise we will get the Compiler time error

        int x=10;
        switch(x){
            case 97:    
                sop(97);
                break:
            case 98:    
                sop(98);
                break:
            case 'a':    
                sop(97);
                break:
        }
        CTE:duplicate case label

        case label:-
        It should be constant expression

        The value should be in the range of switch argument type.

        Duplicate case labels are not allowed.

        Flow-through inside a switch.
        eg.
        with-in the switch if any case is matched, from that case onward all statement will be executed untill break or end of the switch.
        These is called fall-through inside a switch.

        The main advantage of fall-through inside a switch is we can define common action for maltiple cases(code reusability).

        eg.
        switch(x){
            case 1:
            case 2:
            case 3:
                sop("Q-4");
                break;

            case 4:
            case 5:
            case 6:
                sop("Q-1");
                break;
        }

        Within the switch, we can take default case atmost once.
        Default case will be executed only if there is no other  case matched.

        Within the switch, we can write default case anywhere but it is recommoended to write as last case.

        eg.
        switch(x){
            default:
                SOP("def");

            case 0:
                SOP(0);
                break;

            case 1:
                SOP(1);

            case 2:
                SOP(2);
            
        }

        x=0   o/p 0
        x=1   o/p 1 2
        x=2  o/p 2
        x=3  o/p def 0
        





        */
    }
}
