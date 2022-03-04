package com.operatorAndAssignment.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        The only overloaded operator in java is Plus operator. sometimes it acts as Arithmatic Addition operator and sometime it acts as String Concatenation Operator.

        If atleast one argument is string type then plus operator operator acts as concatenation operator.and If both arguments are number type then plus operator acts as arithmatic addition operator.

        eg
        String a="kishan";
        int b=10,c=20,d=17;
        sop(a+b+c+d); kishan102030
        sop(b+c+d+A); 47kishan
        sop(b+c+a+d); 30kishan17

        Relational Operator..(<,<=,>,>=)
        we can apply relational operator for every primitive type except boolean.

        sop(10<20);true
        sop('a'<20);false
        sop('a'<20.9);false
        sop(true<false);CTE operator > cannot be applied to boolean,boolean

        We cannot apply relational operator for object types.
        sop("durga123">"durga");
        CTE: Operator > cannot be applied to Java.lang.String,Java.lang.String..

        sop
        
    
        
        Nesting of relational Operator is not allowed otherwise we will get CTE.

        sop(10<20<30)
        sop(true<30)//operator < cannot be applied to boolean,int.

        EQUALITY Operator..(==,!=)

        we can apply equality operator for every primitive type including boolean type also.
        sop(10==20); false
        sop('a'=='b'); false
        sop('a'==97.0); true    
        sop(false==false); true

        Equality Operator
        we can apply equality operator for objetc type also. For Object references r1,r2.
        r1==r2 true if both references are pointing to same object(reference comparison/ address comparison).

        if we apply equality operator for object type then compulsory there should be some relation between argument types(either parent-child, child-parent, some types).Otherwise we will get compile time error saying incomparable type:java.lang.String and java.lang.Thread

        Thread t=new Thread();
        Object o=new Object();
        String s= new String("Kisah");
        sop(t==o);Valid
        sop(t==s);Invalid CTE:Incomparable type

        Different between == and .equals() method.

        In General,we can use double equal operator for reference comparison and .equals() for content comparison.

        eg.
        String s1=new String("kishan");
        String s2=new String("kishan");
        sop(s1==s2);//false
        sop(s1.equals(s2));//true

        NOTE:
        For any object reference r
        r==null is always false, but null==null is always true.

        









        */
    }
}
