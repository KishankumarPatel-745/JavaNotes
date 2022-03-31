package com.javaLangpackage.scjp;

public class Java12 {
    public static void main(String[] args) {
        /*
        Relation between == operator and .equals() method.

        If two objects are equals by == operator then this objects are always equal by .equals().

        means
        if r1==r2 is true then r1.equals(r2) is always true.

        If two objects are not equals by == operator then we cannot conclude anything about .equals().It may return true or false.

        if r1==r2 is false then r1.equals(r2) may return true or false.and we cannot except exactly.

        If two Objects are equals by .equals() then we cannot conclude anything about == operator.
        It may returns true or false.
        
        If two objects are not equals by .equals() then this objects always not equals by == operator.

        means
        if r1.equals(r2) is false,then r1==r2  is always false.
        
        Differences between == operator and .equals() method.

        To use == operator,compulsory there should be some be relation between argument types,either child to parent ,parent to child or same type.
        Otherwise we will get CTE saying incomparable types.

        If there is no relation between argument types then .equals() won't raise any compile time or runtime error.Simply it returns false.

        eg.
        String s1=new String("durga");
        String s2=new String("durga");
        StringBuffer sb1=new StringBuffer("durga");
        StringBuffer sb2=new StringBuffer("durga");
        SOP(s1==s2); false
        SOP(s1.equals(s2)); true
        SOP(sb1==sb2); false
        SOP(sb1.equals(sb2)); false
        SOP(s1==sb1); CTE incomparable type
        SOP(s1.equals(sb1)); false


        == operator and .equals() method

        It is an operator in java applicable for both primitives and Object types.

        It is a method applicable only for object types but not for primitive.

        In the case of Object references == operator meant for reference comparison(address comparison).

        Bydefault .equals() in Object class also meant for reference comparison.

        We cannot operride for content comparison.

        we can override .equals() for content comparison.

        To use == operator compulsory there should be some relation between argument types either child to parent,parent to child or same type. otherwise we ill get CTE saying incomparable type

        If there is no relation between argument types then .equals() won't raise any CTE or RTE and simply returns false.

        Answer in ONe line.

        In general we can use == operator for reference comparison. and .equals() for content comparison.

        NOte:
        for any object reference r 

        r==null
        r.equals(null) 
        always returns false.

        eg.
        Thread t=new Thread();
        SOP(t==null); false
        SOP(t.equals(null)); false

        Hashing related DS follow the following fundamental rule 

        1,
        Equivalent Object should be placed in same backet but all object present in the same backet need not be equal.


        Contract between hashcode and .equals() method.

        1,
        If two objects are equal by .equals() then there hashcode must be equal.
        That's two equavalent Object should have same hashcode.
        
        if r1.equals(r2) is true then r1.hashcode() ==r2.hashcode() is always true.

        Object class .equals() and hashcode() follows above construct.Hence whenever we are overriding .equals() compulsory we should override hashcode() to satisfied above construct.
        That is two equivalent should have same hashcode.


        If two objects are not equal by .equals() then there is no restriction on hashcodes maybe equal or may not be equal.

        IF hashcode of two objects are equal then we cannot conclude anything about .equals().
        It may return true or false.

        if hashcode of two objects are not equal then this objects are always not equal by .equals().

        NOTE.

        To satisfy construct between equals and hashcode method, whenever we are overriding .equals() compulsory we have to override hashcode() method.
        Otherwise we won't get any CTE and RTE.
        But it is not a good programming practise.


        In String class, .equals() method is overridden for content comparison, hense hashcode() is also overridden to generate hashcode based on content.

        eg.
        String s1=new String("durga");
        String s2=new String("durga");
        SOP(s1.equals(s2)); true
        SOP(s1.hashcode()); 9596001
        SOP(s2.hashcode()); 9596001


        In StringBuffer, .equals() method is not overridden for content comparison.Hence hashcode() is also not overridden.

        eg.
        StringBuffer sb1=new StringBuffer("durga");

        StringBuffer sb2=new StringBuffer("durga");

        SOP(sb1.equals(sb2)); false

        SOP(sb1.hashcode()); 1923121
        SOP(sb2.hashcode()); 2131221

        Consider the following Person class.

        class Person{
            public boolean equals(Object obj){
                if (obj instanceof Person){
                    Person p=(Person)obj;
                    if(name.equals(p.name) && age==p.age){
                        return true;
                    }else{
                        return false;
                    }
                return false;
                }
            }
        }

        Which of the following hashcode() is appropriate for Person class.

        1,
        public int hashcode(){
            return 100;
        } invalid

        2,
        public int hashcode(){
            return age+SINNumber;
        } invalid

        3,
        public int hashcode(){
            return name.hashCode()+age;
        } Valid

        4,
        NO restriction
        Invalid

        NOte>
        Based on which parameter, we override .equals() it is highly recommoended to use some parameter while overriding hashcode() also.

        NOte.
        In all collection classes,all wrapper classes and in String class equals() is overridden for content comparison hence it is highly recommoened to override .equals() to override in our class also to content comparison.
        







        
        
        */
    }
}
