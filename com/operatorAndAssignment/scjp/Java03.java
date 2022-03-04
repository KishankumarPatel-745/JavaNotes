package com.operatorAndAssignment.scjp;

public class Java03 {
    public static void main(String[] args) {
        //instanceof operators
        //Bitwise Operators

        /*
        instanceof
        we can use instanceof operator to check whether a given object is of particular type or not.

        Object o=l.get(0);
        if(o instanceof Student){
            Student s=(Student)o;
            //perform Student specific Functionality.
        }

        r instanceof X
        r:- r object reference
        X:-class or interface name.
        

        eg
        Thread t=new Thread(); 
        sop(t instanceof Thread); true
        sop(t instanceof Object);true
        sop(t instanceof Runnable);true
        

        To use instanceof Operator Compulsory there should be some relation between argument types(either child to parent, parent to child , same type).
        otherwise we will get below error.

        sop(t instanceof String); CTE inconvertible types.

        Note 
        any class or interface x .
        null instanceof x is always false.

        sop(null instanceof Thread)//false
        sop(null instanceof Runnable)//false

        BITWISE OPERATOR.(&,|,^)

        and(&)==> return true if both arguments are true.

        or(|)==> return true if one of the argument return true.

        X-OR(^)==>return true if both arguments are different.

        eg
        sop(true & false)==>false
        sop(true | false)==>true
        sop(true ^ false)==>true

        we can apply this operator for integral type also.
        eg.
        sop(4&5);4
        sop(4|5);5
        sop(4^5);1


        Bitwise Complement operator(~):

        we can apply this operator only for integral types but not for boolean type, if we are trying to apply for boolean type then we will get CTE :-
        eg
        sop(~true);CTE operator ~ cannot be applied to boolean.

        sop(~4); //-5

        The most significant bit acts as sign bit.0 means positive number. 1 means negative number.
        positive number will be represented directly in memory while negative number will be represented indirectly in memory in 2's compliment form.


        boolean Compliment Operator.
        (!)
        sop(!4);
        CTE :- operator ! cannot be applied to int.

        sop(!false);//true.

        we can apply this operator only for boolean types but not for integral types.
        eg
        sop(!4);
        CTE :- operator ! cannot be applied to int.

        sop(!false);//true.

        &,|,^ ==> Applicable for both integral and boolean type

        ~ ==> Applicable only for integral types but not for boolean type.

        ! ==> Applicable only for boolean types but not for integral type.

        











        */
        System.out.println(~4);//-5
        //2's compliment form..

    }

}
